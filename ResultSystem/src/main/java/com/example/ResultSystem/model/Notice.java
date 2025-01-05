package com.example.ResultSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Notice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int noticeid;
	private String date,message,discription;
	public Notice(int noticeid, String date, String message, String discription) {
		super();
		this.noticeid = noticeid;
		this.date = date;
		this.message = message;
		this.discription = discription;
	}
	public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNoticeid() {
		return noticeid;
	}
	public void setNoticeid(int noticeid) {
		this.noticeid = noticeid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "Notice [noticeid=" + noticeid + ", date=" + date + ", message=" + message + ", discription="
				+ discription + "]";
	}
	
	
	

}
