package com.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lib.mysql.entitiy.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{
	
}
