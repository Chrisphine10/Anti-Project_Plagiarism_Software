package com.plag.service;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.plag.dao.StudentDao;
import com.plag.model.Student;

/**
 * Servlet implementation class Auth
 */

public class Update_Student_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
	          throws ServletException, IOException {  
	        response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        HttpSession session = request.getSession();
	        
			if (session.getAttribute("student") != null) {
	        String id=request.getParameter("reg_no");
	        String fname=request.getParameter("fname");
	        String lname=request.getParameter("lname"); 
	        String email=request.getParameter("email");  
	        String phone=request.getParameter("phone_no");
	          
	      Student s=new Student();  
          s.setReg_no(id);  
          s.setEmail(email);
          s.setFirst_name(fname);  
          s.setLast_name(lname);
          s.setPhone_number(phone);
	          
	        int status=StudentDao.update(s);  
	        if(status>0){  
	        	session.setAttribute("student", s);
	            response.sendRedirect("jsp/updateaccount.jsp");  
	        }else{  
	            out.println("Sorry! unable to update record");  
	        }  
	          
	        out.close();  
	    }
			 else {
				 System.out.println("Unauthorised access");
				 response.sendRedirect("index.jsp");  
			 }
			}
}
