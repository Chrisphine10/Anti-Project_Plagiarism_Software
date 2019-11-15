package com.plag.model;

public class Concept {
	public int concept_paper_id;
	public String title;
	public String concept_paper_name;
	public String reg_no;
	public String date_of_submission;
	public String date_of_acceptance;
	public String status;
	
	public Concept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Concept(int concept_paper_id, String title, String concept_paper_name, String reg_no,
			String date_of_submission, String date_of_acceptance, String status) {
		super();
		this.concept_paper_id = concept_paper_id;
		this.title = title;
		this.concept_paper_name = concept_paper_name;
		this.reg_no = reg_no;
		this.date_of_submission = date_of_submission;
		this.date_of_acceptance = date_of_acceptance;
		this.status = status;
	}

	public int getConcept_paper_id() {
		return concept_paper_id;
	}

	public void setConcept_paper_id(int concept_paper_id) {
		this.concept_paper_id = concept_paper_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getConcept_paper_name() {
		return concept_paper_name;
	}

	public void setConcept_paper_name(String concept_paper_name) {
		this.concept_paper_name = concept_paper_name;
	}

	public String getReg_no() {
		return reg_no;
	}

	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}

	public String getDate_of_submission() {
		return date_of_submission;
	}

	public void setDate_of_submission(String date_of_submission) {
		this.date_of_submission = date_of_submission;
	}

	public String getDate_of_acceptance() {
		return date_of_acceptance;
	}

	public void setDate_of_acceptance(String date_of_acceptance) {
		this.date_of_acceptance = date_of_acceptance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
