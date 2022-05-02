<%--
  Created by IntelliJ IDEA.
  User: jeremysellers
  Date: 5/2/22
  Time: 9:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color Profile</title>
</head>
<body>
<form method="post" action="/color-profile">
  <input id="font-color" name="font-color" type="color">
  <label for="font-color">Font Color</label>
  <br>
  <input id="bg-color" name="bg-color" type="color">
  <label for="bg-color">Background Color</label>
  <br>
  <button>Submit</button>
</form>

<form action="/color-profile" method="post">
  <input type="hidden" name="forget">
  <button>Forget Color Preferences</button>
</form>

</body>
</html>
