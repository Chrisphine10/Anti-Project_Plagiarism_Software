package com.plag.service;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import io.joshworks.restclient.http.HttpResponse;
import com.plag.PlagServletAPI;
import com.plag.dao.ConceptDao;
import com.plag.model.Concept;

public class Add_Concept_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int plag_state = 0;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		 if (session.getAttribute("lecturer") != null) {
			
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String title = request.getParameter("title");
		String concept_paper = request.getParameter("concept_paper");
		String reg_no = request.getParameter("reg_no");
		
		PlagServletAPI plag = new PlagServletAPI();
		
		List<Concept> list=ConceptDao.getAllConcepts();
		for(Concept c:list){
			String testpaper = c.concept_paper;
			HttpResponse<String> test = plag.plagcheck(concept_paper, testpaper);
			String newtest = test.getBody();
		   System.out.println(newtest);
		}
		
		if (plag_state >= 50) {
			Concept c = new Concept();
			c.setTitle(title);
			c.setConcept_paper(concept_paper);
			c.setReg_no(reg_no);
			int status = ConceptDao.save(c);
			if (status > 0) {
				System.out.print("<p>Concept added successfully!</p>");
				request.getRequestDispatcher("html/submitsuccess.html").include(request, response);
			} else {
				System.out.println("Sorry! unable to save record");
			}

			System.out.close();
		} else {

			System.out.print("<p>Plagarised Content Found!</p>");
			request.getRequestDispatcher("html/submitfailure.html").include(request, response);
		}

	}
		 else {
			 System.out.println("Unauthorised access");
		 }
		 
	}

}
