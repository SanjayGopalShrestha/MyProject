/*
Download:
- javax.activation.jar
- javax.mail.jar 
Copy them in your project folder and Compile and Run as below:
E:\jtest>javac -cp ".;javax.mail.jar;javax.activation.jar" Rough.java
E:\jtest>java -cp ".;javax.mail.jar;javax.activation.jar" Rough  
*/

import javax.mail.*;
import java.util.Properties;

public class Sending_and_Receiving_Email {
    public static void main(String[] args) throws Exception {
        String user = "mr.sanjayshrestha@gmail.com";
        String password = "kiwh wvif ixbz bccl"; // Or OAuth2 token

        Properties props = new Properties();
        props.put("mail.store.protocol", "imaps");

        Session session = Session.getDefaultInstance(props, null);
        Store store = session.getStore("imaps");
        store.connect("imap.gmail.com", user, password);

        Folder inbox = store.getFolder("INBOX");
        inbox.open(Folder.READ_ONLY);

        Message[] messages = inbox.getMessages();
        System.out.println("Total Messages: " + messages.length);

        for (int i = 0; i < Math.min(messages.length, 10); i++) {
            Message message = messages[i];
            System.out.println("---------------------------------");
            System.out.println("Email #" + (i + 1));
            System.out.println("Subject: " + message.getSubject());
            System.out.println("From: " + message.getFrom()[0]);
            System.out.println("Text: " + message.getContent().toString());
        }

        inbox.close(false);
        store.close();
    }
}
