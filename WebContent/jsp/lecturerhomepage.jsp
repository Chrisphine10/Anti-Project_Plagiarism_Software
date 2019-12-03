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
		<a href="..jsp/logout.jsp"><button>Logout</button></a>
	</div>
</body>
</html>
<% 
 }
 else {
	 request.getRequestDispatcher("../auth/leclogin.jsp").include(request, response);
 }
%>