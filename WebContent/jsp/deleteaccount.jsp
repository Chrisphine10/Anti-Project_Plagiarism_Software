<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.plag.dao.*, com.plag.model.* "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Account</title>
</head>
<%
Student s = (Student) session.getAttribute("student");
%>
<body>
<h1>Are you sure you want to delete this account?</h1>
<form action="../deletestudent" method="post">
<input hidden="true" name="reg_no" type="text" value="<%= s.getReg_no()  %>">
<input type="submit" name="accept" value="Yes, I want to delete"><br>
<input type="submit" name="decline" value="No">
</form>
</body>
</html>