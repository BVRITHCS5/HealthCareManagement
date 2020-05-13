package com.capg.hcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.capg.hcs.dao.IHealthCareDao;
import com.capg.hcs.entity.TestBean;

@Service
public class HealthCareServiceImpl implements IHealthCareService {
@Autowired
IHealthCareDao healthdao;

public TestBean addTest(@RequestBody TestBean bean) {
	return healthdao.addTest(bean);
}


public List<TestBean> displaytest() {
	return healthdao.displaytest();
}}