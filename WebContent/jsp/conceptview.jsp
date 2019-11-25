<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.plag.dao.*, com.plag.model.* "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Concept Paper</title>
</head>
<body>
	<%
		String sid = request.getParameter("reg_no");
		int id = Integer.parseInt(sid);
		Concept c = ConceptDao.getConceptByStudent(id);
	%>
	<div class="concept">
		<h1>Concept Paper</h1>
		<label>Title:</label><label><%= c.getTitle() %></label><br> <label>Student
			Name:</label><label><%= c.getReg_no() %></label><br>
		<iframe> </iframe>
	</div>
</body>
</html>