<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>


<%
    String error = (String) request.getAttribute("my_error");
    if (error != null) {
%>
    <p style="color:red;"><%= error %></p>
<%
    }
%>
    
    <form action="profile" method="POST">
    
    Enter Email: <input type="email" name="email1"/>  <br>
    Enter Password: <input type="password" name="pass1"/> <br>
    <input type="submit" value="Login"/>
    
    </form>
    
</body>
</html>
