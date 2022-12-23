<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Database</title>
</head>
<body>
<table align="center" border="1" width="500px">
    <thead>

    <tr>
        <th>Name</th>
        <th>Login</th>
    </tr>

    </thead>
    <tbody>

    <c:forEach items="${listUsers}" var="users">
        <tr>
            <td>${users.name}</td>
            <td>${users.login}</td>
        </tr>
    </c:forEach>

    </tbody>

    <h1><a href="/greetings">back</a></h1>
</table>
</body>
</html>