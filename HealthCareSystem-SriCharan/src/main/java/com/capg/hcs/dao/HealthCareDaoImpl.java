package com.capg.hcs.dao;

<<<<<<< HEAD
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.hcs.entity.HealthCareBean;
import com.capg.hcs.entity.Tests;
@Repository
@Transactional
public abstract class HealthCareDaoImpl implements IHealthCareDao{
	@PersistenceContext
	EntityManager em;

	public HealthCareBean makeAnAppointment(HealthCareBean bean) {
		em.persist(bean);
		return bean;
	}

	
=======
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.hcs.entity.Appointment;
@Repository
@Transactional

public class HealthCareDaoImpl implements IHealthCareDao {
	@PersistenceContext
	EntityManager em;
	
	@Override
	public Appointment makeanAppointment(Appointment bean) {
		em.persist(bean);
		return bean;
	}
	

	@Override
	public Appointment deleteAppointment(int appointmentId) {
		Appointment bean = em.find(Appointment.class, appointmentId);
		em.remove(bean);
		return bean;
	}


	@Override
	public List<Appointment> getAll() {
		TypedQuery<Appointment> query = em.createQuery("from Appointment", Appointment.class);
		return query.getResultList();
		
	}
	

>>>>>>> branch 'master' of https://github.com/BVRITHCS5/HealthCareManagement.git
}
