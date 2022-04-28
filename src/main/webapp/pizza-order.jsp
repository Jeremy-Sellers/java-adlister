<%--
  Created by IntelliJ IDEA.
  User: jeremysellers
  Date: 4/27/22
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Pizza-Order</title>
</head>
<body>
    <h1>Please choose your Pizza</h1>
    <form action="/pizza-order" method="POST">
            <label for="crust">Crust:</label>
            <select name="crust" id="crust">
                <option value="Thin crust">Thin-crust</option>
                <option value="Stuffed crust">Stuffed-crust</option>
            </select>
        <br>

        <label for="sauce">Sauce:</label>
        <select name="sauce" id="sauce">
            <option value="Light">Light-Sauce</option>
            <option value="Regular">Regular-Sauce</option>
            <option value="Extra">Extra-Sauce</option>
        </select>

        <label for="size">Pizza size:</label>
        <select name="size" id="size">
            <option value="Ten inch">Ten Inch</option>
            <option value="Twelve inch">Twelve Inch</option>
            <option value="Sixteen inch">Sixteen Inch</option>
        </select>
        <br>

        <fieldset>
        <h3>Toppings</h3>
        <label for="pepperoni">Pepperoni</label>
        <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni">
        <br>
        <label for="cheese">Cheese</label>
        <input type="checkbox" id="cheese" name="toppings" value="cheese">
        <br>
        <label for="mushroom">Mushroom</label>
        <input type="checkbox" id="mushroom" name="toppings" value="mushroom">
        <br>
        </fieldset>
        <%--values will be what displays to screen when called using Expression language--%>

        <label for="address">Delivery Address:</label>
        <input type="text" name="address" id="address">

        <input type="submit" value="Submit order">
    </form>

    <h2>Your order:</h2>
    <p>Crust:${crust}</p>
    <p>Size: ${size}</p>
    <p>Sauce: ${sauce}</p>
    <p>Toppings:</p>
    <c:forEach var="topping" items="${toppings}">
        <p>${topping}</p>
    </c:forEach>
    <p>Delivery Address: ${address}</p>
</body>
</html>
