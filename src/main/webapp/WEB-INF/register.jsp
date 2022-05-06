<%--
  Created by IntelliJ IDEA.
  User: jeremysellers
  Date: 5/5/22
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>

<c:if test="${errors}">
    <h3>Error creating account</h3>
</c:if>

<form action="/register" method="post">
    <label for="username">Username</label>
    <input id="username" type="text" name="username" placeholder="Enter Username">
    <br>
    <label for="password">Password</label>
    <input id="password" type="password" name="password" placeholder="Enter Password">
    <br>
    <label for="email">Email</label>
    <input id="email" type="email" name="email" placeholder="Enter Email">
    <br>
    <button>Complete Registration</button>
</form>


</body>
</html>
