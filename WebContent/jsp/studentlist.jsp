<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.plag.dao.*, com.plag.model.*, java.util.List"  %>
<%
 if (session.getAttribute("lecturer") != null) {
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students Details</title>
</head>
<body>
<%
List<Student> list=StudentDao.getAllStudents();
%>

<div class="studentlist">
<table>
<tr>
<th>Name</th>
<th>Registration No.</th>
<th>Email</th>
<th></th>
</tr>
<% 
for(Student s:list) { 
%>
<tr>
<%
Concept conc = ConceptDao.getConceptByStudent(s.getReg_no());
%>
<td><%= s.getFirst_name() + " " + s.getLast_name()%></td>
<td><%= s.getReg_no() %></td>
<td><%= s.getEmail() %></td>
<td>
<form action="conceptview.jsp" method="post">
<input name="id" type="number" hidden="true" value="<%= conc.getConcept_paper_id() %>">
<input type="submit" value="View Concept">
</form>
</td>
</tr>
<% } %>
</table>
</div>
</body>
</html>
<% 
 }
 else {
	 response.sendRedirect("../auth/leclogin.jsp");
 }
%>