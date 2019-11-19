package com.plag.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.datatabase.Concept;

import test.Emp;
import test.EmpDao;

/**
 * Servlet implementation class ConceptHandler
 */
@WebServlet("/ConceptHandler")
public class Add_Concept_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add_Concept_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        

          
        int concept_paper_id= request.getParameter("concept_paper_id");  
    	String title=request.getParameter("title");  
        String concept_paper_name=request.getParameter("concept_paper_name");  
        String reg_no=request.getParameter("reg_no");  
        String date_of_submission=request.getParameter("date_of_submission"); 
        String date_of_acceptance=request.getParameter("date_of_acceptance"); 
        String status=request.getParameter("status"); 
          
        Concept c=new Concept();  
        c.setConcept_paper_id(concept_paper_id); 
        c.setTitle(title);
        c.setConcept_paper_name(concept_paper_name); 
        c.setReg_no(reg_no);
        c.setDate_of_submission(date_of_submission);
        c.setDate_of_acceptance(date_of_acceptance);
        c.setStatus(status);
        
        
        int status = ConceptDao.save(c);  
        if(status>0){  
            out.print("<p>Record saved successfully!</p>");  
            request.getRequestDispatcher("index.html").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
