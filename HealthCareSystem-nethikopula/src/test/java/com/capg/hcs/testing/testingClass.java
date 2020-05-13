package com.capg.hcs.testing;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.hcs.service.HealthCareServiceImpl;
import com.capg.hcs.dao.IHealthCareDao;
import com.capg.hcs.entity.DiagnosticCenter;
@RunWith(SpringRunner.class)
@SpringBootTest
public class testingClass {
@Autowired
HealthCareServiceImpl healthservice;
@MockBean
private IHealthCareDao healthdao;
@Test
public void addcenterTest()
{
	DiagnosticCenter dc = new DiagnosticCenter();
	dc.setCenter_id(22);
	dc.setCenter_name("yashoda");
	dc.setCenter_location("malakpet");
	dc.setTest("sugarTest");
	dc.setTest_1("bloodtest");
	dc.setTest_3("bloodgroup");
	Mockito.when(healthdao.addCenter(dc)).thenReturn(dc);
	assertThat(healthservice.addCenter(dc)).isEqualTo(dc);
}
@Test
public void testremovecenter(){
	DiagnosticCenter dc = new DiagnosticCenter(22,"yashoda","malakpet","bloodtest","sugarTest","bloodgroup");
	healthservice.removeCenter(22);
	verify(healthdao,times(1)).removeCenter(22);
	
}

}
