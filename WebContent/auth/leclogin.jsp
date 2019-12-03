<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lecture login</title>
</head>
<body>
<div class="loginform">
<h1>Lecturer Login</h1>
	<p>Student, click <a href="login.jsp">here</a></p>
	<h3>Lecturer Login</h3>
		<form action="authservlet" method="post">
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