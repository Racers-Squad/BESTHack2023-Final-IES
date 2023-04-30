package client;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            TcpNioClient client = new TcpNioClient();
            client.begin();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
