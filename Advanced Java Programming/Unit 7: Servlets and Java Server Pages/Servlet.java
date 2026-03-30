/*
- To Run: 
  @WebServlet("/Servlet") and class Servlet have to be same i.e. in both places same name "servlet", this is called servlet mapping

  Save file in C:\tomcat\apache-tomcat-9.0.113\webapps\YourApp\src\com\example\Servlet.java
  
  Compile: 
  C:\tomcat\apache-tomcat-9.0.113\webapps\YourApp\src\com\example>javac -cp "C:\tomcat\apache-tomcat-9.0.113\lib\servlet-api.jar" Servlet.java
 
- It will create Servlet.class file in C:\tomcat\apache-tomcat-9.0.113\webapps\YourApp\src\com\example\Servlet.class

- Move that Servlet.class file to C:\tomcat\apache-tomcat-9.0.113\webapps\YourApp\WEB-INF\classes\com\example\Servlet.class

- Start Tomcat (Go to C:\tomcat\apache-tomcat-9.0.113\bin\startup.bat)

- Now, open a browser, type: http://localhost:8080/YourApp/Servlet

.java and .class file locations
===============================
apache-tomcat-9.0.113/
 └── webapps/
      └── YourApp/
           ├── src/
               ├── com/
                   ├── example/  
                       ── Servlet.java

apache-tomcat-9.0.113/
 └── webapps/
      └── YourApp/
           ├── WEB-INF/
               ├── classes/
                   ├── com/  
                       ├── example/ 
                          ---Servlet.class

- If it doesn't work restart tomcast again and try
*/


package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Servlet")  
public class Servlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
     {
        PrintWriter out = response.getWriter();
        out.println("Hello from Servlet");
    }
}

