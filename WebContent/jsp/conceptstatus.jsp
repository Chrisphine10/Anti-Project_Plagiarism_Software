<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
 if (session.getAttribute("lecturer") != null) {
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Status Update</title>
</head>
<body>
<%



%>
</body>
</html>
<% 
 }
 else {
	 request.getRequestDispatcher("../auth/leclogin.jsp").include(request, response);
 }
%>