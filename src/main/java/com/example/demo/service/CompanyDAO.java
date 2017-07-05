package com.example.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Company;

@Repository
public interface CompanyDAO extends JpaRepository<Company, Long>{
	List<Company> findAllCompaniesBySymbolLikeAndNumOfEmployeesGreaterThan(String like, int amount);
}
