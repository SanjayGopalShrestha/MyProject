import java.net.*;

public class DatagramServer1
{
public static void main(String[] arg) throws Exception
{
DatagramSocket socket = new DatagramSocket(9876);
byte[] buffer = new byte[1024];
System.out.println("Waiting for client...");

DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
socket.receive(packet);


String clientIP = packet.getAddress().getHostAddress();

System.out.println("Client IP: " + clientIP);

socket.close();
}
}