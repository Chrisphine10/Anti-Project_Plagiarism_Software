package com.plag.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.appsdeveloperblog.encryption.PasswordUtils;
import com.db.datatabase.Lecturer;
import com.db.datatabase.Student;

import test.Emp;
import test.EmpDao;

/**
 * Servlet implementation class Add_Lecturer_Servlet
 */
@WebServlet("/Add_Lecturer_Servlet")
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
		
			response.setContentType("text/html");  
	        PrintWriter out=response.getWriter(); 
	        
	       String lecturer_id_no = request.getParameter("lecturer_id_no");
	  	   String first_name=request.getParameter("first_name");
	  	   String last_name = request.getParameter("last_name");
	  	   String payroll_number = request.getParameter("payroll_number");
	  	   String email = request.getParameter("email");
	       String phone_number =request.getParameter("phone_number");
	  	   String password = request.getParameter("password");
	  	  
	  	  
	        
	          
	        Lecturer l=new Lecturer ();  
	        l.setLecturer_id_no(lecturer_id_no);
	        l.setFirst_name(first_name);
	        l.setLast_name(last_name);
	        l.setPayroll_number(payroll_number);
	        l.setEmail(email);
	        l.setPhone_number(phone_number);
	        l.setPassword(password);
	        
	  
	          
	        int status=LecturerDao.save(l);  
	        if(status>0){  
	            out.print("<p>Record saved successfully!</p>");  
	            request.getRequestDispatcher("index.html").include(request, response);  
	        }else{  
	            out.println("Sorry! unable to save record");  
	        }  
	          
	        out.close();  
		}
}
