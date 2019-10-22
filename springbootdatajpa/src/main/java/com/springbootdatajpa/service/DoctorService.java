package com.springbootdatajpa.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.springbootdatajpa.model.DoctorDetails;

public interface DoctorService {

	public abstract List<DoctorDetails> readAllDoctors(DoctorDetails doctorDetails);
	
	public DoctorDetails createDoctor(DoctorDetails doctorDetails);

	public abstract DoctorDetails updateDoctor(DoctorDetails doctorDetails);
	
	public abstract int deleteById(int doctorId);
	
	public abstract DoctorDetails findByDoctorIdAndDoctorName(int doctorId, String doctorName);
	

}
