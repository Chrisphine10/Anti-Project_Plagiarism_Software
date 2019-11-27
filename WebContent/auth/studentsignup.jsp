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
			<label>First Name</label><br>
			<input type="text" name="fname" required="required"
				placeholder="Enter your first name"><br>
				<label>Last
				Name</label><br>
				<input type="text" name="lname" required="required"
				placeholder="Enter your last name"><br>
				<label>Registration
				Number</label><br>
				<input type="text" name="reg_no" placeholder="Enter your registration number" required="required"><br>
			<label>Password</label><br>
			<input type="password" name="password"
				placeholder="Enter your password" required="required"><br>
				<label>Confirm
				Password</label><br>
				<input type="password" name="password2"
				placeholder="Confirm your password" required="required"><br>
				<input type="submit" value="Sign Up" onclick="matchpass()">
		</form>
		<p>Have an account, click <a href="login.jsp">here</a></p>
	</div>

</body>
</html>