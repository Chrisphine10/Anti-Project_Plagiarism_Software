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
 * Servlet implementation class Add_Lecturer_Servlet
 */
public class Add_Lecturer_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		 if (session.getAttribute("lecturer") != null) {
			
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String fname = request.getParameter("first_name");
		String lname = request.getParameter("last_name");
		String email = request.getParameter("email");
		String s_id_no = request.getParameter("id_no");
	    int id_no=Integer.parseInt(s_id_no);
		String passwordraw = request.getParameter("firstpassword");
		String salt = PasswordUtils.getSalt(30);
		String mySecurePassword = PasswordUtils.generateSecurePassword(passwordraw, salt);
		
        Lecturer l = new Lecturer();
        l.setFirst_name(fname);
        l.setLast_name(lname);
        l.setEmail(email);
        l.setLecturer_id_no(id_no);
        l.setPassword(mySecurePassword);
        
        int status=LecturerDao.save(l);  
        if(status>0){  
            System.out.print("<p>Lecturer saved successfully!</p>");  
            request.getRequestDispatcher("auth/login.jsp").include(request, response);  
        }else{  
            System.out.println("Sorry! unable to save record");  
        }  
          
        System.out.close();  
        
        
	}
		 else {
		 System.out.println("Unauthorised access");
	 }

	}
	
}
