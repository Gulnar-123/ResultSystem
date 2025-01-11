package com.example.ResultSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	String emailid,birthdate,gender,persuingyear,faculty,semester;
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Profile(String emailid, String birthdate, String gender, String persuingyear, String faculty,
			String semester) {
		super();
		this.emailid = emailid;
		this.birthdate = birthdate;
		this.gender = gender;
		this.persuingyear = persuingyear;
		this.faculty = faculty;
		this.semester = semester;
	}


	public String getSemester() {
		return semester;
	}


	public void setSemester(String semester) {
		this.semester = semester;
	}


	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPersuingyear() {
		return persuingyear;
	}
	public void setPersuingyear(String persuingyear) {
		this.persuingyear = persuingyear;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	@Override
	public String toString() {
		return "Profile [pid=" + pid + ", emailid=" + emailid + ", birthdate=" + birthdate + ", gender=" + gender
				+ ", persuingyear=" + persuingyear + ", faculty=" + faculty + "]";
	}	
}
