package com.mindtree.MHCHospital.Implementation;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.MHCHospital.Entity.Doctor;
import com.mindtree.MHCHospital.Entity.Patient;
import com.mindtree.MHCHospital.Repository.DoctorRepository;
import com.mindtree.MHCHospital.Repository.PatientRepository;
import com.mindtree.MHCHospital.Service.mhcHospitalService;

@Repository
@Transactional
public class hosptlServiceImpl implements mhcHospitalService {
	
	@Autowired
    DoctorRepository doctorRepository;
    @Autowired
    PatientRepository patientRepository;
    
    @Override
    public Doctor showDoctorInformation(String name) {
        return doctorRepository.findByName(name);
    }

    @Override
    public Patient showPatientInformation(Long id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public boolean saveDoctorInformation(Doctor doctor) {
        doctorRepository.save(doctor);
        return true;
    }

    @Override
    public boolean savePatientInformation(Patient patient) {

        Doctor doctor = doctorRepository.findByName(patient.getVisitedDoctor());
        doctor.addPatients(patient);
        patientRepository.save(patient);
        doctor.setPatient_count();
        return true;
    }

    @Override
    public List<Patient> getPatientListOfDoctor(String name, Doctor doctor) {
        return doctor.getPatients();
    }

    @Override
    public List<Doctor> getDoctors() {
        return (List<Doctor>) doctorRepository.findAll();
    }

}
