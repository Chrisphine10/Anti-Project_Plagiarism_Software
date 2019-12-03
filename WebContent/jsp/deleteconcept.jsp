<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Concept</title>
</head>
<%
if (session.getAttribute("student") != null && session.getAttribute("lecturer") != null) { 
    String con_id = request.getParameter("concept_id");
%>
<body>
<form action="../deleteconcept" method="post">
<input hidden="true" name="reg_no" type="text" value="<%= con_id  %>">
<input type="submit" name="accept" value="Yes, I want to delete"><br>
<input type="submit" name="decline" value="No">
</form>
<%
} else {
	response.sendRedirect("../auth/login.jsp");
}

%>
</body>
</html>