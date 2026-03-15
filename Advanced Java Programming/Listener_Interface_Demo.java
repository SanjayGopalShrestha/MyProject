/*

To Run
======
In XAMPP Control Panel: 
Apache Start
MySQL Start

Download: jdbc\mysql-connector-j-9.5.0.jar and Save it in C:\

E:\jtest>javac Main.java

E:\jtest>java -cp ".;C:\jdbc\mysql-connector-j-9.5.0\mysql-connector-j-9.5.0.jar" Main

Output
======
Shows the Interface: Type Mr. A, Click OK
Mr. A
Connection Successful!

*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;


public class Main
{
public static void main(String[] arg)
{
JFrame f = new JFrame("Scalable v1.0");

JButton b = new JButton("OK");
JTextField t = new JTextField(15);
JButton c = new JButton("Cancel");
JLabel l = new JLabel("Username:");

GroupLayout x = new GroupLayout(f.getContentPane());
f.getContentPane().setLayout(x);

x.setAutoCreateGaps(true);
x.setAutoCreateContainerGaps(true);

x.setHorizontalGroup(
x.createSequentialGroup()

.addGroup(
x.createParallelGroup(GroupLayout.Alignment.LEADING)
.addComponent(l)
.addComponent(b)
)

.addGroup(
x.createParallelGroup(GroupLayout.Alignment.LEADING)
.addComponent(t)
.addComponent(c)
)
);


x.setVerticalGroup(
x.createSequentialGroup()

.addGroup(
x.createParallelGroup(GroupLayout.Alignment.BASELINE)
.addComponent(l)
.addComponent(t)
)

.addGroup(
x.createParallelGroup(GroupLayout.Alignment.BASELINE)
.addComponent(b)
.addComponent(c)
)
);


t.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
String x = t.getText();
System.out.println(x);

String url = "jdbc:mysql://localhost:3306";
String user = "root";
String password = "";

try {
Connection conn = DriverManager.getConnection(url, user, password);
System.out.println("Connection Successful!");

 Statement stmt1 = conn.createStatement();
 String a1 = "create database College_Lawrence;";
 stmt1.executeUpdate(a1);

Statement stmt2 = conn.createStatement();
 String a2 = "use College_Lawrence;";
 stmt2.executeUpdate(a2);


 Statement stmt3 = conn.createStatement();
 String a3 ="create table student (Roll integer, Name varchar(15));";
 stmt3.executeUpdate(a3);

 Statement stmt4 = conn.createStatement();
 String a4 = "insert into student (Roll, Name) values(1,'A'),(2,'B'),(3,'C');";
 stmt4.executeUpdate(a4);

 Statement stmt5 = conn.createStatement();
 String y1 ="select * from student where Roll>1;";
 ResultSet a6 = stmt5.executeQuery(y1);
 while (a6.next())
 {
   System.out.println(a6.getInt("Roll")+"   "+a6.getString("Name"));
 }
 
 /* or you can replace with below statement for above statement
 PreparedStatement stmt5 = conn.prepareStatement("select * from student where Roll>1;");
 ResultSet a6 = stmt5.executeQuery();
 while (a6.next())
  {
   System.out.println(a6.getInt("Roll")+"   "+a6.getString("Name"));
  }
 */


 /*
Statement stmt5 = conn.createStatement();
            String y1 = "SELECT * FROM student WHERE Roll > 1;";
            ResultSet a6 = stmt5.executeQuery(y1);

            // Get metadata of ResultSet
            ResultSetMetaData rsmd = a6.getMetaData();
            int columnCount = rsmd.getColumnCount(); // total number of columns

            while (a6.next()) {
                for (int i = 1; i <= columnCount; i++) { // JDBC columns start at 1
                    System.out.print(a6.getString(i) + "\t"); // get value dynamically
                }
                System.out.println(); // new row
            }
*/

 
 conn.close();
}
catch(SQLException p)
{
System.out.println("Connection Failed!");
p.printStackTrace();
}

}
});

/*
 t.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e)
 {
 String p = t.getText();
 System.out.println(p);
 }
 });
*/   
                      

c.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
t.setText("");
}
});


f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
f.dispose();
}
});


f.pack();
//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
}
}



 













