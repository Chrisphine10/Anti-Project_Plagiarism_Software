<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Account</title>
</head>
<%

%>
<body>
<h1>Are you sure you want to delete this account?</h1>
<form action="../deletestudent" method="post">
<input hidden="true" name="id" type="text" value="<%= %>">
<input type="submit" name="accept" value="Yes, I want to delete"><br>
<input type="submit" name="decline" value="No">
</form>
</body>
</html>