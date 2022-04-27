<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: jeremysellers
  Date: 4/26/22
  Time: 3:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    ArrayList<String> foods = new ArrayList<>();
    foods.add("hotdog");
    foods.add("French fries");
    foods.add("Cheese burger");
    foods.add("pizza");
    foods.add("ramen");
    foods.add("Rice");
    foods.add("ice cream");
    foods.add("waffles");
    foods.add("banana");
    foods.add("steak");

    request.setAttribute("foods",foods);

%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Foods</h1>

<ol>
<%--ordered list of all food items--%>
    <c:forEach var="food" items="${foods}">
        <li>${food}</li>
    </c:forEach>
</ol>

<ul>
<%--Unordered list for all foods longer than 8 characters--%>
    <c:forEach var="food" items="${foods}">
        <c:if test="${food.length() > 8}">
            <li>${food}</li>
        </c:if>
    </c:forEach>
</ul>


</body>
</html>


<%--Create a file called foods.jsp.

Add scriptlet tags and define an ArrayList of strings containing 10 foods.

Include JSTL in this JSP.

Add the needed JSTL to display each food in a list item. Use an ordered list. The food list should look something like this:

1. Hot Dogs
2. Pizza
3. Nachos
...

Underneath the existing unordered list of foods, use JSTL to display the list of foods again but only food strings longer than 6 characters should be displayed. This should not require a change to the data in the
scriptlet tags (use the string length condition in the test attribute of a JSTL c:if tag).--%>