package com.hibernateexamples.HibernateExamples;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private StudentFullName sfn;
	private String adress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public StudentFullName getSfn() {
		return sfn;
	}
	public void setSfn(StudentFullName sfn) {
		this.sfn = sfn;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + sfn + ", adress=" + adress + "]";
	}
	
	
	
	

}
