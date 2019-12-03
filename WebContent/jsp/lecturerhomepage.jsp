<%@ page import="com.plag.dao.*, com.plag.model.* "%>
<%
 if (session.getAttribute("lecturer") != null) {
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<div class="menu">
	    <a href="../jsp/newconceptlist.jsp"><button>Pending Concept</button></a>
		<a href="../jsp/studentlist.jsp"><button>Student List</button></a>
		<a href="../jsp/previousconceptlist.jsp"><button>Concept List</button></a>
		<a href="../jsp/submitconcept.jsp"><button>Add Concept</button></a>
		<a href="../auth/lecturersignup.jsp"><button>Add New Lecturer</button></a>
		<a href="logout.jsp"><button>Logout</button></a>
	</div>
</body>
</html>
<% 
 }
 else {
	 response.sendRedirect("../auth/leclogin.jsp");
 }
%>