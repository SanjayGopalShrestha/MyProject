/*
In Java TCP socket programming using Transmission Control Protocol, both the client and the server can 
be senders and receivers.

TCP communication is two-way (full duplex), meaning both sides can send and receive data.

After the connection is established, both can send messages.  
*/
  
import java.net.*;
import java.io.*;

public class TCPServer {
    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server waiting for client...");

        Socket socket = server.accept();   // waits for client

        System.out.println("Client connected: " + socket.getInetAddress());
    }
}

