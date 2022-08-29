package com.mindtree.MHCHospital;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.MHCHospital.Entity.Doctor;
import com.mindtree.MHCHospital.Repository.DoctorRepository;

@SpringBootTest
class MhcHospitalApplicationTests {

	
	@Autowired
	DoctorRepository doctorRepo;
	@Test
	public void jTest() {
		
		Doctor doc= new Doctor();
		doc.setId(0);
		doc.setName("Dr.Roy");
		doc.setAge(46);
		doc.setGender("male");
		doc.setSpecialized_field("Dentist");
		doc.setPatient_count();
		
		doctorRepo.save(doc);
		
	}

}
