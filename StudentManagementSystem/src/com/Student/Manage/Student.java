package com.Student.Manage;


public class Student {
	private int stud_id;
	private String stud_name;
	private String stud_phone;
	private String stud_city;
	
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getStud_phone() {
		return stud_phone;
	}
	public void setStud_phone(String stud_phone) {
		this.stud_phone = stud_phone;
	}
	public String getStud_city() {
		return stud_city;
	}
	public void setStud_city(String stud_city) {
		this.stud_city = stud_city;
	}
	public Student(int id, String stud_name, String stud_phone, String stud_city) {
		super();
		this.stud_id = id;
		this.stud_name = stud_name;
		this.stud_phone = stud_phone;
		this.stud_city = stud_city;
	}
	public Student(String stud_name, String stud_phone, String stud_city) {
		super();
		this.stud_name = stud_name;
		this.stud_phone = stud_phone;
		this.stud_city = stud_city;
	}
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_phone=" + stud_phone
				+ ", stud_city=" + stud_city + "]";
	}
	
	

}

