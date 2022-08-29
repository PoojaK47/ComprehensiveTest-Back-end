package com.mindtree.MHCHospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mindtree.MHCHospital.Entity.Doctor;

@Repository
@CrossOrigin(origins = "http://localhost:4200") 
public interface DoctorRepository  extends JpaRepository<Doctor, Long> {
	public Doctor findByName(String name);

}
