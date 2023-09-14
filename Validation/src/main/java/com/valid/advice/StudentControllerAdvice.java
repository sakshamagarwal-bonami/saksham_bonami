package com.valid.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.valid.exceptions.NotFoundException;

@ControllerAdvice
public class StudentControllerAdvice {
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<String> notFound(NotFoundException e){
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
		Map<String, String> response=new HashMap<String, String>();
		e.getBindingResult().getAllErrors().forEach((error)->{
			String fieldName=((FieldError)error).getField();
			String message=((FieldError)error).getDefaultMessage();
			response.put(fieldName, message);
		});
		
		return new ResponseEntity<Map<String,String>>(response,HttpStatus.BAD_REQUEST);
	}
	
}
