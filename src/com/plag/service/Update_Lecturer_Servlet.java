package com.plag.service;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.plag.dao.LecturerDao;
import com.plag.model.Lecturer;


public class Update_Lecturer_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		  HttpSession session = request.getSession();
			 if (session.getAttribute("lecturer") != null) {
				
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String id_no = request.getParameter("id_no");

		Lecturer l = new Lecturer();
		l.setEmail(email);
		l.setFirst_name(fname);
		l.setLast_name(lname);
		l.setId_no(id_no);

		int status = LecturerDao.update(l);
		if (status > 0) {
			response.sendRedirect("jsp/lecturerhomepage.jsp");
		} else {
			out.println("Sorry! unable to update record");
		}

		out.close();
	}
	 else {
		 System.out.println("Unauthorised access");
	 }
	}
}
