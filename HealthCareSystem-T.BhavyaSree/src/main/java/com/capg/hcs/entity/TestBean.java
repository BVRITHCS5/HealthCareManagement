package com.capg.hcs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="Health_Spring")
public class TestBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int test_id;
	
	@NotEmpty(message="Testname is mandatory field.Please provide testname")
	@Size(min=4,message= "Name should have atleast:4 characters")
	private String test_name;
	
	@NotEmpty(message="Centername is mandatory field.Please provide centername")
	@Size(min=4,message= "Name should have atleast:4 characters")
	private String center_name;
	
	@NotEmpty(message="Centerlocation is mandatory field.Please provide centerlocation")
	@Size(min=4,message= "Location should have atleast:4 characters")
	private String center_location;
	
    
	public String getCenter_location() {
    return center_location;
	}

	public void setCenter_location(String center_location) {
		this.center_location = center_location;
	}

    public String getCenter_name() {
		return center_name;
	}

	public void setCenter_name(String center_name) {
		this.center_name = center_name;
	}

	public int getTest_id() {
		return test_id;
	}

	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}

	public String getTest_name() {
		return test_name;
	}

	public void setTest_name(String test_name) {
		this.test_name = test_name;
	}

	
	
	
	

}
