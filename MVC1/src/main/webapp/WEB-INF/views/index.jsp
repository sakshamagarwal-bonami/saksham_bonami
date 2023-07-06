<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>

<body>
	<h1>Heading 1</h1>
	<%
	String name=(String)request.getAttribute("name");
	%>
	<h1>Name is <%=name %></h1> 
	<h2>Roll No is ${id}</h2>
	<h3>Heading 3</h3>
</body>
</html>