package com.capg.hcs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.capg.hcs.entity.DiagnosticCenterBean;

@Repository
@Transactional
public class HealthCareDaoImpl implements IHealthCareDao {
	
	@PersistenceContext
	EntityManager em;
	@Override
	public DiagnosticCenterBean addCenter(DiagnosticCenterBean center) {
		
		 em.persist(center);
		 
		 return center;
		 
	}
	
	@Override
	public DiagnosticCenterBean getCenter(int center_id) {
		
		return em.find(DiagnosticCenterBean.class, center_id);
	}

	@Override
	public List<DiagnosticCenterBean> displaycenter() {
		
			TypedQuery<DiagnosticCenterBean> query = em.createQuery("from DiagnosticCenterBean", DiagnosticCenterBean.class);
			return query.getResultList();
	}

	@Override
	public DiagnosticCenterBean deleteCenter(int center_id) {
		
		DiagnosticCenterBean center = em.find(DiagnosticCenterBean.class, center_id);
		em.remove(center);
		 
		
		return center;
	}
	

}
