package com.capg.hcs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AppointmentList")
public class Appointment {
	
	
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE) 
	private int appointmentId;
	private String datetime;
	private String test;
	private String approved; 
		
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getdatetime() {
		return datetime;
	}
	public void setdatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getApproved() {
		return approved;
	}
	public void setApproved(String approved) {
		this.approved = approved;
	}


	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", datetime=" + datetime + ", test=" + test + ", approved="
				+ approved + "]";
	}


}
