package com.ims.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ims.entity.Student;
import com.ims.repository.StudentRepository;
import com.ims.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	//POST
	@PostMapping("/create")
	public String createStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}
	//GET
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable Integer id) {
		return service.findStudentById(id);
	}
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return service.getALLStudents();
	}
	//PUT
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	//DELETE
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable Integer id) {
		return service.deleteStudentById(id);
	}
	
	
}
