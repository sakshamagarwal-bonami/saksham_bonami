package com.valid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.valid.entities.Student;
import com.valid.exceptions.NotFoundException;
import com.valid.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;
	
	public ResponseEntity<String> createStudent(Student student){
		Integer id=student.getId();
		if(repo.existsById(id)) {
			return new ResponseEntity<String>("Record exist for this id",HttpStatus.BAD_REQUEST);
		}
		repo.save(student);
		return new ResponseEntity<String>("Student saved",HttpStatus.ACCEPTED);
	}
	
	public ResponseEntity<Student> getStudentById(Integer id){
		return new ResponseEntity<Student>(repo.findById(id).orElseThrow(()->new NotFoundException("This id does not exist")),HttpStatus.OK);
	}
	
	public ResponseEntity<List<Student>> getAllStudents(){
		return new ResponseEntity<List<Student>>(repo.findAll(),HttpStatus.OK);
	}
	
	public ResponseEntity<String> deleteStudentById(Integer id){
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return new ResponseEntity<String>("Id deleted",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No such id exists",HttpStatus.BAD_REQUEST);
		}
	}
}
