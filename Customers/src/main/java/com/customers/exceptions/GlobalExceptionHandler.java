package com.customers.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.customers.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerCustomerNotFoundException(CustomerNotFoundException ex)
	{
		String message = ex.getMessage();
		ApiResponse resp = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
		
		return new ResponseEntity<>(resp,HttpStatus.NOT_FOUND);
	}

	
	@ExceptionHandler(UserExsistsException.class)
	public ResponseEntity<ApiResponse> handlerUserExsistsException(UserExsistsException ex)
	{
		String message = ex.getMessage();
		ApiResponse resp = ApiResponse.builder().message(message).success(true).status(HttpStatus.CONFLICT).build();
		
		return new ResponseEntity<>(resp,HttpStatus.CONFLICT);
	}

}
