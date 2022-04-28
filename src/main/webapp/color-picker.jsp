<%--
  Created by IntelliJ IDEA.
  User: jeremysellers
  Date: 4/27/22
  Time: 9:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Color-Picker</title>
</head>
<body>
<%--Form action must match urlPatterns in PickColorServlet urlPattern--%>
<%--from action chooses what logic to reference usiong data given by user--%>
<%--Step 1--%>
<form action="/pickcolor" method="post">
<%--Form to ask user for a color and submit resulting color--%>
    <label for="color">Choose a color:</label>

    <input type="text" name="color" id="color">

    <input type="submit" value="Submit color">
</form>
</body>
</html>
