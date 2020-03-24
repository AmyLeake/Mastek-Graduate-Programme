package com.mastek.graduateapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.graduateapp.dao.MentorJPADAO;
import com.mastek.graduateapp.entities.Designation;
import com.mastek.graduateapp.entities.Languages;
import com.mastek.graduateapp.entities.Mentor;
import com.mastek.graduateapp.services.GraduateService;

@SpringBootTest
public class FindMentorTest {

	@Autowired
	MentorJPADAO mentorDAO;

	@Autowired
	GraduateService gradSer;

	@Test
	public void FindByDesignationtest() {
		Iterable<Mentor> mens = mentorDAO.findByJobTitle(Designation.AUTOMATIONTESTER);
		for (Mentor men : mens) {
			System.out.println(men);
		}
	}

	@Test
	public void findByMainLanguageTest() {
		Iterable<Mentor> mens = mentorDAO.findByLanguageKnown(Languages.HTML5);
		for (Mentor men : mens) {
			System.out.println(men);
		}
	}

}
