package com.mindtree.MHCHospital.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFilter;

@Entity
@Table
@JsonFilter("DoctorFilter")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(unique = true)
	private String name;
	private int age;
	private String gender;
	private String specialized_field;
	private int patient_count=0;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialized_field() {
		return specialized_field;
	}
	public void setSpecialized_field(String specialized_field) {
		this.specialized_field = specialized_field;
	}
	public int getPatient_count() {
		return patient_count;
	}
	public void setPatient_count() {
		this.patient_count += 1;
	}
	@OneToMany
    private List<Patient> patients;

    public List<Patient> getPatients() {
        return patients;
    }

    public void addPatients(Patient patient) {
        patients.add(patient);
    }
	
	public Doctor(long id, String name, int age, String gender, String specialized_field, int patient_count) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialized_field = specialized_field;
	}
	public Doctor() {
		
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", specialized_field="
				+ specialized_field + "]";
	}
	
	
	
	
	

}
