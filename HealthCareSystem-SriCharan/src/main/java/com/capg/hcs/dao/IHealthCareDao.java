package com.capg.hcs.dao;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.hcs.entity.HealthCareBean;

public interface IHealthCareDao extends JpaRepository<HealthCareBean, String>{
 
=======
import java.util.List;

import com.capg.hcs.entity.Appointment;

public interface IHealthCareDao {



	public Appointment makeanAppointment(Appointment bean);
	public Appointment deleteAppointment(int appointmentId);
	public List<Appointment> getAll();
	
>>>>>>> branch 'master' of https://github.com/BVRITHCS5/HealthCareManagement.git

}
