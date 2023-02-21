<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HelpPage</title>
</head>
<body>
	<h1>Welcome to Help Page</h1>
	<h2>${desc}</h2>
	<hr>
	<h3>Help Categories</h3>
	<c:forEach var="item" items="${categories}">
		<br><i><c:out value="${item}" /></i>
	</c:forEach>
</body>
</html>