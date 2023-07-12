package com.app.core;

import java.time.LocalDate;

public class Students 
{
	private String rollNo;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private double fees;
	private Course course;
	private Qualification qualification;
	private LocalDate DOB;
	private boolean isSubmitted;
	
	public Students(String rollNo, String firstName, String lastName, String email, String address, double fees,
			Course course, Qualification qualification, LocalDate dOB, boolean isSubmitted) 
	{
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.fees = fees;
		this.course = course;
		this.qualification = qualification;
		DOB = dOB;
		this.isSubmitted = isSubmitted;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public boolean isSubmitted() {
		return isSubmitted;
	}

	public void setSubmitted(boolean isSubmitted) {
		this.isSubmitted = isSubmitted;
	}

	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + ", fees=" + fees + ", course=" + course + ", qualification=" + qualification
				+ ", DOB=" + DOB + ", isSubmitted=" + isSubmitted + "]";
	}
	
}
