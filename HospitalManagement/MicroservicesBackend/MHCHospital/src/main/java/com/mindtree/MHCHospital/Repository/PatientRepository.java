package com.mindtree.MHCHospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mindtree.MHCHospital.Entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	

}
