<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="com.plag.dao.*, com.plag.model.* " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit New Concept</title>
</head>
<body>
	<%
 if (session.getAttribute("student") != null) {
	 
	 Student s = (Student) session.getAttribute("student");
%>
<div class="submit_page">
<form action="../addconcept" method="post">
<input type="text" name="reg_no" value="<%= s.getReg_no() %>" hidden="true">
<input type="text" name="title" placeholder="Enter concept title"><br>
<input type="text" name="concept_paper" placeholder="Copy and paste the concept paper contents here"><br>
<input type="submit" value="Submit">
</form>
<button onclick="goBack()">Go Back</button>

<script>
function goBack() {
  window.history.back();
}
</script>
</div>
<% 
 }
 else if(session.getAttribute("lecturer") != null){
	 %>
	 <div class="submit_page">
	 <form action="../addconcept" method="post">
	 <label for="reg_no">Registation Number:</label><br>
	 <input type="text" name="reg_no" placeholder="Enter student registration number"><br>
	 <label for="title">Title:</label><br>
	 <input type="text" name="title" placeholder="Enter concept title"><br>
	 <label for="concept_paper">Concept Paper:</label><br>
	 <input type="text" name="concept_paper" placeholder="Copy and paste the concept paper contents here"><br>
	 <input type="submit" value="Submit">
	 </form>
	 <button onclick="goBack()">Go Back</button>

<script>
function goBack() {
  window.history.back();
}
</script>
	 </div>
	 <% 
 }
 else {
	 response.sendRedirect("../auth/login.jsp");
 }
%>
</body>
</html>