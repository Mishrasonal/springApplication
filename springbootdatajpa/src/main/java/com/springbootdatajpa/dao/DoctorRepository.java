package com.springbootdatajpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootdatajpa.model.DoctorDetails;
@Repository
public interface DoctorRepository extends CrudRepository<DoctorDetails, Integer> {
	 
	public abstract DoctorDetails findByDoctorIdAndDoctorName(int doctorId, String doctorName);

}
