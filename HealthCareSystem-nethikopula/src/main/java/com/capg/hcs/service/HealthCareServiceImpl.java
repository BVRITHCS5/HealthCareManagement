package com.capg.hcs.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.hcs.dao.IHealthCareDao;
import com.capg.hcs.entity.DiagnosticCenter;

@Service

public class HealthCareServiceImpl implements IHealthCareService {
	@Autowired
	IHealthCareDao dao;
	
	@Override
	public DiagnosticCenter addCenter(DiagnosticCenter center) {
		
		return dao.addCenter(center);
	}
	@Override
	public void removeCenter(int center_id) 
	{		
		dao.removeCenter(center_id);
	}
	
	@Override
	public List<DiagnosticCenter> displaycenter() {
		
		return dao.displaycenter();
	}

}
