/*
Download APIs:
- javax.activation.jar
- javax.mail.jar 
Copy them in your project folder and Compile and Run as below:
E:\jtest>javac -cp ".;javax.mail.jar;javax.activation.jar" Rough.java
E:\jtest>java -cp ".;javax.mail.jar;javax.activation.jar" Rough  



*/

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class Send_Email {
    public static void main(String[] args) throws Exception {

        String from = "mr.sanjayshrestha@gmail.com";
        String password = "kiwh wvif ixbz bccl";  // Must be App Password if 2FA enabled
        String to = "mr.sanjayshrestha@gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(to));
        message.setSubject("Test Email");
        message.setText("Hello, this is a test email from JavaMail!");

        Transport.send(message);

        System.out.println("Email sent successfully!");
    }
}
