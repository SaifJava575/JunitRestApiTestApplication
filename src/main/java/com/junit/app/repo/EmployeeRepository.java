package com.junit.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junit.app.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
