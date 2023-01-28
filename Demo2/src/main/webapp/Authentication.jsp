<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String name=(String)session.getAttribute("name"); %>
<%if(name!=null){ %>
<%=name %>
<%} %>
<%String error=(String)request.getAttribute("err"); %>
<%if(error!=null){ %>
<h1> <%=error %></h1>
<%} %>
<h1>Hello</h1>
</body>
</html>