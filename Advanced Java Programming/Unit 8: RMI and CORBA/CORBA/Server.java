import org.omg.CORBA.*;
import org.omg.PortableServer.*;	//POA, POAHelper
import java.util.Properties;

public class Server {
    public static void main(String[] args) {
        try {
            //Setup ORB properties before initialization
            Properties props = new Properties();
            props.put("org.omg.CORBA.ORBInitialPort", "1050");
            // Optionally specify host if needed:
            //props.put("org.omg.CORBA.ORBInitialHost", "localhost");  //Server side "localhost" not needed
            //Initialize ORB once with properties
            ORB orb = ORB.init(args, props);

            // Get Root POA and activate manager
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();

            // Create HelloImpl object
            HelloImpl helloImpl = new HelloImpl();  //HelloImpl.java implemented
	    	org.omg.CORBA.Object ref = rootpoa.servant_to_reference(helloImpl);  //Register is already done here
            
	    	String ior = orb.object_to_string(ref);
	    	System.out.println("IOR: " + ior);
			//IOR = Interoperable Object Reference
			//An IOR (Interoperable Object Reference) is:
			//A string that uniquely identifies a CORBA object and allows a client to connect to it.
			
            // Register object with ORB
            //rootpoa.activate_object(helloImpl);  //Register is already done, no need here

            System.out.println("CORBA Server is running...");

            // Wait for client requests
            orb.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
