<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1>Student Login</h1>
	<p>Lecturer, click <a href="leclogin.jsp">here</a></p>

	<div class="loginform">
	<h3>Student Login</h3>
		<form action="../authservlet" method="post">
			<label>Registration Number</label><br>
			<input type="text" name="reg_no"
				placeholder="Enter your registration number" required="required"><br>
			<label>Password</label><br>
			<input type="password" name="password"
				placeholder="Enter your password" required="required"><br>
				<input
				type="submit" name="studentlogin" value="Login">
		</form>
	</div><br>
<p>Don't have an account, click <a href="studentsignup.jsp">here</a></p>
</body>
</html>