package com.plag.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.plag.dao.StudentDao;

/**
 * Servlet implementation class Auth
 */
public class Delete_Student_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	        String sid=request.getParameter("id");  
	        int id=Integer.parseInt(sid);  
	        StudentDao.delete(id);  
	        response.sendRedirect("index.jsp");
		
	}

}
