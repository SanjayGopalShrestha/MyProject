import java.net.*;

public class DatagramClient1
{
public static void main(String[] arg) throws Exception
{
DatagramSocket socket = new DatagramSocket(9000);
String msg = "";
byte[] buffer = msg.getBytes();

InetAddress address = InetAddress.getByName("localhost");

DatagramPacket packet = new DatagramPacket(buffer,buffer.length,address,9876);
socket.send(packet);

System.out.println("Conneted to server");

socket.close();

}
}
