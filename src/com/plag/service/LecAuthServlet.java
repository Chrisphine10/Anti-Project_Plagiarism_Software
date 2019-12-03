package com.plag.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.appsdeveloperblog.encryption.PasswordUtils;
import com.plag.dao.LecturerDao;
import com.plag.model.Lecturer;

/**
 * Servlet implementation class LecAuthServlet
 */
public class LecAuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
