package com.capg.hcs.service;

import java.util.List;

import com.capg.hcs.entity.Appointment;

public interface IHealthCareService {
	public Appointment makeanAppointment(Appointment bean);
	public Appointment deleteAppointment(int appointmentId);
	public List<Appointment> getAll();
	
	
}
