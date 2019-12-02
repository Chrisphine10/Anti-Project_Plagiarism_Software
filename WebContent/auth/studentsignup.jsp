<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<script type="text/javascript">

function matchpass(){
	var firstpassword=password.value;
	var secondpassword=password2.value;

	if(firstpassword==secondpassword){
	return true;
	}
	else{
	alert("password must be same!");
	return false;
	}
	}
</script>
<body>

	<div class="signupform">
	<h3>Sign Up</h3>
		<form action="../addstudent" method="post">
			<label for="fname">First Name</label><br>
			<input type="text" name="fname" required="required"
				placeholder="Enter your first name"><br>
				<label for="lname">Last
				Name</label><br>
				<input type="text" name="lname" required="required"
				placeholder="Enter your last name"><br>
				<label for="reg_no">Registration
				Number</label><br>
				<input type="text" name="reg_no" placeholder="Enter your registration number" required="required"><br>
				<label for="email">Email</label><br>
				<input type="email" name="email" placeholder="Enter your email address"><br>
				<label for="phone_no">Phone Number</label><br>
				<input type="tel" name="phone_no" placeholder="Enter your phone number"><br>
			<label for="password">Password</label><br>
			<input type="password" name="password" min="8" pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\s).*$"
				placeholder="Enter your password" required="required"><br>
				<label for="password2">Confirm
				Password</label><br>
				<input type="password" name="password2"
				placeholder="Confirm your password" required="required"><br>
				<input type="submit" value="Sign Up" onclick="matchpass()" min="8">
		</form>
		<p>Have an account, click <a href="login.jsp">here</a></p>
	</div>

</body>
</html>