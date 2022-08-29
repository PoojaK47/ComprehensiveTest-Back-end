package com.mindtree.MHCHospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.MHCHospital.Entity.Patient;
import com.mindtree.MHCHospital.Exception.ResourceNotFoundException;
import com.mindtree.MHCHospital.Service.mhcHospitalService;

@RestController
@RequestMapping("/patients")
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {
	
	 @Autowired
	    mhcHospitalService service;

	 	@CrossOrigin(origins = "http://localhost:4200")
	    @GetMapping("/patient/{id}")
	    public Patient showPatientInformation(@PathVariable Long id){
	        Patient patient = service.showPatientInformation(id);
	        if(patient == null){
	            throw new ResourceNotFoundException(id + " is not in database");
	        }
	        return patient;
	    }

	 	@CrossOrigin(origins = "http://localhost:4200")
	    @PostMapping("/patient")
	    public boolean add(@RequestBody Patient patient){
	        service.savePatientInformation(patient);
	        return true;
	    }

}
