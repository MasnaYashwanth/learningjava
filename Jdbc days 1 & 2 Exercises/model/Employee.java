package com.timesheet.model;

public class Employee {
	private int empid;
	private String empName;
	private String hcc;
	private String emailId;
	private java.util.Date date;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getHcc() {
		return hcc;
	}
	public void setHcc(String hcc) {
		this.hcc = hcc;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	
	
}
