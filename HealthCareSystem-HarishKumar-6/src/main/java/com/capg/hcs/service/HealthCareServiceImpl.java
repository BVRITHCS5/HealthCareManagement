package com.capg.hcs.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.hcs.dao.IHealthCareDao;
import com.capg.hcs.dao.IHealthCareDao1;
import com.capg.hcs.entity.Appointment;

@Service
@Transactional
public class HealthCareServiceImpl implements IHealthCareService{

	@Autowired
	IHealthCareDao dao;
	
	@Autowired
	IHealthCareDao1 dao1;
	@Override
	public Appointment addAppointment(Appointment appointment) {
		
		return dao.addAppointment(appointment);
		//dao1.save(appointment);
	}

	

	@Override
	public List<Appointment> getAllAppointment() {
		// TODO Auto-generated method stub
		return dao.getAllAppointment();
	}

	public void deleteAppointment(int appId) {
		dao.deleteAppointment(appId);
		
	}

	@Override
	public Appointment findCenters(String name) {
		// TODO Auto-generated method stub
		return dao.findCenters(name);
	}



	@Override
	public String update(int appointmentId, String approved) {
		// TODO Auto-generated method stub
		if(dao1.update(appointmentId, approved)>0) {
			return "updated succesfully";
		}
		else {
		return "not updated";
	}
	}





	



	

}
