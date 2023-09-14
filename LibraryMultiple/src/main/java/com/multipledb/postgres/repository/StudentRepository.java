package com.multipledb.postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multipledb.postgres.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
