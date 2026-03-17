// Sender 

import java.net.*;

public class DatagramClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        String msg = "Hello Server";
        byte[] buffer = msg.getBytes();

        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 9876);

        socket.send(packet);
        System.out.println("Message sent");
        socket.close();
    }
}

