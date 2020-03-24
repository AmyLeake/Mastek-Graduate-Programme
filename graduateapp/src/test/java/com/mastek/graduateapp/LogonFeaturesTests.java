package com.mastek.graduateapp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.graduateapp.dao.CareerPathJPADAO;

import com.mastek.graduateapp.dao.EssentialTrainingJPADAO;
import com.mastek.graduateapp.dao.MentorJPADAO;
import com.mastek.graduateapp.dao.SiteDeploymentJPADAO;
import com.mastek.graduateapp.dao.TrainingScoreJPADAO;
import com.mastek.graduateapp.dao.EmployeeJPADAO;

import com.mastek.graduateapp.dao.EmployeeJPADAO;
import com.mastek.graduateapp.dao.EssentialTrainingJPADAO;
import com.mastek.graduateapp.dao.MentorJPADAO;
import com.mastek.graduateapp.dao.SiteDeploymentJPADAO;
import com.mastek.graduateapp.dao.TrainingScoreJPADAO;
import com.mastek.graduateapp.entities.CareerPath;
import com.mastek.graduateapp.entities.Employee;
import com.mastek.graduateapp.entities.EssentialTraining;
import com.mastek.graduateapp.entities.Mentor;
import com.mastek.graduateapp.entities.TrainingScore;
import com.mastek.graduateapp.services.GraduateService;


@SpringBootTest
class LogOnTests {
	
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
	
	@Autowired
	GraduateService gradSrv;
	
	@Test
	public void usernameAndPasswordTests() {
	Iterable<Employee> emp = empDAO.findByUsernameAndPassword("Username", "examplePassword");
		for (Employee emps : emp) {
			System.out.println(emps);
		}		
	}
	
	
}
