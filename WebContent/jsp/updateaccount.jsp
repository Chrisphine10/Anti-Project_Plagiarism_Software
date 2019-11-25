<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Account</title>
</head>
<body>
<div class="signupform">
	<h3>Edit Account Details</h3>
		<form action="../addstudent" method="post">
			<label>First Name</label><br>
			<input type="text" name="fname" required="required"
				placeholder="Enter your first name" value="<%= %>"><br>
				<label>Last Name</label><br>
				<input type="text" name="lname" required="required"
				placeholder="Enter your last name" value="<%= %>"><br>
				<label>Registration	Number</label><br>
				<input type="text" name="regno" value="<%= %>"	placeholder="Enter your registration number" required="required"><br>
			<label>Password</label><br>
			<input type="password" name="password" value="<%= %>"
				placeholder="Enter your password" required="required"><br>
				<label>Confirm Password</label><br>
				<input type="password" name="password2" value="<%= %>"
				placeholder="Confirm your password" required="required"
				onchange="matchpass()"><br>
				<input type="submit" value="Sign Up">
		</form>
	</div>
</body>
</html>