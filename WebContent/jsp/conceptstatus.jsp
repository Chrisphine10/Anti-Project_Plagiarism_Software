<%@page import="com.plag.dao.ConceptDao"%>
<%@ page import="com.plag.dao.*, com.plag.model.* "%>
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
String sid = request.getParameter("concept_id");
int id = Integer.parseInt(sid);

if(request.getParameter("accept") == "Accept"){
	

	
} else if(request.getParameter("rejected") == "Reject"){
	
	
}
%>
</body>
</html>
<% 
 }
 else {
	 response.sendRedirect("../auth/leclogin.jsp");
 }
%>