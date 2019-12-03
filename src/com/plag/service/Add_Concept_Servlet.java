package com.plag.service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.plag.PlagServletAPI;
import com.plag.dao.ConceptDao;
import com.plag.model.Concept;

public class Add_Concept_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//HttpSession session = request.getSession();

		int x = 0;
		//if (session.getAttribute("lecturer") != null)
		if (x == 0) {
			
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String title = request.getParameter("title");
		String concept_paper = request.getParameter("concept_paper");
		String reg_no = request.getParameter("reg_no");
		String state = "pending";
		 LocalDate today_l = LocalDate.now();
         String today = today_l.toString();
		
         Boolean v = false;
		PlagServletAPI plag = new PlagServletAPI();
		List<Concept> list=ConceptDao.getAllConcepts();
		for(Concept c:list){
			String testpaper = c.concept_paper;
			String s = plag.plagcheck(concept_paper, testpaper).getBody();
			v = s.isEmpty();
		} 
		if (v) {
			Concept c = new Concept();
			c.setTitle(title);
			c.setConcept_paper(concept_paper);
			c.setReg_no(reg_no);
			c.setStatus(state);
			c.setDate_of_submission(today);
			
			int status = ConceptDao.save(c);
			if (status > 0) {
				System.out.print("<p>Concept added successfully!</p>");
				response.sendRedirect("html/submitsuccess.html");
			} else {
				System.out.println("Sorry! unable to save record");
			}

			System.out.close();
		} else {
			System.out.print("<p>Plagarised Content Found!</p>");
			response.sendRedirect("html/submitfailure.html");
		}

	}
		 else {
			 System.out.println("Unauthorised access");
		 }
		 
	}

}
