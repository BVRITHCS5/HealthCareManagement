package com.capg.hcs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.capg.hcs.entity.Appointment;




@Repository
@Transactional
public class HealthCareDaoImpl implements IHealthCareDao {

	@PersistenceContext
	EntityManager entityManager;
	
	
	
	@Override
	public Appointment addAppointment(Appointment appointment) {
	
		entityManager.persist(appointment);
		System.out.println(appointment);
		return appointment;
	}

	@Override
	public List<Appointment> getAllAppointment() {
		
		TypedQuery<Appointment> query=entityManager.createQuery("from Appointment",Appointment.class);
		return query.getResultList();
	}

	@Override
	public void deleteAppointment(int appId) {
		
		Appointment app=entityManager.find(Appointment.class, appId);
		entityManager.remove(app);


		
	}

	@Override
	public Appointment findCenters(String name) {
		
		Appointment app=entityManager.find(Appointment.class, name);
		return app;
	}

}
