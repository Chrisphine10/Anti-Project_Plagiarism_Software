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

/**
 * Servlet implementation class Add_Lecturer_Servlet
 */

public class Update_Lecturer_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		  HttpSession session = request.getSession();
			 if (session.getAttribute("lecturer") != null) {
				
		String sid = request.getParameter("lecturer_id_no");
		int id = Integer.parseInt(sid);
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone_number");
		String password = request.getParameter("password");

		Lecturer l = new Lecturer();
		l.setLecturer_id_no(id);
		l.setEmail(email);
		l.setFirst_name(fname);
		l.setLast_name(lname);
		l.setPassword(password);
		l.setPhone_number(phone);

		int status = LecturerDao.update(l);
		if (status > 0) {
			response.sendRedirect("/viewlecturer");
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
