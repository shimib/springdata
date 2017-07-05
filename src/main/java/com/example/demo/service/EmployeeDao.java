package com.example.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long>{
	List<Employee> findAllEmployeesBySalaryLessThan(int salary);
}
