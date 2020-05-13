package com.capg.hcs.Testing;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.hcs.dao.IHealthCareDao;
import com.capg.hcs.entity.TestBean;
import com.capg.hcs.service.HealthCareServiceImpl;
@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {
@Autowired
HealthCareServiceImpl healthservice;
@MockBean
private IHealthCareDao healthdao;
	
@Test
public void testaddTest()
{
	TestBean test=new TestBean();
	test.setTest_id(160);
	test.setCenter_location("hydernagar");
	test.setCenter_name("pranaam");
	test.setTest_name("braincancer");
	Mockito.when(healthdao.addTest(test)).thenReturn(test);
	assertThat(healthservice.addTest(test)).isEqualTo(test);
}
@Test
public void testdisplaytest() {
	TestBean test1=new TestBean();
	test1.setTest_id(180);
	test1.setCenter_location("tirupathi");
	test1.setCenter_name("usha");
	test1.setTest_name("dengue");
	
	TestBean test2=new TestBean();
	test2.setTest_id(181);
	test2.setCenter_location("warangal");
	test2.setCenter_name("apollo");
	test2.setTest_name("cancer");
	
	List<TestBean> testlist=new ArrayList<>();
	testlist.add(test1);
	testlist.add(test2);
	
	Mockito.when(healthdao.displaytest()).thenReturn(testlist);
	assertThat(healthservice.displaytest()).isEqualTo(testlist);
	
	}
@Test
public void displaytest() {
	TestBean test3=new TestBean();
	test3.setTest_id(180);
	test3.setCenter_location("tirupathi");
	test3.setCenter_name("usha");
	test3.setTest_name("dengue");
	
	TestBean test4=new TestBean();
	test4.setTest_id(181);
	test4.setCenter_location("warangal");
	test4.setCenter_name("apollo");
	test4.setTest_name("cancer");
	
	List<TestBean> testlist1=new ArrayList<>();
	testlist1.add(test3);
	testlist1.add(test4);
	
	Mockito.when(healthdao.displaytest()).thenReturn(testlist1);
	assertThat(healthservice.displaytest()).isEqualTo(testlist1);
	
	}
}
