package com.plag.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.plag.dao.ConceptDao;
import com.plag.model.Concept;

/**
 * Servlet implementation class ConceptHandler
 */
public class Update_Concept_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
	          throws ServletException, IOException {  
	        response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	        //String sid=request.getParameter("id");  
	        //int id=Integer.parseInt(sid);  
	        String name=request.getParameter("name");  
	        String reg_no=request.getParameter("reg_no");  
	        String cstatus=request.getParameter("status");  
	        String title=request.getParameter("title");  
	          
	        Concept c=new Concept();  
            c.setTitle(title);  
            c.setConcept_paper(name);  
            c.setReg_no(reg_no);
            c.setStatus(cstatus); 
	          
	        int status=ConceptDao.update(c);  
	        if(status>0){  
	            response.sendRedirect("/viewconcept");  
	        }else{  
	            out.println("Sorry! unable to update record");  
	        }  
	          
	        out.close();  
	    }

}
