package com.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.exception.ResourceNotFoundException;
import com.portal.model.Employee;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	
	@Autowired
	private com.portal.repository.EmployeeRepository employeeRepository;

	@GetMapping("/employeesAll")
	public List<com.portal.model.Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	@GetMapping("/employeesFirstNameByAsc")
	public List<com.portal.model.Employee> getAllEmployeeFirstNames() {
		
		return employeeRepository.findEmployeeByAsc();
	}
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
		return ResponseEntity.ok().body(employee);
	}

	@PostMapping("/employees")
	public Employee createEmployee( @RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
	
	@GetMapping("/list")
	public String  getData() {
		
		return "Santhosh Poojari";
	}
}
