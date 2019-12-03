package com.plag.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.appsdeveloperblog.encryption.PasswordUtils;
import com.plag.dao.StudentDao;
import com.plag.model.Student;

public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
			
	    String id = request.getParameter("reg_no");
	    Boolean test = false;
		String passwordraw = request.getParameter("password");
		Student s = StudentDao.getStudentById(id);
		String realpass = s.getPassword();
		String salt = s.getSalt();
		test = PasswordUtils.verifyUserPassword(passwordraw, realpass, salt);
		System.out.println(test);
		if(test == true) {
		    HttpSession session = request.getSession();
			session.setAttribute("student", s);
            response.sendRedirect("jsp/studenthomepage.jsp");
		}
		else {
			response.sendRedirect("auth/login.jsp");

			System.out.println("<p>Password entered is incorrect!</p>");
	}
		
		}


	}
