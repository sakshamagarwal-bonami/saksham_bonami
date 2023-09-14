package com.lib.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lib.mysql.entitiy.Book;
import com.lib.postgres.entity.Student;
import com.lib.serviceLib.LibService;

@RestController
@RequestMapping("/lib")
public class LibController {
	private LibService service;
	
	//Student
	@PostMapping("/createStudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		
		return new ResponseEntity<Student>(service.addStudent(student),HttpStatus.CREATED);
	}
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Integer id){
		return new ResponseEntity<Student>(service.getStudentById(id),HttpStatus.OK);
	}
	@PutMapping("/updateStudent")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student){
	
		return new ResponseEntity<Student>(service.addStudent(student),HttpStatus.CREATED);
	}
	@DeleteMapping("/deleteStudent/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id){
		return new ResponseEntity<String>(service.deleteStudent(id),HttpStatus.OK);
	}
	
	
	//Book
	
	@PostMapping("/createBook")
	public ResponseEntity<Book> addBook(@RequestBody Book book){
		
		return new ResponseEntity<Book>(service.addBook(book),HttpStatus.CREATED);
	}
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBook(@PathVariable Integer id){
		return new ResponseEntity<Book>(service.getBookById(id),HttpStatus.OK);
	}
	@PutMapping("/updateBook")
	public ResponseEntity<Book> updateBook(@RequestBody Book book){
	
		return new ResponseEntity<Book>(service.addBook(book),HttpStatus.CREATED);
	}
	@DeleteMapping("/deleteBook/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer id){
		return new ResponseEntity<String>(service.deleteBook(id),HttpStatus.OK);
	}
}
