<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Юнир
  Date: 25.10.2023
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Add affair</h2>
<br>
<br>
<form:form action="save" modelAttribute="Afaf">
    <form:hidden path="id"/>
    title <form:input path="title"></form:input>
    <br>
    <br>
    description <form:input path="description"></form:input>
    <br>
    <br>
    priority <form:input path="priority"></form:input>
    <br>
    <br>
    date <form:input type="date" path="date"/>
    <br>
    <br>
    <input type="submit" value="ok">
</form:form>
<br>
<br>

</body>
</html>
