package com.capg.hcs.dao;

import java.util.List;

import com.capg.hcs.entity.Appointment;

public interface IHealthCareDao {



	public Appointment makeanAppointment(Appointment bean);
	public Appointment deleteAppointment(int appointmentId);
	public List<Appointment> getAll();
	

}
