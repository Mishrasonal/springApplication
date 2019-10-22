package com.springbootdatajpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "doctordetails")
public class DoctorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "doctorId")
	private int  doctorId;
	@Column(name = "doctorName")
	private String doctorName;
	@Column(name = "password")
	private String password;
	public DoctorDetails() {
		super();
	}
	public DoctorDetails(int doctorId, String doctorName, String password) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.password = password;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
