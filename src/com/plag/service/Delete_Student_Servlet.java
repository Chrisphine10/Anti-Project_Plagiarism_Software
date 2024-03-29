package com.plag.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.plag.dao.StudentDao;

/**
 * Servlet implementation class Auth
 */
public class Delete_Student_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	String accept = request.getParameter("accept");
    	HttpSession session = request.getSession();
		 if (session.getAttribute("student") != null) {
		 if(accept != null) {
	        String id=request.getParameter("id"); 
	        StudentDao.delete(id);  
	        session.removeAttribute("student");
	        response.sendRedirect("index.jsp");
		 }
		 else {
			response.sendRedirect("jsp/studenthomepage.jsp");
		 }
	}
		 else {
			 System.out.println("Unauthorised access");
		 }
		}
}
