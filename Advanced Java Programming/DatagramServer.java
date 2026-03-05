// Receiver

import java.net.*;

public class DatagramServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9876);
        byte[] buffer = new byte[1024];

        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet); // Wait for a packet

        String received = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Received: " + received);

        socket.close();
    }
}

