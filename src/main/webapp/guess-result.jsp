<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jeremysellers
  Date: 4/28/22
  Time: 9:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess Result</title>
</head>
<body>
<%--Step 5--%>
<%--If guess is correct display this--%>
<c:if test="${result}">
  <h2>Your guess is correct!</h2>
</c:if>

<%--If guess is incorrect display this--%>
<c:if test="${!result}">
    <h2>Your guess is incorrect!</h2>
</c:if>

</body>
</html>
