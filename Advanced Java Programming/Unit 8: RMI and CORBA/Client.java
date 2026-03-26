// 4. Client Code (Client.java)

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
