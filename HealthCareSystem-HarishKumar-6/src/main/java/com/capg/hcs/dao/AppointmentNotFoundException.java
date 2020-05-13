package com.capg.hcs.dao;

public class AppointmentNotFoundException extends RuntimeException{
	public AppointmentNotFoundException(String msg) {
		super(msg);
	}
	public AppointmentNotFoundException(String msg,Throwable e) {
		super(msg,e);
	}

}
