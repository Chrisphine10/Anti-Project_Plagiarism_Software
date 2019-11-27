<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.plag.dao.*, com.plag.model.* "%>
 <%
 if (session.getAttribute("student") != null) {
%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Account</title>
</head>
<body>
<div class="signupform">
	<h3>Edit Account Details</h3>
	
	<%
	Student s = (Student) session.getAttribute("student");
	%>
		<form action="../updatestudent" method="post">
			<label>First Name</label><br>
			<input type="text" name="fname" required="required"
				placeholder="Enter your first name" value="<%= s.getFirst_name() %>"><br>
				<label>Last Name</label><br>
				<input type="text" name="lname" required="required"
				placeholder="Enter your last name" value="<%= s.getLast_name() %>"><br>
				<label>Registration	Number</label><br>
				<input type="text" name="regno" value="<%= s.getReg_no() %>" placeholder="Enter your registration number" required="required"><br>
			
			<input type="password" hidden="true" name="password" value="<%= s.getPassword() %>"
				placeholder="Enter your password" required="required"><br>
				<input type="submit" value="Sign Up">
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