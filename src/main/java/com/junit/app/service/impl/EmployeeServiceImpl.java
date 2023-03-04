package com.junit.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junit.app.model.Employee;
import com.junit.app.repo.EmployeeRepository;
import com.junit.app.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
  private EmployeeRepository employeeRepository;
	@Override
	public Employee saveEmployee(Employee employee) {
		 return employeeRepository.save(employee);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Employee updateEmployee(Employee updatedEmployee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub

	}

}
