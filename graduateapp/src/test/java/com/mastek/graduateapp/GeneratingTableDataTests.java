package com.mastek.graduateapp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.graduateapp.dao.CareerPathJPADAO;
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
	
	@Autowired
	GraduateService gradSrv;
	
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

	@Test
	void careerPathDAOAdd() {
		CareerPath career = new CareerPath();
		career.setTitleId("Senior Developer");
		career.setDesciption("understands team dynamics and respects the other disciplines needed for delivering great software. Has Many years of experience.");
		career.setGrade(5);
		career.setYearsOfExperience(10);
		
		career = careerPathDAO.save(career);
		
		assertNotNull(career);
	}
	
	@Test
	void mentorDAOAdd() {
		Mentor mentor = new Mentor();
		mentor.setMentorName("John Smith");
		mentor.setJobTitle("Senior Developer");
		mentor.setGrade(3);
		mentor.setSkills("Analytical, teamwork, Java, SQL, PHP, Python, Database Architecture, Agile, Linux, Strategic Planning");
		
		mentor = mentorDAO.save(mentor);
		
		assertNotNull(mentor);
	}
	
	@Test
	void essentialTraingDAOAdd() {
		EssentialTraining eTrain = new EssentialTraining();
		eTrain.setTrainingName("Anti-Bribery");
		eTrain.setMinimumScorePercentage(70);
		
		eTrain=essTrainDAO.save(eTrain);
		
		assertNotNull(eTrain);
	}
	
	@Test
	void trainingScoreDAOAdd() {
		TrainingScore tScore = new TrainingScore();
		tScore.setUserScorePercentage(60);
		tScore.setPass(false);
		
		tScore=trainScoreDAO.save(tScore);
		
		assertNotNull(tScore);
	}
	
	
	//@Test
	void testAssignMentorToCareerPath() {
		Mentor mentor = gradSrv.assignMentorToCareerPath(7, 4);
		assertNotNull(mentor.getCurrentPath(), "Mentor Not Assigned");
	}
	
	//@Test
	void testAssignEssentialTrainingToTrainingScore() {
		EssentialTraining eTrain = gradSrv.assignEssentialTrainingToTrainingScore(11, 15);
		assertNotNull(eTrain.getTrainingScoreAssigned(), "Essential Training Not Assigned");
	}
	
	@Test
	void testAssignEmployeeToTrainingScore() {
		Employee emp = gradSrv.assignEmployeeToTrainingScore(1, 15);
		assertNotNull(emp.getAssignedTrainingScore(), "Employee Not Assigned");
	}
}
