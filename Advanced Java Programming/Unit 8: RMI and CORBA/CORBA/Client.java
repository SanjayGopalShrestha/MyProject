import HelloApp.*;
import org.omg.CORBA.*;
import java.util.Properties;

public class Client {
    public static void main(String[] args) {
        try {
            // Setup ORB properties before initialization
            Properties props = new Properties();
            props.put("org.omg.CORBA.ORBInitialPort", "1050");
            // Optionally specify host if needed:
            props.put("org.omg.CORBA.ORBInitialHost", "localhost");  //Here "localhost" is needed
            // Initialize ORB once with properties
            ORB orb = ORB.init(args, props);

            // Using corbaloc (no naming service)
            //org.omg.CORBA.Object obj = orb.string_to_object("corbaloc:iiop:localhost:1050/Hello");
            

 			// Paste the IOR string printed by server here
            String ior = "IOR:000000000000001749444C3A48656C6C6F4170702F48656C6C6F3A312E3000000000000100000000000000EC000102000000000C3139322E3136382E312E3300D6A300000000001F353036323731313830332F00233F0107231E140A100630463814141B484C1B000000000400000003000000300000000000000025323430343A376330303A34313A373130643A6433373A646633393A653639343A393266650000D6A300000003000000300000000000000026323430343A376330303A34313A373130643A666461333A633632353A666639393A3838323000D6A30000000000000008000000004A41430000000001000000240000000000010001000000020001000F0501000100010109000000020501000100010100"; // <-- replace with actual IOR

            // Convert string back to CORBA object
            org.omg.CORBA.Object obj = orb.string_to_object(ior);

	        //ncRef.rebind(ncRef.to_name("Hello"), href);
	        Hello helloRef = HelloHelper.narrow(obj);

            String response = helloRef.sayHello();
            System.out.println("Server says: " + response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
