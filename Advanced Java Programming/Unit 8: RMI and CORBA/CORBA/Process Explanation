1. IDL File

Hello.idl

interface Hello {
    string sayHello();
};
Defines a single remote method.

  
2. Generate Java Stubs

Run in the folder where Hello.idl is:

idlj -fall Hello.idl

Generates all necessary Java stub/skeleton files in HelloApp folder.


3. Server Implementation

HelloImpl.java

import HelloApp.*;

public class HelloImpl extends HelloPOA {
    public String sayHello() {
        return "Hello CORBA!";
    }
}

Server.java

import HelloApp.*;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.PortableServer.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ORB orb = ORB.init(args, null);
        POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
        rootpoa.the_POAManager().activate();

        HelloImpl hello = new HelloImpl();
        Hello href = HelloHelper.narrow(rootpoa.servant_to_reference(hello));

        NamingContextExt ncRef = NamingContextExtHelper.narrow(
            orb.resolve_initial_references("NameService"));
        ncRef.rebind(ncRef.to_name("Hello"), href);

        System.out.println("Server ready...");
        orb.run();
    }
}


4. Client

Client.java

import HelloApp.*;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;

public class Client {
    public static void main(String[] args) throws Exception {
        ORB orb = ORB.init(args, null);
        NamingContextExt ncRef = NamingContextExtHelper.narrow(
            orb.resolve_initial_references("NameService"));

        Hello hello = HelloHelper.narrow(ncRef.resolve_str("Hello"));
        System.out.println(hello.sayHello());
    }
}


5. How to Run
Start Name Service:
orbd -ORBInitialPort 1050

Compile all Java files:
javac *.java

Run the Server:
java Server -ORBInitialPort 1050

Run the Client (new terminal):
java Client -ORBInitialPort 1050

Output:
Hello CORBA!


Most Simplest
=============
Minimal IDL (1 method only)
1 server class, 1 client class
No extra classes or complex setup
Demonstrates basic remote method invocation
