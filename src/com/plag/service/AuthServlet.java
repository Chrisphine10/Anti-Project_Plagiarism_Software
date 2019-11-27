package com.plag.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
		if(student != null) {
			
	    String s_reg_no = request.getParameter("reg_no");

		String passwordraw = request.getParameter("password");
		String salt = PasswordUtils.getSalt(30);
		String mySecurePassword = PasswordUtils.generateSecurePassword(passwordraw, salt);
		int id = Integer.parseInt(s_reg_no);
		Student s = StudentDao.getStudentById(id);
		String realpass = s.getPassword();
		if(mySecurePassword == realpass) {
			request.getRequestDispatcher("../jsp/studenthomepage.jsp").forward(request, response);
		    HttpSession session = request.getSession();
			session.setAttribute("student", s);
		}
		else {
			System.out.println("<p>Password entered is incorrect!</p>");
	}
		} 
		else
		{
		String email = request.getParameter("email");
		String passwordraw = request.getParameter("password");
		String salt = PasswordUtils.getSalt(30);
		String mySecurePassword = PasswordUtils.generateSecurePassword(passwordraw, salt);

		Lecturer l = LecturerDao.getLecturerByEmail(email);
		String realpass = l.getPassword();
		if(mySecurePassword == realpass) {
			request.getRequestDispatcher("../jsp/lecturerhomepage.jsp").include(request, response); 
			HttpSession session = request.getSession();
			session.setAttribute("lecturer", l);
		}
		else {
			System.out.println("<p>Password entered is incorrect!</p>");
		}


	}
}
}
