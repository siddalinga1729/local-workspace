package com.employee.exception.handler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.employee.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestControllerAdvice
public class CustomExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public String handleResourceNotFoundException(ResourceNotFoundException e) {

		return e.getMessage();
	}

}
