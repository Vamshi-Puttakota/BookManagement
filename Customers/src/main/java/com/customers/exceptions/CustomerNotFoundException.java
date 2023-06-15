package com.customers.exceptions;

public class CustomerNotFoundException extends RuntimeException{

	public CustomerNotFoundException() {
		super("NO customers found");
		// TODO Auto-generated constructor stub
	}

	public CustomerNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

}
