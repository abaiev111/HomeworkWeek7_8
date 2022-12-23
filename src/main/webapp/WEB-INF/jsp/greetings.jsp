<%@ page import="com.gmail.com.UserModel" %><%--
  Created by IntelliJ IDEA.
  User: mishaabaiev
  Date: 18.12.2022
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Greetings</title>
</head>
<body>

<h1> Hello, ${user} </h1><br>

<a href="/database">link on database</a><br><br>

<form action="/logout" method="post">
    <input type="submit" value="logout">
</form>

</body>
</html>
