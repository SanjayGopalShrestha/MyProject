/* 

Note:
=====
1. XAMPP MySQL should be on
2. mysql-connector-j-9.5.0 or mysql-connector-j-9.6.0 should be in "C:\tomcat\apache-tomcat-9.0.113\lib" 
3. To Run
   ======
   C:\tomcat\apache-tomcat-9.0.113\webapps\YourApp\src\com\example>javac -cp ".;C:\tomcat\apache-tomcat-9.0.113\lib\Servlet-api.jar" Servlet_Database.java

*/

package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.sql.*;

@WebServlet("/Servlet_Database")  
public class Servlet_Database extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("Hello from Servlet");

String url = "jdbc:mysql://localhost:3306";
String user = "root";
String password ="";

try
{
Connection conn = DriverManager.getConnection(url, user, password);
System.out.println("Connected Successfully with MySQL Database Server!");
conn.close();
}
catch(SQLException d)
{
System.out.println("Connection Failed!");
d.printStackTrace();
}

    }
}
