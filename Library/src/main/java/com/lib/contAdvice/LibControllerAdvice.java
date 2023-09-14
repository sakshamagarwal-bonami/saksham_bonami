package com.lib.contAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.lib.exceptions.NotFoundException;

@ControllerAdvice
public class LibControllerAdvice {
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<String> notFound(NotFoundException e){
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
	}
}
