<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.plag.dao.*, com.plag.model.*, java.util.List"  %>
<%
 if (session.getAttribute("student") != null) {
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Concept Papers List</title>
</head>
<body>
	<%
	Student s = (Student) session.getAttribute("student");
	int reg_no = s.getReg_no();
    List <Concept> list= ConceptDao.getAllConceptByStudent(reg_no);
%>

<table>
<tr>
<th>Title</th>
<th>Registration Number</th>
<th>Submit Date</th>
<th>Status</th>
<th></th>
</tr>
<% 
for(Concept c:list){
%>
<tr>
<td><%= c.getTitle() %></td>
<td><%= c.getReg_no() %></td>
<td><%= c.getDate_of_submission() %></td>
<td><%= c.getStatus() %></td>
<td>
<form action="conceptview.jsp" method="post">
<input type="text" hidden="true" name="id" value="<%= c.concept_paper_id %>">
<input type="submit" value="View Concept">
</form>
</td>
</tr>
<% } %>
</table>
</body>
</html>
<% 
 }
 else {
	 request.getRequestDispatcher("../auth/login.jsp").include(request, response);
 }
%>