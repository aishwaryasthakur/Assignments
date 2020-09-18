package com.training.exceptions;

public class MyCustomException extends Exception {

	private String message;
	public MyCustomException(String message, Throwable cause) {
		super(message, cause);
		this.message = message;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Null Pointer Exception : " + message + " " + super.getMessage();
	}
	
	

}
