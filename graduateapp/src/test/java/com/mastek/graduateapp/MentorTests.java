package com.mastek.graduateapp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.graduateapp.dao.MentorJPADAO;
import com.mastek.graduateapp.entities.Designation;
import com.mastek.graduateapp.entities.Languages;
import com.mastek.graduateapp.entities.Mentor;

@SpringBootTest
class MentorTests {

	@Autowired
	MentorJPADAO mentorDAO;
	
//	@Test
//	void mentorDAOAdd() {
//		Mentor mentor = new Mentor();
//		mentor.setMentorName("John Smith");
//		mentor.setJobTitle("Senior Developer");
//		mentor.setDesignation(Designation.DEVELOPER);
//		mentor.setMainLanguage(Languages.HTML5);
//		mentor.setGrade(3);
//		mentor.setSkills("Analytical, teamwork, Java, SQL, PHP, Python, Database Architecture, Agile, Linux, Strategic Planning");
//		
//		mentor = mentorDAO.save(mentor);
//		
//		assertNotNull(mentor);
//	}
//	
//	@Test
//	void mentorDAOAdd1() {
//		Mentor mentor = new Mentor();
//		mentor.setMentorName("Steven Whitehall");
//		mentor.setJobTitle("Automation Tester");
//		mentor.setDesignation(Designation.AUTOMATIONTESTER);
//		mentor.setMainLanguage(Languages.PYTHON);
//		mentor.setGrade(8);
//		mentor.setSkills("Analytical, teamwork, Java, SQL, PHP, Python, Database Architecture, Agile, Linux, Strategic Planning");
//		
//		mentor = mentorDAO.save(mentor);
//		
//		assertNotNull(mentor);
//	}
//	
//	@Test
//	void mentorDAOAdd2() {
//		Mentor mentor = new Mentor();
//		mentor.setMentorName("Emma Jane-Morrel");
//		mentor.setJobTitle("Senior Business Strategist");
//		mentor.setDesignation(Designation.BA);
//		mentor.setMainLanguage(Languages.MYSQL);
//		mentor.setGrade(6);
//		mentor.setSkills("Analytical, teamwork, Java, SQL, PHP, Python, Database Architecture, Agile, Linux, Strategic Planning");
//		
//		mentor = mentorDAO.save(mentor);
//		
//		assertNotNull(mentor);
//	}
//	
//	@Test
//	void mentorDAOAdd3() {
//		Mentor mentor = new Mentor();
//		mentor.setMentorName("Olivia-Rose Simmons");
//		mentor.setJobTitle("Senior Developer");
//		mentor.setDesignation(Designation.ARCHITECT);
//		mentor.setMainLanguage(Languages.JAVA);
//		mentor.setGrade(6);
//		mentor.setSkills("Analytical, teamwork, Java, SQL, PHP, Python, Database Architecture, Agile, Linux, Strategic Planning");
//		
//		mentor = mentorDAO.save(mentor);
//		
//		assertNotNull(mentor);
//	}
//	
//	@Test
//	void mentorDAOAdd4() {
//		Mentor mentor = new Mentor();
//		mentor.setMentorName("Colin Gentry");
//		mentor.setJobTitle("Senior Developer");
//		mentor.setDesignation(Designation.DEVELOPER);
//		mentor.setMainLanguage(Languages.JAVASCRIPT);
//		mentor.setGrade(4);
//		mentor.setSkills("Analytical, teamwork, Java, SQL, PHP, Python, Database Architecture, Agile, Linux, Strategic Planning");
//		
//		mentor = mentorDAO.save(mentor);
//		
//		assertNotNull(mentor);
//	}
//	
}

