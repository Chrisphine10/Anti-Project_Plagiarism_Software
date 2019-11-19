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
import com.db.datatabase.Student;

import test.Emp;
import test.EmpDao;

/**
 * Servlet implementation class Auth
 */
@WebServlet("/Auth")
public class Add_Student_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add_Student_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        
       String reg_no = request.getParameter("reg_no");
  	   String first_name=request.getParameter("first_name");
  	   String last_name = request.getParameter("last_name");
  	   String email = request.getParameter("email");
       String phone_number =request.getParameter("phone_number");
  	   String password = request.getParameter("password");
  	   String lecturer_id_no = request.getParameter("lecturer_id_no");
  	  
        
          
        Student s=new Student ();  
        s.setReg_no(reg_no);
        s.setFirst_name(first_name);
        s.setLast_name(last_name);
        s.setEmail(email);
        s.setPhone_number(phone_number);
        s.setPassword(password);
        
  
          
        int status=StudentDao.save(s);  
        if(status>0){  
            out.print("<p>Record saved successfully!</p>");  
            request.getRequestDispatcher("index.html").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
	}

}
