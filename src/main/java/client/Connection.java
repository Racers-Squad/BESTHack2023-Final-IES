package client;

import com.racerssquad.besthack2023.DTO.proto.ExchangeInfoMessage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Connection {

    private SocketChannel client;
    ClientUtil clientUtil = new ClientUtil();


    public Connection(String host, int port) throws IOException {
        client = SocketChannel.open();
        client.connect(new InetSocketAddress(host, port));

        System.out.println("Connected to server at " + host + ":" + port);
    }

    public void send(ExchangeInfoMessage msg) throws IOException {
        ByteBuffer buffer = ByteBuffer.wrap(clientUtil.serialize(msg));
        client.write(buffer);
    }

    public ExchangeInfoMessage receive() throws IOException, ClassNotFoundException {
        ByteBuffer buffer = ByteBuffer.allocate(50000);
        return (ExchangeInfoMessage) clientUtil.receive(client, buffer);
    }

    public void close() throws IOException {
        System.out.println("Closed Connection to server");
        client.close();
    }

}
