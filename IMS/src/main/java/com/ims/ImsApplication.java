package com.ims;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ims.entity.Student;
import com.ims.repository.StudentRepository;

import lombok.RequiredArgsConstructor;



@SpringBootApplication
public class ImsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImsApplication.class, args);
//		StudentRepository.getAll().forEach(e->System.out.println(e));
		
//		List<Student> allstudents=StudentRepository.getAll2();
	}
//		StudentRepository studentRepository;
		
		
	
}
