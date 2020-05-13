package com.capg.hcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.hcs.entity.DiagnosticCenter;
import com.capg.hcs.service.HealthCareServiceImpl;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HealthCareController {
	@Autowired
	HealthCareServiceImpl hcsi;

	/**
	 * 
	 * @author mounika: this addcenter will add a center in to the database
	 * 
	 */
	@PostMapping("/healthcare/add")
	 public DiagnosticCenter addCenter(@RequestBody DiagnosticCenter center) {
			DiagnosticCenter dc = hcsi.addCenter(center);
			return dc;
		}

	/**
	 * 
	 * @author mounika: this removecenter will remove a center from the database
	 * 
	 */
	@DeleteMapping("/healthcare/remove/{center_id}")
	 public ResponseEntity<Boolean> removeCenter(@PathVariable int center_id) {
			 hcsi.removeCenter(center_id);
			 ResponseEntity<Boolean> responseEntity=new ResponseEntity(true,HttpStatus.OK);
			  System.out.println("response entity="+responseEntity);
		   return responseEntity;
		}
	 
	/**
	 * author mounika:this method will retrieve the details of the centers
	 */
	 @GetMapping("/healthcare/display")      
		public List<DiagnosticCenter> displayCenter() {

			List<DiagnosticCenter> center = hcsi.displaycenter();
			return  center;
		}

}
