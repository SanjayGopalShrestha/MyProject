import java.lang.*;
import java.net.*;

public class UDPClient
{
public static void main(String[] arg) throws Exception
{
DatagramSocket socket = new DatagramSocket(9000);
byte[] buffer = new byte[1024];

InetAddress address = InetAddress.getByName("localhost");

DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 5001);
socket.send(packet);    //sends packet

System.out.println("Connected to server!");
}
}

