/*

Database Connectivity
=====================
Java-MySQL Connectivity
DDL - create, alter, drop, rename, change, use, show
DML - select, insert, update, delete

Statement
PreparedStatement
ResultSet
ResultSetMetaData
ResultSet Contants: 
ResultSet.TYPE_FORWARD_ONLY, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.TYPE_SCROLL_SENSITIVE
ResultSet.CONCUR_READ_ONLY, ResultSet.CONCUR_UPDATABLE
*/


import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Scrollable_Updateable_ResultSet
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

System.out.println("**********************************");


Statement stmt1 = conn.createStatement();
String sql1 = "show databases;";
ResultSet rs1 = stmt1.executeQuery(sql1);

while(rs1.next())
{
System.out.println(rs1.getString(1));
}


System.out.println("**********************************");

/*
Statement stmt2 = conn.createStatement();
String sql2 = "create database employee;";
stmt2.executeUpdate(sql2);
*/

Statement stmt3 = conn.createStatement();
String sql3 = "use employee;";
stmt3.executeUpdate(sql3);

/*
Statement stmt4 = conn.createStatement();
String sql4 = "create table employee (empid integer, empname varchar(15));";
stmt4.executeUpdate(sql4);

Statement stmt5 = conn.createStatement();
String sql5 = "insert into employee (empid, empname) values(1,'A'), (2,'B'), (3,'C');";
stmt5.executeUpdate(sql5);
*/

System.out.println("**********************************");


/*
Statement stmt101 = conn.createStatement();
String sql101 = "ALTER TABLE employee RENAME TO employee1;";
stmt101.executeUpdate(sql101);
System.out.println("Successfully rename the table *employee* to *employee1*");

System.out.println("**********************************");
*/


Statement stmt6 = conn.createStatement();
String sql6 = "select * from employee1 where empid>1;";

ResultSet rs6 = stmt6.executeQuery(sql6);

while(rs6.next())
{
System.out.println(rs6.getString(1));
}

System.out.println("Query Successful!");


/*
System.out.println("**********************************");

Statement stmt7 = conn.createStatement();
String sql7 = "update employee1 set empid=17 where empid=1;";
stmt6.executeUpdate(sql7);
System.out.println("Successfully Updated!");
*/



System.out.println("**********************************");




Statement stmt11 = conn.createStatement(
ResultSet.TYPE_SCROLL_INSENSITIVE,
ResultSet.CONCUR_READ_ONLY);
String sql11 ="show databases;";

ResultSet rs = stmt11.executeQuery(sql11);

rs.last();
System.out.println(rs.getString(1));

rs.first();
System.out.println(rs.getString(1));

rs.absolute(3);
System.out.println(rs.getString(1));

rs.previous();
System.out.println(rs.getString(1));

System.out.println("ResultSet.TYPE_SCROLL_INSENSITIVE successfully!");


System.out.println("**********************************");


Statement stmt12 = conn.createStatement(
    ResultSet.TYPE_SCROLL_INSENSITIVE, // scrollable
    ResultSet.CONCUR_UPDATABLE          // updatable
);



ResultSet rs2 = stmt12.executeQuery("SELECT * FROM employee1 where empid=21;");

System.out.println("***");

/*

// Move to first row
if(rs2.next()) {
    rs2.updateInt("empid", 21);  	// change empid
    rs2.updateString("empname", "T");   // change name
    rs2.updateRow();                    // apply changes to database
}


//Insert a new row
rs2.moveToInsertRow();
rs2.updateInt("empid", 4);
rs2.updateString("empname", "Y");
rs2.insertRow();
*/


//Delete a row
if(rs2.next()) {
    rs2.deleteRow();  // deletes current row from DB
}


System.out.println("UPDATEABLE Successful!");

System.out.println("**********************************");

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
