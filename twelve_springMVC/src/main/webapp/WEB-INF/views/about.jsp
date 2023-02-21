<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Page</title>
</head>
<body>
	<h1>About Page</h1>
	<% String about = (String) request.getAttribute("about"); %>
	<h3>Details: </h3>
	<h4><i><%=about %></i></h4>
</body>
</html>