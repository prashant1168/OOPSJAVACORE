package com.app.core;

import java.time.LocalDate;

public class Patient 
{	
	private String patientId;
	private String patientName;
	private int age;
	private String gender;
	private String address;
	private String phoneNumber;
	private String disease;
	private LocalDate admitDate;
	private double annualIncome;
	private RoomType roomType;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String patientId, String patientName, int age, String gender, String address, String phoneNumber,
			String disease, LocalDate admitDate, double annualIncome, RoomType roomType) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.disease = disease;
		this.admitDate = admitDate;
		this.annualIncome = annualIncome;
		this.roomType = roomType;
	}
	
	public Patient(String patientId) {
		super();
		this.patientId = patientId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public LocalDate getAdmitDate() {
		return admitDate;
	}

	public void setAdmitDate(LocalDate admitDate) {
		this.admitDate = admitDate;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", age=" + age + ", gender="
				+ gender + ", address=" + address + ", phoneNumber=" + phoneNumber + ", disease=" + disease
				+ ", admitDate=" + admitDate + ", annualIncome=" + annualIncome + ", roomType=" + roomType + "]";
	}
		
}
