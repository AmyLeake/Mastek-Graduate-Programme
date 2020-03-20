package com.mastek.graduateapp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.masket.graduateapp.dao.CareerPathJPADAO;
import com.masket.graduateapp.dao.EmployeeJPADAO;
import com.masket.graduateapp.dao.EssentialTrainingJPADAO;
import com.masket.graduateapp.dao.MentorJPADAO;
import com.masket.graduateapp.dao.SiteDeploymentJPADAO;
import com.masket.graduateapp.dao.TrainingScoreJPADAO;
import com.mastek.graduateapp.entities.Employee;


@SpringBootTest
public class GeneratingTableDataTests {
	
	@Autowired
	EmployeeJPADAO empDAO;
	
	@Autowired
	EssentialTrainingJPADAO essTrainDAO;
	
	@Autowired
	MentorJPADAO mentorDAO;
	
	@Autowired
	SiteDeploymentJPADAO siteDepDAO;
	
	@Autowired
	TrainingScoreJPADAO trainScoreDAO;
	
	@Autowired
	CareerPathJPADAO careerPathDAO;
	
	@Test
	void employeeDAOAdd() {
		Employee emp = new Employee();
		emp.setFirstName("Example First Name");
		emp.setSecondName("Example Second Name");
		emp.setEmail("Example Email");
		emp.setJoiningDate("01/01/2020");
		emp.setPassword("examplePassword");
		
		emp = empDAO.save(emp);
		
		assertNotNull(emp);
	}

}
