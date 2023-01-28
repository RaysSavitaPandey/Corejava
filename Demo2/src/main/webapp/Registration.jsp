<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<%@include file = "Header.jsp" %>
<center><h1>Registration form</h1></center>
<table align="center">
<form action="ClrlUser" method="get">
<tr>
<th>First name:</th><td><input type="text" name="firstname" placeholder="Enter your first name" required="required"></td>
</tr>

<tr>
<th>Last name:</th><td><input type="text" name="lastname" placeholder="Enter your last name" required="required"></td>
</tr>

<tr>
<th>Email:</th><td><input type="email" name="email" placeholder="Enter your last email" required="required"></td>
</tr>

<tr>
<th>Password:</th><td><input type="password" name="psw"  required="required"></td>
</tr>


<tr>
<td><input type="submit" value="insert" name="Operation"></td>
<td><input type="submit" value="update" name="Operation"></td>
<td><input type="submit" value="delete" name="Operation"></td>
</tr>
</form>
</table>
<%String message = (String)request.getAttribute("OK");%>
<%=message %>

</body>
</html>



