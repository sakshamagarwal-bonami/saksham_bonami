package com.ims.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ims.entity.Student;



public interface StudentRepository extends JpaRepository<Student, Integer>{
	

	@Query(value="select * from student",nativeQuery=true)
	public List<Student> getAll2();
		// TODO Auto-generated method stub
	
		
	
	
}
