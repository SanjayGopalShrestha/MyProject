/*

To Run
======

E:\jtest>javac Rough.java

E:\jtest>java -cp ".;C:\jdbc\mysql-connector-j-9.5.0\mysql-connector-j-9.5.0.jar" Rough

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


b.addActionListener(new ActionListener()
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
conn.close();
}
catch(SQLException p)
{
System.out.println("Connection Failed!");
p.printStackTrace();
}

}
});


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



 
