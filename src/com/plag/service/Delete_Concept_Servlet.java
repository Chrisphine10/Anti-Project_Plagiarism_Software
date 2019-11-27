package com.plag.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.plag.dao.ConceptDao;


/**
 * Servlet implementation class ConceptHandler
 */

public class Delete_Concept_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		 if (session.getAttribute("lecturer") != null) {
			
	        String sid=request.getParameter("id");  
	        int id=Integer.parseInt(sid);  
	        ConceptDao.delete(id);  
	        response.sendRedirect("ViewServlet");
	}
	else {
		 System.out.println("Unauthorised access");
	 }
	}
}