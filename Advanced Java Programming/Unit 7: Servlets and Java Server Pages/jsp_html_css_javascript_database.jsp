/*
Note: 
====
1. mysql-connector-9.5.0.jar should be saved in "tomcat\lib" folder
2. To run: //localhost:8080/YourApp/jsp_html_css_javascript_database.jsp
*/

<html>
<body>
    <h1><%= "Hello World" %></h1>

<br>
<br>

<script>
x=document.createElement("img");
x.setAttribute("src","1.jpg");
x.setAttribute("height","200");
x.setAttribute("width","300");
document.body.appendChild(x);
</script>

<br>
<br>


<%  

int a = 5;
int fac = 1;

for(int i=1;i<=5;i++)
{
fac = fac * i;
}

out.println("The factorial of 5 is:" + fac);

out.println("<br>");


java.util.Date now = new java.util.Date();
out.print("Current Date and Time:" + now);

out.println("<br>");

System.out.println("Hello World");

%>

<br>
<br>


<div style="position:absolute; height:200pt; width:300pt; background-color:red; left: 49pt;">
<div style="position:absolute; height:76pt; width:100pt; background-color:green; top:37pt; left:23pt;">
<img src="1.jpg" height="41" width="41">
</div>
</div>

<br>
<br>


<div style="position:absolute; height:123pt; width:150pt; background-color:lightblue; top:500pt; left: 49pt;">
<form action="one.jsp" method="post">
Name: <input type="text" name="name"><br>
Mobile: <input type="number" name="mobile"><br>
<input type="submit" value="Login">
</form>
</div>

<%
for(int i=0;i<24;i++)
{
out.println("<br>");
}
%>


<%@ page import="java.sql.*" %>

<%
String url = "jdbc:mysql://localhost:3306";
String user = "root";
String password ="";

try
{
Connection conn = DriverManager.getConnection(url, user, password);
out.println("Connected Successfully with MySQL Database Server!");
conn.close();
}

catch(SQLException d)
{
out.println("Connection Failed!");
d.printStackTrace();
}

%>

<%
for(int i=0;i<5;i++)
{
out.println("<br>");
}
%>

</body>
</html>
