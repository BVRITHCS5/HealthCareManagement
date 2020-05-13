package com.capg.hcs.controller;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HealthCareRestController {

=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.hcs.entity.Appointment;
import com.capg.hcs.service.IHealthCareService;


@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class HealthCareRestController {
	
	@Autowired
	IHealthCareService service;
	
	@PostMapping(path="/appointment/create")  
	//postman :POST
	public ResponseEntity<Boolean> makeanAppointment(@RequestBody Appointment bean) {
		Appointment b = service.makeanAppointment(bean);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity("Hello " + b.getUserName() + " Your Registration is Successfull", HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
		
		//return  "Hello " + b.getUserName() + "\n Your Registration is Successfull\n" ;
	}
	@DeleteMapping("/appointment/delete/{appointmentId}") // postman: DELETE
	public ResponseEntity<String> deleteAppointment(@PathVariable int appointmentId) {
		service.deleteAppointment(appointmentId);
		ResponseEntity<String> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;

		//return "Your Appointment with id: " + appointmentbean.getAppointmentId() + " has been deleted";
	}
	
	@GetMapping("/appointment/findall") 
	public ResponseEntity<List<Appointment>> getAll() {

		List<Appointment> bean = service.getAll();
		return new ResponseEntity<List<Appointment>>(bean,new HttpHeaders(),HttpStatus.OK);
	}
    

    
   
>>>>>>> branch 'master' of https://github.com/BVRITHCS5/HealthCareManagement.git
}
