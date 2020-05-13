package com.capg.hcs.service;



import java.util.List;

import com.capg.hcs.entity.Appointment;

public interface IHealthCareService  {
	
	public Appointment addAppointment(Appointment appointment);
	
	public String update(int appointmentId,String approved);
	
	public List<Appointment> getAllAppointment();
	
	void deleteAppointment(int appId);
	
	public Appointment findCenters(String name);
	
	
	

}
