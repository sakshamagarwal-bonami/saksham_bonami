package com.lib.serviceLib;

import java.beans.Beans;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.lib.exceptions.NotFoundException;
import com.lib.mysql.entitiy.Book;
import com.lib.postgres.entity.Student;
import com.lib.repository.BookRepository;
import com.lib.repository.StudentRepository;

@Service
public class LibService {
	private StudentRepository repo;
	private BookRepository brepo;
	
	//create student
	public Student addStudent(Student student) {
		return repo.save(student);
	}
	//get
	public Student getStudentById(Integer id) {
		return repo.findById(id).orElseThrow(()->new NotFoundException("Student not found"));
	}
	//update
	public Student updateStudent(Student student) {
		Integer id=student.getRollNo();
		Student existingStudent=repo.findById(id).orElseThrow(()->new NotFoundException("Student to be updated not found"));
		BeanUtils.copyProperties(student, existingStudent);
		return repo.save(existingStudent);
	}
	//delete
	public String deleteStudent(Integer id) {
		repo.deleteById(id);
		return "Student deleted";
	}
	
	//create book
	public Book addBook(Book book) {
		return brepo.save(book);
	}
	//get book
	public Book getBookById(Integer id) {
		return brepo.findById(id).orElseThrow(()->new NotFoundException("Book not found"));
	}
	//update book
	public Book updateBook(Book book) {
		Integer id=book.getBookId();
		Book existingBook=brepo.findById(id).orElseThrow(()->new NotFoundException("Book not found to update"));
		BeanUtils.copyProperties(book, existingBook);
		return brepo.save(existingBook);
	}
	//delete book
	public String deleteBook(Integer id) {
		brepo.deleteById(id);
		return "Book deleted";
	}
	
}
