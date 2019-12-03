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
			<label for="fname">First Name</label><br>
			<input type="text" name="fname" required="required"
				placeholder="Enter your first name" value="<%= s.getFirst_name() %>"><br>
				<label for="lname">Last Name</label><br>
				<input type="text" name="lname" required="required"
				placeholder="Enter your last name" value="<%= s.getLast_name() %>"><br>
				<label for="reg_no">Registration	Number</label><br>
				<input type="number" name="reg_no" value="<%= s.getReg_no() %>" placeholder="Enter your registration number" required="required"><br>			
            <label for="email">Email</label><br>
				<input type="email" name="email" value="<%= s.getEmail() %>" placeholder="Enter your email address"><br>
				<label for="phone_no">Phone Number</label><br>
				<input type="text" name="phone_no" value="<%= s.getPhone_number() %>" placeholder="Enter your phone number"><br>	
				<input type="submit" value="Update">
		</form><br>
		<form action="deleteaccount.jsp" method="post">
		<input type="submit" value="delete account">
		</form>
	</div>
</body>
</html>
<% 
 }
 else {
	 response.sendRedirect("../auth/login.jsp");
 }
%>