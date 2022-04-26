<%--
  Created by IntelliJ IDEA.
  User: jeremysellers
  Date: 4/26/22
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {//is request a post request
        String userName = request.getParameter("username");//set username variable to users username input
        String passWord = request.getParameter("password");//set password variable to users password input
        if (userName.equals("admin") && passWord.equals("password")){
            response.sendRedirect("profile.jsp");
        }
        else{

            response.sendRedirect("login.jsp");
        }
    }




%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login</h1>
<form method="POST">
    <label for="username">Username</label>
    <input id="username" type="text" name="username" placeholder="Enter username">
    <br>
    <label for="password">Password</label>
    <input id="password" type="password" name="password" placeholder="enter password">
    <br>
    <button>Submit</button>
</form>
</body>
</html>
