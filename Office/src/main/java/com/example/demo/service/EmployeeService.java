package com.example.demo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.EmpId;
import com.example.demo.Entity.Employee;
import com.example.demo.Exceptions.NotFoundException;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	//POST
	public Employee addEmployee(Employee employee) {
	
		return repo.save(employee);
//		return "Employee added";
	}
	//get
	public Employee getEmployeeById(EmpId id) {
		return repo.findById(id).orElseThrow(()->new NotFoundException("Employee not found"));
	}
	//get all
	public List<Employee> getAllEmployees(){
		return repo.findAll();
	}
	//put
	public Employee updateEmployee(Employee employee) {
		Employee existingEmployee=repo.findById(employee.getId()).orElseThrow(()->new NotFoundException("Employee not found to update"));
		BeanUtils.copyProperties(employee, existingEmployee);
		return repo.save(existingEmployee);
	}
		
	//delete
	public String deleteEmployeeById(EmpId id) {
		repo.deleteById(id);
		return "Employee deleted";
	}
	
}
