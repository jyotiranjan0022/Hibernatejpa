<%@page import="hibernateproject.dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% User u=(User)session.getAttribute("u");
if(u!=null)
{
%>
<h2>
Hello mr.pinku<%=u.getName() %>
welcome to my application

</h2>
<%
}
else
{
	response.sendRedirect("login.jsp");
}
%>
</body>
