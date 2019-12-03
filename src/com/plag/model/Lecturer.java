package com.plag.model;

public class Lecturer {
	  public String lecturer_id_no;
	  public String first_name;
	  public String last_name;
	  public String email;
	  public String id_no;
	  public String password;
	  public String salt;
	  
	public Lecturer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lecturer(String lecturer_id_no, String first_name, String last_name, String email, String id_no,
			String password, String salt) {
		super();
		this.lecturer_id_no = lecturer_id_no;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.id_no = id_no;
		this.password = password;
		this.salt = salt;
	}

	public String getLecturer_id_no() {
		return lecturer_id_no;
	}

	public void setLecturer_id_no(String lecturer_id_no) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId_no() {
		return id_no;
	}

	public void setId_no(String id_no) {
		this.id_no = id_no;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	
	}