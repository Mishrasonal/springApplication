package com.springbootdatajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springbootdatajpa.dao.DoctorRepository;
import com.springbootdatajpa.model.DoctorDetails;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	@Transactional
	public List<DoctorDetails> readAllDoctors(DoctorDetails doctorDetails) {

		return (List<DoctorDetails>) doctorRepository.findAll();
	}

	@Override
	@Transactional
	public DoctorDetails findByDoctorIdAndDoctorName(int doctorId, String doctorName) {

		return doctorRepository.findByDoctorIdAndDoctorName(doctorId, doctorName);
	}

	@Override
	@Transactional
	public DoctorDetails updateDoctor(DoctorDetails doctorDetails) {

		return doctorRepository.save(doctorDetails);
	}

	@Override
	public DoctorDetails createDoctor(DoctorDetails doctorDetails) {

		return doctorRepository.save(doctorDetails);
	}

	@Override
	public int deleteById(int doctorId) {

		doctorRepository.deleteById(doctorId);
		
		return 1;
	}

}
