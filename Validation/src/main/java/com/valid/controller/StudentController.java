package com.valid.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valid.entities.Student;
import com.valid.service.StudentService;

@RestController
@RequestMapping("/valid")
public class StudentController {
	@Autowired
	private StudentService service;
	
	//post
	@PostMapping("/add")
	public ResponseEntity<String> addStudent(@Valid @RequestBody Student student){
		return service.createStudent(student);
	}
	
	@GetMapping("/student")
	public ResponseEntity<List<Student>> getAll(){
		return service.getAllStudents();
	}
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getById(@PathVariable Integer id){
		return service.getStudentById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Integer id){
		return service.deleteStudentById(id);
	}
}
