package com.ims.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ims.Exception.EmptyInputException;

@RestControllerAdvice
public class StudentControllerAdvice {
	
	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handleEmptyInput(EmptyInputException emptyInput){
			return new ResponseEntity<String>(emptyInput.getMessage(),HttpStatus.BAD_REQUEST);
	}
}
