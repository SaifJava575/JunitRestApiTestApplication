package com.junit.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junit.app.model.Employee;
import com.junit.app.service.IEmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private IEmployeeService employeeService;

	@PostMapping(value = "/employee")
	public ResponseEntity<String> registerEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return new ResponseEntity<>("Employee created Successfully with" + employee.getId(), HttpStatus.OK);
	}

	@GetMapping(value = "/employee")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		ResponseEntity<List<Employee>> response = null;
		try {
			List<Employee> list = employeeService.getAllEmployees();
			response = new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

}
