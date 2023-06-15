package com.books.exceptions;

public class BookNotFoundException extends RuntimeException {

	public BookNotFoundException() {
		super("No books found");
		// TODO Auto-generated constructor stub
	}

	public BookNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
