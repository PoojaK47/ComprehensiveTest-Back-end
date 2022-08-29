package com.mindtree.MHCHospital;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mindtree.MHCHospital.Entity.Patient;
import com.mindtree.MHCHospital.Repository.PatientRepository;

class MhcHospitalTest2 {

	@Autowired
	PatientRepository patientRepo;
	
	@Test
	public void jUnitTest() {
			
			Patient p= new Patient();
			p.setId(0);
			p.setName("Indra");
			p.setAge(56);
			p.setGender("female");
			p.setVisitedDoctor("Dr.Anjali Menon");
			p.setPrescription("Diet Plan");
			
			patientRepo.save(p);
	}

}
