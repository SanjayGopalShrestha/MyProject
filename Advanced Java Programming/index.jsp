/*

Both index.jsp and one.jsp have to be in C:\tomcat\webapps\YourApp folder
apache-tomcat-9.0.113/
 └── webapps/
      └── YourApp/
           ├── index.jsp
           └── one.jsp

*/

<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Simple JSP Form</title>
</head>
<body>
<h2>Enter Your Details</h2>

<form action="one.jsp" method="post">
    Name: <input type="text" name="name"><br><br>
    Age: <input type="text" name="age"><br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
