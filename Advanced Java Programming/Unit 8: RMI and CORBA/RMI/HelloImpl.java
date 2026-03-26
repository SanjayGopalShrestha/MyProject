// 2. Implement the Remote Object (HelloImpl.java)

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
