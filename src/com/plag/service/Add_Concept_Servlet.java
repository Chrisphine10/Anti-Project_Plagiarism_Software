package com.plag.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.plag.dao.ConceptDao;
import com.plag.model.Concept;

/**
 * Servlet implementation class ConceptHandler
 */

public class Add_Concept_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	boolean plag_state = true;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String title = request.getParameter("title");
		String concept_paper = request.getParameter("concept_paper");
		String reg_no = request.getParameter("reg_no");

		if (plag_state == false) {
			Concept c = new Concept();
			c.setTitle(title);
			c.setConcept_paper(concept_paper);
			c.setReg_no(reg_no);
			int status = ConceptDao.save(c);
			if (status > 0) {
				System.out.print("<p>Conq	cept added successfully!</p>");
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

}
