<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%
 if (session.getAttribute("lecturer") != null) {
	 Random r = new Random();
	 int rand = r.nextInt();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit New Concept</title>
</head>
<body>
<div class="submit_page">
<form action="../addconcept" method="post">
<input type="text" name="reg_no" value="<%= rand %>" hidden="true">
<input type="text" name="title" placeholder="Enter concept title"><br>
<input type="text" name="concept_paper" placeholder="Copy and paste the concept paper contents here"><br>
<input type="submit" value="Submit">
</form>
</div>
</body>
</html>
<% 
 }
 else {
	 request.getRequestDispatcher("../auth/login.jsp").include(request, response);
 }
%>