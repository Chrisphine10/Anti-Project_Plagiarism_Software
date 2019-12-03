<%@page import="org.omg.CosNaming.NamingContextPackage.NotEmpty"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.plag.dao.*, com.plag.model.* "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Concept Paper</title>
</head>
<body>
	<%
	String sid = request.getParameter("id");
	int id = Integer.parseInt(sid);
		Concept c = ConceptDao.getConceptById(id);
	
		String s_reg_no = c.getReg_no();
		int reg_no = Integer.parseInt(s_reg_no);
		Student s = StudentDao.getStudentById(reg_no);
	%>
	<div class="concept">
		<h1>Concept Paper</h1>
		<label>Title:</label><label><%= c.getTitle() %></label><br> <label>Student
			Name:</label><label><%= s.getFirst_name() + " " + s.getLast_name() %></label><br>
		<label> <%= c.getConcept_paper() %>
		</label>
	</div>
	<div>
	<%
	
	 if (session.getAttribute("student") != null) {
		
		Student stude = (Student) session.getAttribute("student");
		int confirm = stude.getReg_no();
		
		if(confirm == reg_no) {
		
		%>
		<form action="deleteconcept.jsp" method="post">
		<input type="text" hidden="true" name="concept_id" value="<%= c.getConcept_paper_id()%>">
		<input type="submit" name="concept" value="Delete Concept">
		</form>
		<%
		}
		 
	}
	 else if(session.getAttribute("lecturer") != null){
			%>
			<form action="conceptstatus.jsp" method="post">
			<input type="text" hidden="true" name="concept_id" value="<%= c.getConcept_paper_id()%>">
			
			<input type="submit" name="accept" value="Accept">
			<input type="submit" name="reject" value="Reject">
			</form>
			<%
	 }
	
	%>
	
	</div>
</body>
</html>