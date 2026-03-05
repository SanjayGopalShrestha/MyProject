/*
Download:
- javax.activation.jar
- javax.mail.jar 
Copy them in your project folder and Compile and Run as below:
E:\jtest>javac -cp ".;javax.mail.jar;javax.activation.jar" Rough.java
E:\jtest>java -cp ".;javax.mail.jar;javax.activation.jar" Rough  
*/

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class Rough {
    public static void main(String[] args) throws Exception {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props);

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("mr.sanjayshrestha@gmail.com"));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse("mr.sanjayshrestha@gmail.com"));
        message.setSubject("Test Mail");
        message.setText("Hello from Java Mail API");

        Transport.send(message);
    }
}
