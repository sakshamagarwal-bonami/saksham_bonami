package com.multipledb.my_sql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multipledb.my_sql.entities.Book;


public interface BookRepository extends JpaRepository<Book,Integer>{
	
}