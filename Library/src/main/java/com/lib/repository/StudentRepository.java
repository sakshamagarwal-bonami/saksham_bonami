package com.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lib.postgres.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
}
