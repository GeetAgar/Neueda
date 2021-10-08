<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Balance</title>
<link rel="stylesheet" href="default.css">
</head>
<body>
<form style="text-align:center">
<h3>The available balance is:</h3>
<b>
<%
out.println(session.getAttribute("bal"));
%>
</b>
</form>
</body>
</html>