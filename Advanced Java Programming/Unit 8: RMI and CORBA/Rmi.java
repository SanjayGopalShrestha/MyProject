1. Create Remote Interface (Hello.java)
import java.rmi.*;

public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}
________________________________________
2. Implement the Remote Object (HelloImpl.java)
import java.rmi.*;
import java.rmi.server.*;

public class HelloImpl extends UnicastRemoteObject implements Hello {

    protected HelloImpl() throws RemoteException {
        super();
    }

    public String sayHello() {
        return "Hello from Server!";
    }
}
________________________________________
3. Server Code (Server.java)
import java.rmi.registry.*;

public class Server {
    public static void main(String[] args) {
        try {
            HelloImpl obj = new HelloImpl();

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("HelloService", obj);

            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
________________________________________
4. Client Code (Client.java)
import java.rmi.registry.*;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            Hello stub = (Hello) registry.lookup("HelloService");

            String response = stub.sayHello();
            System.out.println(response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
________________________________________
How to run
1.	Compile all files: 
javac *.java
2.	Run server: 
java Server
3.	Run client: 
java Client
