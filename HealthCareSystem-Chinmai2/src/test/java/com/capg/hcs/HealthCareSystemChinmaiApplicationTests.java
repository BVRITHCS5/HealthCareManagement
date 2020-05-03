package com.capg.hcs;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.hcs.entity.DiagnosticCenterBean;
import com.capg.hcs.service.HealthCareServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class HealthCareSystemChinmaiApplicationTests {
	@Autowired
	HealthCareServiceImpl hcsi;
	@Test
	public void displayCenter() {
		List<DiagnosticCenterBean> center=hcsi.displaycenter();
		assertEquals(center.size(),9);
	}
	
	/*
	 * @Test public void displaycenter() { DiagnosticCenterBean center =new
	 * DiagnosticCenterBean(); DiagnosticCenterBean output=(DiagnosticCenterBean)
	 * hcsi.displaycenter();
	 * assertEquals(center.getCenter_id().equals(output.getCenter_id()),true);
	 * 
	 * }
	 */

}
