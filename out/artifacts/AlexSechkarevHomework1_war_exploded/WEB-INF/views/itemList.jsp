<%--
  Created by IntelliJ IDEA.
  User: alexey
  Date: 27.04.2018
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="item">
    <table>
        <c:forEach var="element" items="${list}">
            <tr>
                <%--<td>${element.id}</td>--%>
                <td>${element.name}</td>

                <td><input type="checkbox" name="itemValue" value="${element.id}"></td>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="Оформить заказ"></td>
</form>
<%--${order.id}--%>

</body>
</html>
