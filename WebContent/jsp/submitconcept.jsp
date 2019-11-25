<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit New Concept</title>
</head>
<body>
<div class="submit_page">
<form action="../addconcept" method="post">
<input type="text" name="reg_no" value="<%= %>" hidden="true">
<input type="text" name="title" placeholder="Enter concept title"><br>
<input type="file" name="concept_paper"><br>
<input type="submit" value="Submit">
</form>
</div>
</body>
</html>