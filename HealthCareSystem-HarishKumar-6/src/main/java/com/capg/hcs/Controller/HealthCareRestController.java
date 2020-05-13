package com.capg.hcs.Controller;

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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.hcs.entity.Appointment;
import com.capg.hcs.service.IHealthCareService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/approve")
public class HealthCareRestController {

	@Autowired
	IHealthCareService service;
	
	
	@PostMapping("/create")
	public Appointment createAppointment(@RequestBody Appointment appointment)
	{
		service.addAppointment(appointment);
		return appointment;
	}
	
	//by this url we can get the total list of Appointments
	@GetMapping("/findAll")
	public List<Appointment>getAllAppointments()
	{
		List<Appointment>appointment=service.getAllAppointment();
		return appointment;
		
	}
	
	//By This URL we can approve the appointment
	@PutMapping("/update/{appointmentId}/{approved}")
	public String updateAppointment(@PathVariable("appointmentId") int appointmentId, @PathVariable("approved") String approved) {
		//appointment.setApproved("yes");
		service.update(appointmentId,approved);
		return "Approved ID is"+ appointmentId;
	}
	
	//
	@DeleteMapping(path="/delete/{appointmentId}")
	public String deleteAppointment(@PathVariable("appointmentId") int appId) {
		service.deleteAppointment(appId);
		
		return "Deleted";
	}
	
	@GetMapping(path="/getappointments/{center}")
	public String searchCenter(@PathVariable String center){
		Appointment app=service.findCenters(center);
		return "list of centers ";
		
	}
	
	
	
}
