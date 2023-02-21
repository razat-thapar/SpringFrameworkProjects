<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage2</title>
</head>
<body>
	<h1>HomePage 2</h1>
	<h2>Contacts:</h2>
	<% 
		String admin_mail= (String)request.getAttribute("admin"); 
		String dev_mail = (String)request.getAttribute("developer");
	%>
	
	<h4>Admin : <%=admin_mail %></h4>
	<h4>Developer : <%=dev_mail %></h4>
	<h4>Request : <%=request.getRequestURL() %></h4>
</body>
</html>