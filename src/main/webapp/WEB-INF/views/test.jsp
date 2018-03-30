<%@ page language="java" contentType="text/html; charset=UTF-8"

         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false" %>

<html>

<head>

    <title>Home</title>

</head>

<body>

<h1>

    list

</h1>

<table border="1">
    <tr align="center">
        <td width="100px">v1</td>
        <td width="100px">v2</td>
        <td width="100px">v3</td>
    </tr>

    <c:forEach var="record" items="${list}">
        <tr align="center">
            <td>${record.v1}</td>
            <td>${record.v2}</td>
            <td>${record.v3}</td>
        </tr>
    </c:forEach>
</table>

</body>

</html>