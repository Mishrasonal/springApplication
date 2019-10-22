package com.springbootdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdatajpa.model.DoctorDetails;
import com.springbootdatajpa.service.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, headers="Accept=application/json")
	public DoctorDetails createDoctor(@RequestBody DoctorDetails doctorDetails) {
		return doctorService.createDoctor(doctorDetails);

	}

	@RequestMapping(value = "/hai")
	public List<DoctorDetails> readAllDoctors(DoctorDetails doctorDetails) {
		return doctorService.readAllDoctors(doctorDetails);

	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT, headers="Accept=application/json")
	public DoctorDetails updateDoctor(@RequestBody DoctorDetails doctorDetails) {
		return doctorService.updateDoctor(doctorDetails);

	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, headers="Accept=application/json")
	public int deleteDoctor(@RequestParam int doctorId) {
		return doctorService.deleteById(doctorId);

	}

	@RequestMapping(value = "/getByTwoArguments", method = RequestMethod.GET, headers="Accept=application/json")
	public DoctorDetails findByDoctorIdAndDoctorName(@RequestParam int doctorId, @RequestParam String doctorName) {

		return doctorService.findByDoctorIdAndDoctorName(doctorId, doctorName);
	}

}
