package com.simplilearn.webservice.exceptions;

public class UserAlreadyExistException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	public UserAlreadyExistException(String message) {
		super(message);
		//this.message = message;
	}
	
	
	

}
