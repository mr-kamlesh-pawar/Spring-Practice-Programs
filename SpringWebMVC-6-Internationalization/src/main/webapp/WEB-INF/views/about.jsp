<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>

<h1>About Us</h1>

<ul>
<li><a href="home"> Home</a></li>
<li><a href="about"> About</a></li>

</ul>

<div>

<h1>Hello, This is about us....</h1>

</div>



<footer style="position: relative;">
<ul style="margin-top: 300px">
<li><a href=?language=en> <spring:message code="eng"/></a></li>
<li><a href="?language=hn"> <spring:message code="hindi"/></a></li>

</ul>

</footer>


</body>
</html>
