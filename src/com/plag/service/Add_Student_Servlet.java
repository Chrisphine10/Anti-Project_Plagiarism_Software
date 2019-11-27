package com.plag.service;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.appsdeveloperblog.encryption.PasswordUtils;
import com.plag.dao.StudentDao;
import com.plag.model.Student;


public class Add_Student_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String s_reg_no = request.getParameter("reg_no");
		int reg_no=Integer.parseInt(s_reg_no);
		String passwordraw = request.getParameter("password");
		String salt = PasswordUtils.getSalt(30);
		String mySecurePassword = PasswordUtils.generateSecurePassword(passwordraw, salt);
		RequestDispatcher rd = request.getRequestDispatcher("index.html");
        rd.forward(request, response);
        
        Student s = new Student();
        s.setFirst_name(fname);
        s.setLast_name(lname);
        s.setEmail(email);
        s.setReg_no(reg_no);
        s.setPassword(mySecurePassword);
        int status=StudentDao.save(s);  
        if(status>0){  
            System.out.print("<p>Student saved successfully!</p>");  
            request.getRequestDispatcher("/auth/login.jsp").include(request, response); 
        }else{  
            System.out.println("<p>Sorry! unable to save record</p>"); 
        }  
          
        System.out.close();  
        
        
        
	}

}
