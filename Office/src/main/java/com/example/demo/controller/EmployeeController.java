package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.EmpId;
import com.example.demo.Entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	//post
	@PostMapping("/create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
		System.out.println("hiiiiii niggaa");
		Employee employee2=service.addEmployee(employee);
		return new ResponseEntity<Employee>(employee2,HttpStatus.CREATED);
	}
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmpById(@PathVariable EmpId id){
		Employee employee2=service.getEmployeeById(id);
		return new ResponseEntity<Employee>(employee2,HttpStatus.OK);
	}
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmp(){
		return new ResponseEntity<List<Employee>>(service.getAllEmployees(),HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		Employee employee2=service.updateEmployee(employee);
		return new ResponseEntity<Employee>(employee2,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmpById(@PathVariable EmpId id){

		return new ResponseEntity<String>(service.deleteEmployeeById(id),HttpStatus.OK);
	}
}
