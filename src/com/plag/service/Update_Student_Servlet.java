package com.plag.service;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.plag.dao.StudentDao;
import com.plag.model.Student;

/**
 * Servlet implementation class Auth
 */
@WebServlet("/Auth")
public class Update_Student_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
	          throws ServletException, IOException {  
	        response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	        String sid=request.getParameter("reg_no");  
	        int id=Integer.parseInt(sid);  
	        String fname=request.getParameter("fname");
	        String lname=request.getParameter("lname"); 
	        String email=request.getParameter("email");  
	        String phone=request.getParameter("phone_number");
	        String password=request.getParameter("password"); 
	          
	        Student s=new Student();  
          s.setReg_no(id);  
          s.setEmail(email);
          s.setFirst_name(fname);  
          s.setLast_name(lname);
          s.setPassword(password);
          s.setPhone_number(phone);
	          
	        int status=StudentDao.update(s);  
	        if(status>0){  
	            response.sendRedirect("/viewstudent");  
	        }else{  
	            out.println("Sorry! unable to update record");  
	        }  
	          
	        out.close();  
	    }

}
