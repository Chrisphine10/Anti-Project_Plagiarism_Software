package com.plag.service;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.plag.dao.ConceptDao;
import com.plag.model.Concept;

/**
 * Servlet implementation class ConceptHandler
 */
@WebServlet("/ConceptHandler")
public class View_Concept_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<Concept> list=ConceptDao.getAllConcepts();
		doGet(request, response);
		
		for(Concept c:list){ 
			String name = c.getConcept_paper_name();
		}
	}

}
