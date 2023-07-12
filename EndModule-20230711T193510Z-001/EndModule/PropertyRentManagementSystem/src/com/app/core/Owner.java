package com.app.core;

import java.time.LocalDate;

public class Owner {
private String adharNo;
private String firstName;
private String lastName;
private String email;
private String propertyAddress;
private String mobNo;
private PropertyType propertytype;
private LocalDate availabilityDate;
private int rent;

private boolean isRentOut;
public Owner(String adharNo, String firstName, String lastName, String email, String propertyAddress, String mobNo,
		PropertyType propertytype, LocalDate availabilityDate, int rent) {
	super();
	this.adharNo = adharNo;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.propertyAddress = propertyAddress;
	this.mobNo = mobNo;
	this.propertytype = propertytype;
	this.availabilityDate = availabilityDate;
	this.rent = rent;
	this.isRentOut=false;
}
public String getAdharNo() {
	return adharNo;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public String getEmail() {
	return email;
}
public String getPropertyAddress() {
	return propertyAddress;
}
public String getMobNo() {
	return mobNo;
}
public PropertyType getPropertytype() {
	return propertytype;
}
public LocalDate getAvailabilityDate() {
	return availabilityDate;
}
public int getRent() {
	return rent;
}
public boolean isRentOut() {
	return isRentOut;
}
public String setMobNo(String mobNo) {
	return mobNo;
}
@Override
public String toString() {
	return "Owner [adharNo=" + adharNo + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", propertyAddress=" + propertyAddress + ", mobNo=" + mobNo + ", propertytype=" + propertytype
			+ ", availabilityDate=" + availabilityDate + ", rent=" + rent + ", isRentOut=" + isRentOut + "]";
}

}
