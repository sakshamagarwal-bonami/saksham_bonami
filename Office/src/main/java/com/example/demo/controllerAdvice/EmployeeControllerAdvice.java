package com.example.demo.controllerAdvice;

import java.security.PublicKey;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.Exceptions.NotFoundException;

@ControllerAdvice
public class EmployeeControllerAdvice {
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<String> notFound(NotFoundException e){
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
}
