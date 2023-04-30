package client;

import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
import com.racerssquad.besthack2023.DTO.proto.Header;
import com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto;
import com.racerssquad.besthack2023.DTO.proto.Request;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class TcpNioClient {


    public static final String HOSTNAME = "localhost";
    public static final int PORT = Integer.parseInt(System.getenv("CLIENT_PORT"));
    public static final String SENDER = System.getenv("CLIENT_NAME");
    public static final int MODE = Integer.parseInt(System.getenv("CLIENT_MODE"));
    public static final int TIMEOUT = Integer.parseInt(System.getenv("CLIENT_TIMEOUT"));

    private Thread commandThread = null;

    private DataGenerator generator;
    private Connection connection;

    public TcpNioClient() throws IOException {
        generator = new DataGenerator(MODE, SENDER, TIMEOUT);
        connection = new Connection(HOSTNAME, PORT);
    }

    public void begin() throws IOException, ClassNotFoundException {
        connection.send(generator.getHandShakeRequest());
        ExchangeInfoMessage receivedMessage = connection.receive();
        if (receivedMessage.getResponse().getAnswerTypeValue() == 1){
            System.out.println("Handshake privEEEEt");
            waitForCommand();
        } else {
            connection.close();
        }
    }

    public void waitForCommand(){
        while (true){
            ExchangeInfoMessage receivedMessage;
            try {
                receivedMessage = connection.receive();
                if (receivedMessage.getRequest().getCommandValue() == 1){
                    connection.send(generator.generateResponse(receivedMessage));
                } else if (receivedMessage.getRequest().getCommandValue() == 2){
                    if (commandThread != null){
                        commandThread.interrupt();
                    }
                    commandThread = new Thread(new CommandExecutor(receivedMessage.getHeader().getSender(), generator.getIdByAlias(receivedMessage), generator, connection));
                    commandThread.start();
                }
            } catch (ClassNotFoundException exception){
                continue;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
