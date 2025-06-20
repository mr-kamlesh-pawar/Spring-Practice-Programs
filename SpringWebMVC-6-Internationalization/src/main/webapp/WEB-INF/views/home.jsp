<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>

<h1> <spring:message code="welcome_msg_home"/> </h1>

<ul>
<li><a href="home"> <spring:message code="home"/></a></li>
<li><a href="about"> <spring:message code="about"/></a></li>

</ul>

<div>

<h1><spring:message code="hello_msg"/></h1>

</div>


<footer style="position: relative;">
<ul style="margin-top: 300px">
<li><a href=?language=en> <spring:message code="eng"/></a></li>
<li><a href="?language=hn"> <spring:message code="hindi"/></a></li>

</ul>

</footer>

</body>
</html>
