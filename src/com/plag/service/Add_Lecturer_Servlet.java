package com.plag.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.appsdeveloperblog.encryption.PasswordUtils;

/**
 * Servlet implementation class Add_Lecturer_Servlet
 */
@WebServlet("/addlecturer")
public class Add_Lecturer_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add_Lecturer_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String fname = request.getParameter("first_name");
		String lname = request.getParameter("last_name");
		String email = request.getParameter("email");
		String id_no = request.getParameter("id_no");
		String passwordraw = request.getParameter("firstpassword");
		String salt = PasswordUtils.getSalt(30);
		String mySecurePassword = PasswordUtils.generateSecurePassword(passwordraw, salt);
		RequestDispatcher rd = request.getRequestDispatcher("index.html");
        rd.forward(request, response);
	}

}
