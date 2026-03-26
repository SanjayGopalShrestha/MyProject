// Create Remote Interface (Hello.java)

import java.rmi.*;

public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}
