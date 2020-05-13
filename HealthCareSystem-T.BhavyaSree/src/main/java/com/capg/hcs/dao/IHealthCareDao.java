package com.capg.hcs.dao;

import java.util.List;

import com.capg.hcs.entity.TestBean;

public interface IHealthCareDao {
public TestBean addTest(TestBean bean);
public List<TestBean> displaytest();
}
