<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String name=(String)request.getParameter("fname");%>
<%=name%>
<%String named=(String)request.getParameter("lName");%>
<%=named%>
<%String namee=(String)request.getParameter("Email");%>
<%=namee%>
<%String namey=(String)request.getParameter("psw");%>
<%=namey%>
</body>
</html>