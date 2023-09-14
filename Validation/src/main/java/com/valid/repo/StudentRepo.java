package com.valid.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valid.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	
}
