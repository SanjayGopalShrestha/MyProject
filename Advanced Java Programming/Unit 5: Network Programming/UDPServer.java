/*

Classes:
=======
DatagramSocket - Create socket, send and receive data between devices, communicate
without establishing a connection.

DatagramPacket - Holds information like data, data size, IP address, port number of sender
(another machine), information could be either data and data size only or data, data size, 
IP address, port number. It cannot be only one of them (i.e. data only) or three of them
(i.e. data, data size, IP address or port only)

InetAddress (abstract class) - The InetAddress class in Java is used to represent an IP 
address and perform network-related operations like resolving hostnames.
============

byte[] buffer = new byte[1024] - Creates a byte array named buffer with 
a size of 1024 bytes (1 KB).

*/


import java.lang.*;
import java.net.*;

public class UDPServer
{
public static void main(String[] arg) throws Exception
{
DatagramSocket socket = new DatagramSocket(5001);
byte[] buffer = new byte[1024];
System.out.println("Waiting for client...");

DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
socket.receive(packet);  //waits for client

String clientIP = packet.getAddress().getHostAddress();
System.out.println("Client Connected:" + clientIP);

}
}