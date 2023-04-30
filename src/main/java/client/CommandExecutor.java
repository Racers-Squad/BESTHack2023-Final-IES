package client;

import com.racerssquad.besthack2023.DTO.proto.Event;
import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;
import com.racerssquad.besthack2023.DTO.proto.Header;
import com.racerssquad.besthack2023.DTO.proto.HeaderOrBuilder;

import java.io.IOException;

public class CommandExecutor implements Runnable{

    private final DataGenerator generator;

    private final Connection connection;

    private final int commandId;

    private String receiverId;


    public CommandExecutor(String receiverId, int commandId, DataGenerator generator, Connection connection){
        this.generator = generator;
        this.connection = connection;
        this.commandId = commandId;
        this.receiverId = receiverId;
    }
    @Override
    public void run() {
        while (true){
            try {
                Header header = Header.newBuilder().setMessageNum(generator.generateMessageNum()).setTimestamp(System.currentTimeMillis()).setSender(TcpNioClient.SENDER).setReceiver(receiverId).build();
                connection.send(ExchangeInfoMessage.newBuilder()
                            .setEvent(Event.newBuilder()
                                            .setStatus(generator.generate(commandId).getStatus())
                                    .build()).setHeader(header).build());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
