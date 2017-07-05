package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Company {
	private Long id;
	private String name;
	private String symbol;
	private int numOfEmployees;
	public Company() {
	}
	public Company(String name, String symbol, int numOfEmployees) {
		this.name = name;
		this.symbol = symbol;
		this.numOfEmployees = numOfEmployees;
	}
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getNumOfEmployees() {
		return numOfEmployees;
	}
	public void setNumOfEmployees(int numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", symbol=" + symbol + ", numOfEmployees=" + numOfEmployees
				+ "]";
	}
	
	
}
