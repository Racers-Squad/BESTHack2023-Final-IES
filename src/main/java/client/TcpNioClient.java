package client;

import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
import com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto;

import java.io.IOException;

import static com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.CommandType.ctExecCommand;
import static com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.CommandType.ctStatus;

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
        if (receivedMessage.getResponse().getAnswerType() == MessageEnumsProto.AnswerType.atAnswerOK){
            System.out.println("Handshake privEEEEt");
            waitForCommand();
        } else {
            connection.close();
        }
    }

    private void createThread(ExchangeInfoMessage receivedMessage) {
//        if (users.get(receivedMessage.getHeader().getMessageNum()))
        if (commandThread != null){
            commandThread.interrupt();
        }
        commandThread = new Thread(new CommandExecutor(receivedMessage.getHeader().getSender(), generator.getIdByAlias(receivedMessage), generator, connection));
        commandThread.start();
    }

    public void waitForCommand(){
        while (true){
            ExchangeInfoMessage receivedMessage;
            try {
                receivedMessage = connection.receive();
                if (receivedMessage.getRequest().getCommand() == ctStatus){
                    connection.send(generator.generateResponse(receivedMessage));
                    if (generator.getMode() == 1) {
                        createThread(receivedMessage);
                    }
                } else if (receivedMessage.getRequest().getCommand() == ctExecCommand){
                    createThread(receivedMessage);
                }
            } catch (ClassNotFoundException exception){
                continue;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
