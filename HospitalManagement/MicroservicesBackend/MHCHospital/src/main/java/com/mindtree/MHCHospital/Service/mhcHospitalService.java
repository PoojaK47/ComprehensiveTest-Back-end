package com.mindtree.MHCHospital.Service;

import java.util.List;

import com.mindtree.MHCHospital.Entity.Doctor;
import com.mindtree.MHCHospital.Entity.Patient;

public interface mhcHospitalService {
	
	public Doctor showDoctorInformation(String name);
    public Patient showPatientInformation(Long Id);
    public boolean saveDoctorInformation(Doctor doctor);
    public boolean savePatientInformation(Patient patient);
    public List<Patient> getPatientListOfDoctor(String name,Doctor doctor);
    public List<Doctor> getDoctors();


}
