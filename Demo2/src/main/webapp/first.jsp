<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<hi>Registration Form</hi>
<table>
<form action="second.jsp" method="get">

FirstName<input type="text" name="fname" placeholder="enter your name"> required <br>
LastName<input type="text" name="lName" placeholder="enter your lastname"> <br>
Email<input type="email" name="Email" placeholder="enter your email"> <br>
password<input type="password" name="psw" placeholder="enter your password"> required <br>
dob<input type="date"name="dob">
<input type="checkbox"name="Lang1">HTML
<input type="checkbox"name="Lang2">CSS
<input type="checkbox"name="Lang3">JAVASCRIPT
<input type="radio"name="gender">Male
<input type="radio"name="gender">Female
<input type="submit" value="SignUp">
</form>
</center>
</table>
</body>
</html>