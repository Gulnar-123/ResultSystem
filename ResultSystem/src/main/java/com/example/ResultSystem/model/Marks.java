package com.example.ResultSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Marks {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int marksid;
	private String emailid; 
	private int totalmarks,obtainedmarks;
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Marks(String emailid, int totalmarks, int obtainedmarks) {
		super();
		this.emailid = emailid;
		this.totalmarks = totalmarks;
		this.obtainedmarks = obtainedmarks;
	}
	public int getMarksid() {
		return marksid;
	}
	public void setMarksid(int marksid) {
		this.marksid = marksid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	public int getObtainedmarks() {
		return obtainedmarks;
	}
	public void setObtainedmarks(int obtainedmarks) {
		this.obtainedmarks = obtainedmarks;
	}
	@Override
	public String toString() {
		return "Marks [marksid=" + marksid + ", emailid=" + emailid + ", totalmarks=" + totalmarks + ", obtainedmarks="
				+ obtainedmarks + "]";
	}
	
	
	
	
	
}
