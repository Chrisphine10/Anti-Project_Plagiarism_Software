<%@ page import="com.plag.dao.*, com.plag.model.*, java.util.List"  %>
<%
 if (session.getAttribute("student") != null) {
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<div class="menu">
		<a href="../jsp/submitconcept.jsp"><button>Submit Concept</button></a>
		<a href="../jsp/myconceptlist.jsp"><button>Concept Status</button></a>
		<a href="../jsp/previousconceptlist.jsp"><button>Concept List</button></a>
		<a href="../jsp/updateaccount.jsp"><button>Edit Details</button></a>
		<a href="../jsp/logout.jsp"><button>Logout</button></a>
	</div>
</body>
</html>
<% 
 }
 else {
	 request.getRequestDispatcher("../auth/login.jsp").include(request, response);
 }
%>