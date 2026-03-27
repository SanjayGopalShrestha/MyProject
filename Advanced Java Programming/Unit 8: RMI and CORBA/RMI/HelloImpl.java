// 2. Implement the Remote Object (HelloImpl.java)

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class HelloImpl extends UnicastRemoteObject implements Hello {

    protected HelloImpl() throws RemoteException {
        super();
    }

    public String sayHello() {
        return "Hello, world!";
    }
}
