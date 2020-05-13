package com.capg.hcs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.hcs.entity.TestBean;
@Repository
@Transactional
public class HealthCareDaoImpl implements IHealthCareDao {
	@PersistenceContext
	EntityManager entitymanager;
	
	@Override
	public TestBean addTest(TestBean bean) {
		entitymanager.persist(bean);
		return bean;
	}

	@Override
	public List<TestBean> displaytest() {
		TypedQuery<TestBean> query=entitymanager.createQuery("from TestBean",TestBean.class);
		return query.getResultList();
	}

	
}