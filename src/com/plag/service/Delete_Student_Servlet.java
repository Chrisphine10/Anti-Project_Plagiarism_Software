package com.plag.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.plag.dao.StudentDao;

/**
 * Servlet implementation class Auth
 */
@WebServlet("/deletestudent")
public class Delete_Student_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete_Student_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
	        String sid=request.getParameter("id");  
	        int id=Integer.parseInt(sid);  
	        StudentDao.delete(id);  
	        response.sendRedirect("ViewServlet");
		
	}

}
