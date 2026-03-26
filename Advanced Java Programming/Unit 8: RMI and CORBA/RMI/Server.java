// 3. Server Code (Server.java)

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
