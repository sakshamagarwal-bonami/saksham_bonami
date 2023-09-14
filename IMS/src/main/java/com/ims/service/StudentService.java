package com.ims.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.*;

import com.ims.Exception.EmptyInputException;
import com.ims.advice.StudentControllerAdvice;
import com.ims.entity.Student;
import com.ims.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository repo;
	
	//POST
	public String addStudent(Student student) {
		repo.save(student);
		return "New student added";
	}
	//GET
	public Student findStudentById(Integer rollno) {
		return repo.findById(rollno).orElseThrow(()->new EmptyInputException("This roll no. does not exist"));
		
	}
	public List<Student> getALLStudents(){
		
		return repo.getAll2();
	}
	//PUT
	public Student updateStudent(Student student) {
	
		Student	student2 =repo.findById(student.getRollNo()).orElseThrow(()-> new EmptyInputException("Not found"));
		BeanUtils.copyProperties(student, student2);
		repo.save(student2);
		return student2;
	}
	//DELETE
	public String deleteStudentById(Integer id) {
		
//		Student student1=repo.findById(id).orElseThrow(()->new EmptyInputException("This roll no. does not exist, hence can't be deleted- Printed using orElseThrow"));
		Student student1=repo.findById(id).orElse(null);
		if(student1==null) {
			throw new EmptyInputException("This roll no. does not exist, hence can't be deleted- Printed using 'if'");
		}
		repo.deleteById(id);
		return "Student with id:"+id+" deleted";

	}
	
	
}
