<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ATM Login</title>
        <link rel="stylesheet" href="default.css">
</head>
    <body>
   
    <form action="Login" method="get">
		 <h3 style="color:red; text-align:center">Incorrect account number or pin!</h3> 
  		<div class="container">
    	<label for="accno"><b>Account Number</b></label>
    	<input maxlength="9" type="text"  onkeypress="return isNumberKey(event)" placeholder="Enter Account Number" name="accno" required>
		<br>
    	<label for="pin"><b>PIN</b></label>
    	<input maxlength="4" type="password"  onkeypress="return isNumberKey(event)" placeholder="Enter Pin" name="pin" required>
		<br>
    	<button type="submit">Login</button>
    	</div>
    </form>
     <script>
function isNumberKey(evt)
{
	var charCode = (evt.which) ? evt.which : event.keyCode
	if (charCode > 31 && (charCode < 48 || charCode > 57))
	return false;

	return true;
}
</script>
    </body>
</html>