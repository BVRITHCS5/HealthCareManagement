package com.capg.hcs.exception;

public class HealthCareException extends Exception {

private static final long serialVersionUID = 1L;
public HealthCareException() {
	super();
}
	public HealthCareException(final String message) {
		super(message);
}
}