package com.capg.hcs.service;

<<<<<<< HEAD
public interface IHealthCareService {
	

=======
import java.util.List;

import com.capg.hcs.entity.Appointment;

public interface IHealthCareService {
	public Appointment makeanAppointment(Appointment bean);
	public Appointment deleteAppointment(int appointmentId);
	public List<Appointment> getAll();
	
	
>>>>>>> branch 'master' of https://github.com/BVRITHCS5/HealthCareManagement.git
}
