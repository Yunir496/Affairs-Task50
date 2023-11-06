<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Юнир
  Date: 10.08.2023
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Table</h2>
<br>
<br>
<table>
    <tr>
        <th>Title</th>
        <th>Description</th>
        <th>Priority</th>
        <th>Affair Date</th>
        <th>Operations</th>
    </tr>
    <c:forEach var="Aff" items="${AllAff}">
        <c:url var="updateButton" value="/update">
            <c:param name="AffId" value="${Aff.id}"/>
        </c:url>
        <c:url var="deleteButton" value="/delete">
            <c:param name="AffId" value="${Aff.id}"/>
        </c:url>
        <tr>
            <td>${Aff.title}</td>
            <td>${Aff.description}</td>
            <td>${Aff.priority}</td>
            <td>${Aff.date}</td>
            <td>
                <input type="button" value="update" onclick="window.location.href='${updateButton}'"/>
                <input type="button" value="delete" onclick="window.location.href='${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<br>
<input type="button" value="Добавить дело" onclick="window.location.href='add'"/>
</body>
</html>
