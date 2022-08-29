package com.mindtree.MHCHospital.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private int age;
	private String gender;
	
	@Column(unique = true)
	private String visitedDoctor;
	private LocalDate dateOfVisit;
	private String prescription;
	
	
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
	public String getVisitedDoctor() {
		return visitedDoctor;
	}
	public void setVisitedDoctor(String visitedDoctor) {
		this.visitedDoctor = visitedDoctor;
	}
	public LocalDate getDateOfVisit() {
		return dateOfVisit;
	}
	public void setDateOfVisit(LocalDate dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	
	public Patient() {
		
	}
	
	public Patient(long id, String name, int age, String gender, String visitedDoctor, LocalDate dateOfVisit,
			String prescription) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.visitedDoctor = visitedDoctor;
		this.dateOfVisit = dateOfVisit;
		this.prescription = prescription;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", visitedDoctor="+ visitedDoctor + ", dateOfVisit=" + dateOfVisit + "]";
	}
	

}
