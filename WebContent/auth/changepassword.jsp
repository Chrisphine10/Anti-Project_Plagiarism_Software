<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.plag.dao.*, com.plag.model.* "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>
<%
	String id = request.getParameter("reg_no");
	Student s = StudentDao.getStudentById(id);
	%>
<form action="../updatestudent" method="post">
			<input hidden="true" type="text" name="fname" required="required"
				placeholder="Enter your first name" value="<%= s.first_name %>">
				<input hidden="true" type="text" name="lname" required="required"
				placeholder="Enter your last name" value="<%= s.last_name %>">
				<input hidden="true" type="text" name="regno" value="<%= s.reg_no %>"	placeholder="Enter your registration number" required="required"><br>
			<label>Password</label><br>
			<input type="password" name="password" value="<%= s.password %>"
				placeholder="Enter new your password" required="required"><br>
				<label>Confirm Password</label><br>
				<input type="password" name="password2" value="<%= s.password %>"
				placeholder="Confirm new your password" required="required"
				onchange="matchpass()"><br>
				<input type="submit" value="Sign Up">
		</form>

</body>
</html>