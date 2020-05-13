package com.capg.hcs.service;

import java.util.List;

import com.capg.hcs.entity.TestBean;

public interface IHealthCareService {
public TestBean addTest(TestBean bean);
public List<TestBean> displaytest();
}
