package com.capg.hcs.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.hcs.entity.DiagnosticCenter;

@Repository
@Transactional

public class HealthCareDaoImpl implements IHealthCareDao {
	@PersistenceContext
	  EntityManager entitymanager;
	/**
	 * 
	 * @author mounika: this add center method  will add a center in to the bean
	 * 
	 */
	@Override
	public DiagnosticCenter addCenter(DiagnosticCenter center) {
		 entitymanager.persist(center);
		 return center;
		 
	}
	/**
	 * 
	 * @author mounika: this remove center will delete the details of Question from bean
	 */
	@Override
	public void removeCenter(int center_id) 
	{
		DiagnosticCenter b = entitymanager.find(DiagnosticCenter.class, center_id);
		 entitymanager.remove(b);
		
	}
	/**
	 * author mounika:this method will retrieve the details of centers
	 */
	@Override
	public List<DiagnosticCenter> displaycenter() {
		
			TypedQuery<DiagnosticCenter> query = entitymanager.createQuery("from DiagnosticCenter", DiagnosticCenter.class);
			return query.getResultList();
	}
}
