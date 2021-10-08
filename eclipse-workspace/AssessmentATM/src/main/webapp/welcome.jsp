<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome User</title>
<link rel="stylesheet" href="default.css">
</head>
<body>
	<%
		if(session.getAttribute("accno")==null)
		{
			response.sendRedirect("login.jsp");
		}
	//out.print(session.getAttribute("accno"));
	%>
	
	<form action="Balance" method="get">
    	<button type="submit">Check Balance</button>	
    </form>

	<form action="Withdrawl.jsp" method="get" style="margin-top:0px;">
    	<button type="submit">Withdraw Money</button>	
    </form>
	
</body>
</html>