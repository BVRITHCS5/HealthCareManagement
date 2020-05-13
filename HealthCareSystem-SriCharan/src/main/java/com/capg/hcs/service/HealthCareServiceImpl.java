package com.capg.hcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.capg.hcs.dao.IHealthCareDao;
import com.capg.hcs.entity.Appointment;


@Service
@Repository
public  class HealthCareServiceImpl implements IHealthCareService {

	@Autowired
	IHealthCareDao dao;
	
	@Override
	public Appointment makeanAppointment(Appointment bean) {
		
		return dao.makeanAppointment(bean);
	}
	

	@Override
	public Appointment deleteAppointment(int appointmentId) {
		
		return dao.deleteAppointment(appointmentId);
	}


	@Override
	public List<Appointment> getAll() {
		
		return dao.getAll();
	}
	

	

	

	
}
