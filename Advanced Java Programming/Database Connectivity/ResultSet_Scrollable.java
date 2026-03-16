import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main
{
public static void main(String[] arg)
{
JFrame f = new JFrame("Scalable v1.0");
f.setLayout(null);

JButton b = new JButton("OK");
b.setBounds(70,70,100,100);
f.add(b);

b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{

String url ="jdbc:mysql://localhost:3306";
String user="root";
String password="";

try
{
Connection conn = DriverManager.getConnection(url,user,password);
System.out.println("Connected!");

Statement stmt1 = conn.createStatement(
ResultSet.TYPE_SCROLL_INSENSITIVE,
ResultSet.CONCUR_READ_ONLY);
String sql1 ="show databases;";

ResultSet rs = stmt1.executeQuery(sql1);
rs.last();
System.out.println(rs.getString(1));

conn.close();
}
catch(SQLException e1)
{
System.out.println("Not Connected!");
}

}
});


f.setSize(400,300);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
}
}
