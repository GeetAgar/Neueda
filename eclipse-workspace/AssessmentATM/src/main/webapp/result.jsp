<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
<link rel="stylesheet" href="default.css">
</head>
<body>
<form action="login.jsp" style="text-align:center">
<%
		if(session.getAttribute("accno")==null)
		{
			response.sendRedirect("login.jsp");
		}
	%>
<%@ page import="java.io.*" %>
<%@ page import="java.net.*" %>
<%@ page import="java.util.*" %>

<% String str[] = (String[]) request.getAttribute("arr"); %>
<%= str[0] %>
	<br>
	<%= str[1] %>
	<br>
	<%= str[2] %>
	<br>
	<%= str[3] %>
	<br>
	<button type="submit">Logout</button>
</form>
</body>
</html>