<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>

	<div class="signupform">
	<h3>Sign Up</h3>
		<form action="/addstudent" method="get">
			<label>First Name</label><br>
			<input type="text" name="fname" required="required"
				placeholder="Enter your first name"><br>
				<label>Last
				Name</label><br>
				<input type="text" name="lname" required="required"
				placeholder="Enter your last name"><br>
				<label>Registration
				Number</label><br>
				<input type="text" name="regno"	placeholder="Enter your registration number" required="required"><br>
			<label>Password</label><br>
			<input type="password" name="password"
				placeholder="Enter your password" required="required"><br>
				<label>Confirm
				Password</label><br>
				<input type="password" name="password2"
				placeholder="Confirm your password" required="required"
				onchange="matchpass()"><br>
				<input type="submit" value="login">
		</form>
	</div>

</body>
</html>