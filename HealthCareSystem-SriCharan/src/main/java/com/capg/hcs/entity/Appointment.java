package com.capg.hcs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Appointment")

public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="sequence1")
private int appointmentId;	
private String userName;
private long contactNumber;
private int age;
private String centerName;
private String testName;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public long getContactNumber() {
	return contactNumber;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCenterName() {
	return centerName;
}
public void setCenterName(String centerName) {
	this.centerName = centerName;
}
public String getTestName() {
	return testName;
}
public void setTestName(String testName) {
	this.testName = testName;
}

public int getAppointmentId() {
	return appointmentId;
}
public void setAppointmentId(int appointmentId) {
	this.appointmentId = appointmentId;
}
public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}
@Override
public String toString() {
	return "Appointment [userName=" + userName + ", contactNumber=" + contactNumber + ", age=" + age + ", centerName="
			+ centerName + ", testName=" + testName + "]";
}


}

