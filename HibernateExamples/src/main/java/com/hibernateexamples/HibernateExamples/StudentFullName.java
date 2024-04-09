package com.hibernateexamples.HibernateExamples;

import javax.persistence.Embeddable;

@Embeddable // map the objects properties to the another class
public class StudentFullName {
	
	private String fname;
	private String mname;
	private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "StudentFullName [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}
	
	

}
