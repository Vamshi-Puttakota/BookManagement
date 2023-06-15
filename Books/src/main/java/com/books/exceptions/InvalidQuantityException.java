package com.books.exceptions;

public class InvalidQuantityException extends RuntimeException {

	public InvalidQuantityException() {
		super("Invalid quantity entered");
		// TODO Auto-generated constructor stub
	}

	public InvalidQuantityException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
