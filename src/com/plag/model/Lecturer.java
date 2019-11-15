package com.plag.model;

public class Lecturer {
	  public int lecturer_id_no;
	  public String first_name;
	  public String last_name;
	  public String payroll_number;
	  public String email;
	  public String phone_number;
	  public String password;
	  
	public Lecturer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lecturer(int lecturer_id_no, String first_name, String last_name, String payroll_number, String email,
			String phone_number, String password) {
		super();
		this.lecturer_id_no = lecturer_id_no;
		this.first_name = first_name;
		this.last_name = last_name;
		this.payroll_number = payroll_number;
		this.email = email;
		this.phone_number = phone_number;
		this.password = password;
	}

	public int getLecturer_id_no() {
		return lecturer_id_no;
	}

	public void setLecturer_id_no(int lecturer_id_no) {
		this.lecturer_id_no = lecturer_id_no;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPayroll_number() {
		return payroll_number;
	}

	public void setPayroll_number(String payroll_number) {
		this.payroll_number = payroll_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	} 
	  
	  
	}