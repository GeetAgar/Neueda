<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Withdraw Money</title>
<link rel="stylesheet" href="default.css">
</head>
<body>
<%
		if(session.getAttribute("accno")==null)
		{
			response.sendRedirect("login.jsp");
		}
	%>

<form action="Withdrawl" method="get">
	 <h3 style="color:red; text-align:center">Amount cannot be dispatched. 
	 <br>Please try again.</h3> 
  		<div class="container">
    	<label for="amm"><b>Amount</b></label>
    	<input type="text" placeholder="Enter Amount" name="amm" required>
		<br>
    	<button type="submit">Submit</button>
    	</div>
    </form>
</body>
</html>