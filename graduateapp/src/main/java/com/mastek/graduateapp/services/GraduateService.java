package com.mastek.graduateapp.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mastek.graduateapp.dao.CareerPathJPADAO;
import com.mastek.graduateapp.dao.MentorJPADAO;
import com.mastek.graduateapp.entities.CareerPath;
import com.mastek.graduateapp.entities.Mentor;

@Component
public class GraduateService {
	
	@Autowired
	CareerPathJPADAO careerPathDAO;
	
	@Autowired
	MentorJPADAO mentorDAO;
	
	//Service test methods
	
	public GraduateService() {
		System.out.println("Graduate Service Created");
	}
	
	@PostConstruct
	public void initialService() {
		System.out.println("Graduate Service Initialised");
	}
	
	@PreDestroy
	public void terminateService() {
		System.out.println("Graduate Service Terminated");
	}
	
	//Associated Entities
	
	@Transactional
	public Mentor assignMentorToCareerPath(int mentorId, int jobId) {
		Mentor mentor = mentorDAO.findById(mentorId).get();
		CareerPath career = careerPathDAO.findById(jobId).get();
		
		mentor.setCurrentPath(career);
		career.getPath().add(mentor);
		
		mentorDAO.save(mentor);
		careerPathDAO.save(career);
		
		return mentor;
	}

}
