<%--
  Created by IntelliJ IDEA.
  User: mishaabaiev
  Date: 18.12.2022
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/greetings" method="post">
    <label>Input login</label>
    <input type="text" placeholder="input name" name="user_login"><br>

    <label>Input password</label>
    <input type="password" placeholder="input password" name="user_password"><br>

    <input type="submit" value="login">
</form>

<h1>${message}</h1>

</body>
</html>
