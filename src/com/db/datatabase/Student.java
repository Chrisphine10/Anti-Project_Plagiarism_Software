package com.db.datatabase;

public class Student {
	  public String reg_no;
	  public String first_name;
	  public String last_name;
	  public String email;
	  public String phone_number;
	  public String password;
	  public String lecturer_id_no;
	  
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String reg_no, String first_name, String last_name, String email, String phone_number, String password,
			String lecturer_id_no) {
		super();
		this.reg_no = reg_no;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
		this.password = password;
		this.lecturer_id_no = lecturer_id_no;
	}

	public String getReg_no() {
		return reg_no;
	}

	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
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

	public String getLecturer_id_no() {
		return lecturer_id_no;
	}

	public void setLecturer_id_no(String lecturer_id_no) {
		this.lecturer_id_no = lecturer_id_no;
	}
	
	
	
	  

		

}
