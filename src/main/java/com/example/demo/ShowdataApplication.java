package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeDao;

@SpringBootApplication
@EnableJpaRepositories
public class ShowdataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext factory = SpringApplication.run(ShowdataApplication.class, args);
		
		EmployeeDao dao = factory.getBean(EmployeeDao.class);
		dao.save(new Employee("John", 6000));
		dao.save(new Employee("Jane", 7000));
		System.out.println(dao.count());
		System.out.println(dao.findAllEmployeesBySalaryLessThan(6500).size());
		
	}
}
