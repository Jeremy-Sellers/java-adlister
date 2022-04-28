<%--
  Created by IntelliJ IDEA.
  User: jeremysellers
  Date: 4/27/22
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<%--Form sends a REQUEST due to POST method--%>
    <h1>Hi there, what's your name?</h1>
<%--action references what url is being attatched to in related Servlet.jsp--%>
    <form method="post" action="hello">

        <label for="name">Name:</label>
        <input type="text" name="HTMLname" id="name">

        <button type="submit">Submit</button>
    </form>
<%----%>

<%--if name doesn't equal null, displays paragraph with "Hello there, *whatever name entered in form*" --%>
<c:if test="${HTMLname != null}">
    <p>Hello there, ${HTMLname}</p>
</c:if>
</body>
</html>
