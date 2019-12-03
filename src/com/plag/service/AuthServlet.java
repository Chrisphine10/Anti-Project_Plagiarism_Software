package com.plag.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.appsdeveloperblog.encryption.PasswordUtils;
import com.plag.dao.LecturerDao;
import com.plag.dao.StudentDao;
import com.plag.model.Lecturer;
import com.plag.model.Student;

public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String student = request.getParameter("studentlogin");
		 String lecturer = request.getParameter("lecturerlogin");
		if(student != null) {
			
	    String s_reg_no = request.getParameter("reg_no");
	    Boolean test = false;
		String passwordraw = request.getParameter("password");
		int id = Integer.parseInt(s_reg_no);
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
			System.out.println("<p>Password entered is incorrect!</p>");
			response.sendRedirect("auth/login.jsp");
	}
		} 
		else if(lecturer != null)
		{
		String email = request.getParameter("email");
		String passwordraw = request.getParameter("password");
		Boolean tester = false;
		Lecturer l = LecturerDao.getLecturerByEmail(email);
		String salt = l.getSalt(); 
		String realpass = l.getPassword();
		tester = PasswordUtils.verifyUserPassword(passwordraw, realpass, salt);
		System.out.println(tester);
		if(tester == true) {
			System.out.println("<p>Success!</p>");
			HttpSession session = request.getSession();
			session.setAttribute("lecturer", l);
			response.sendRedirect("jsp/lecturerhomepage.jsp"); 
		}
		else {
			System.out.println("<p>Password entered is incorrect!</p>");
			response.sendRedirect("auth/leclogin.jsp");
		}


	}
}
}
