<%--
  Created by IntelliJ IDEA.
  User: alexey
  Date: 27.04.2018
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=Windows-1251" pageEncoding="Windows-1251" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=Windows-1251">
    <title>TestPage</title>
</head>

<body>
<form method="post" action="test">
    <%
        String n = (String)(request.getAttribute("n"));
    %>
    <%=""+n%>
    <input type="submit" value="Ћбновить"></td>
</form>
</body>

</html>
