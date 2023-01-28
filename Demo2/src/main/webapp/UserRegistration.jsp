<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink"></body>
<%@include file="Header.jsp"%>
<center>
<form action="UserCtl" method="get">
<table>
<tr>
<th>FirstName:</th><td><input type="text" name="fname" placeholder="enter your firstname"></td></tr> 
<tr>
<th>LastName:</th><td><input type="text" name="lname" placeholder="enter your lastname"></td></tr><tr>
<tr> 
<th>Email:</th><td><input type="email" name="email" placeholder="enter your email"></td></tr>
<tr> 
<th>Password:</th><td><input type="password" name="psw" placeholder="enter your password"></td></tr> 
</table>
<tr><th></th><td><input type="submit" value="SignUp"></td></tr>

</center>
</form>
<%@include file="footer.jsp"%>

</body>
</html>