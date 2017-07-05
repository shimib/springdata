package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.model.Company;
import com.example.demo.model.Employee;
import com.example.demo.service.CompanyDAO;
import com.example.demo.service.EmployeeDao;

@SpringBootApplication
@EnableJpaRepositories
public class ShowdataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext factory = SpringApplication.run(ShowdataApplication.class, args);
		
		EmployeeDao dao = factory.getBean(EmployeeDao.class);
		CompanyDAO cdao = factory.getBean(CompanyDAO.class);
		dao.save(new Employee("John", 6000));
		dao.save(new Employee("Jane", 7000));
		System.out.println(dao.count());
		System.out.println(dao.findAllEmployeesBySalaryLessThan(6500).size());
		System.out.println("********************************");
		List<Company> companies = Arrays.asList(new Company("Google", "GOOG", 2348934),
				new Company("Amazon", "AMZ", 344234),
				new Company("EMC", "GEMC", 234234),
				new Company("Met", "MET", 4),
				new Company("GeneralGeneral", "GG", 4));
		cdao.save(companies);
		List<Company> all = cdao.findAllCompaniesBySymbolLikeAndNumOfEmployeesGreaterThan("G%", 10);
		
		System.out.println(all);
		
		
		
		System.out.println("********************************");
	}
}
