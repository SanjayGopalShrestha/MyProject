/*

Both index.jsp and one.jsp have to be in C:\tomcat\webapps\YourApp folder
apache-tomcat-9.0.113/
 └── webapps/
      └── YourApp/
           ├── index.jsp
           └── one.jsp

NOTE: In servlet the files (.java and .class) have to be in different folder but here index.jsp and one.jsp both
have to be exactly on same folder "YourApp", not in YourApp/src/com/example/Rough1.java and YourApp/WEB-INF/classes/com/
example/Rough1.class as in servlet.

To Run
======
- Open a Browser
- Type: //localhost:8080/YourApp and hit enter
- index.jsp will open with a form, type the values like Name: Mr.A, Age: 25
- It will show Name: Mr.A and Age: 25 with Go Back link

*/


// index.jsp
// =========

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


/*
// one.jsp
// =======

<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<html>
<head>
    <title>Form Output</title>
</head>
<body>

<h2>Form Data Submitted:</h2>

<%
    // Read form parameters
    String name = request.getParameter("name");
    String age = request.getParameter("age");

    if(name != null && age != null && !name.isEmpty() && !age.isEmpty()){
        out.println("Name: " + name + "<br>");
        out.println("Age: " + age + "<br>");
    } else {
        out.println("Please enter both Name and Age!");
    }
%>

<br>
<a href="index.jsp">Go Back</a>

</body>
</html>
*/

