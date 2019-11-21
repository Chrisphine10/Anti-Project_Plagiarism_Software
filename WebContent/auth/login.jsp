<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1>User Login</h1>
	<h2>Account Type</h2>
	<form action="#" method="get">
		<select name="user_type">
			<option value="Student">Student</option>
			<option value="Lecturer">Lecturer</option>
		</select>
	</form>

	<div class="loginform">
	<h3>Student Login</h3>
		<form action="#" method="post">
			<label>Registration Number</label><br>
			<input type="text" name="regno"
				placeholder="Enter your registration number" required="required"><br>
			<label>Password</label><br>
			<input type="password" name="password"
				placeholder="Enter your password" required="required"><br>
				<input
				type="submit" value="login">
		</form>
	</div>

	<div class="loginform">
	<h3>Lecturer Login</h3>
		<form action="#" method="post">
			<label>Email</label><br>
			<input type="email" name="email"
				placeholder="Enter your email address" required="required"><br>
			<label>Password</label><br>
			<input type="password" name="password"
				placeholder="Enter your password" required="required"><br>
				<input
				type="submit" value="login">
		</form>
	</div>

</body>
</html>