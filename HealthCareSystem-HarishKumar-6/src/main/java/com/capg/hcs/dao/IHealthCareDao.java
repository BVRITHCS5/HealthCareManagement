package com.capg.hcs.dao;

import java.util.List;

import com.capg.hcs.entity.Appointment;

public interface IHealthCareDao  {
	
public Appointment addAppointment(Appointment appointment);
	

	
	public List<Appointment> getAllAppointment();
	
	public void deleteAppointment(int empId);
	
	public Appointment findCenters(String name);

}
