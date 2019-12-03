<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lecturer Registration</title>
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
	<h3>Register New Lecturer</h3>
		<form action="../addlecturer" method="post">
			<label for="fname">First Name</label><br>
			<input type="text" name="fname" required="required"
				placeholder="Enter your first name"><br>
				<label for="lname">Last
				Name</label><br>
				<input type="text" name="lname" required="required"
				placeholder="Enter your last name"><br>
				<label for="email">Email</label><br>
				<input type="email" name="email" placeholder="Enter your email address"><br>
				<label for="phone_no">Phone Number</label><br>
				<input type="tel" name="phone_no" placeholder="Enter your phone number"><br>
				<label for="payroll_number"></label><br>
				<input type="text" name="payroll_number" placeholder="Enter your payroll number"><br>
			<label for="password">Password</label><br>
			<input type="password" name="password" min="8" pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\s).*$"
				placeholder="Enter your password" required="required"><br>
				<label for="password2">Confirm
				Password</label><br>
				<input type="password" name="password2"
				placeholder="Confirm your password" required="required"><br>
				<input type="submit" value="Sign Up" onclick="matchpass()" min="8">
		</form>
	</div>

</body>
</html>