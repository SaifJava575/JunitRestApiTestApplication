package com.junit.app.service;

import java.util.List;
import java.util.Optional;

import com.junit.app.model.Employee;

public interface IEmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployees();

	Optional<Employee> getEmployeeById(long id);

	Employee updateEmployee(Employee updatedEmployee);

	void deleteEmployee(long id);
}
