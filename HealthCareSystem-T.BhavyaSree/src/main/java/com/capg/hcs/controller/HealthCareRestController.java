package com.capg.hcs.controller;
import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.hcs.entity.TestBean;

import com.capg.hcs.service.HealthCareServiceImpl;
@CrossOrigin(origins = "http://localhost:4450")
@RestController
@RequestMapping(path="/healthcare")
public class HealthCareRestController {
@Autowired
HealthCareServiceImpl healthservice;

//@author BhavyaSree:This method addTest() will add a test into a particular center.
//http://localhost:8068/healthcare/create
// POSTMAN (Post : body{ "test_name": "ent", "center_name": "yashoda"}
@PostMapping(path="/create")       //postman :POST
public ResponseEntity<Boolean> addTest(@Valid @RequestBody TestBean bean) {
TestBean test=healthservice.addTest(bean);
ResponseEntity<Boolean> responseEntity=new ResponseEntity(true,HttpStatus.OK);
return responseEntity;
}

//@author BhavyaSree:This method List<TestBean> shows the list of tests present in all the centers.
//http://localhost:8068/healthcare/show 
@GetMapping(path= "/show")        //postman:GET    
public ResponseEntity<List<TestBean>> displaytest()
{
List<TestBean> bean=healthservice.displaytest();
return new ResponseEntity<List<TestBean>>(bean,new HttpHeaders(),HttpStatus.OK);
}
 }

