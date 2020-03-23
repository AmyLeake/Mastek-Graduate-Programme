package com.mastek.graduateapp.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mastek.graduateapp.dao.CareerPathJPADAO;
import com.mastek.graduateapp.dao.EmployeeJPADAO;
import com.mastek.graduateapp.dao.EssentialTrainingJPADAO;
import com.mastek.graduateapp.dao.MentorJPADAO;
import com.mastek.graduateapp.dao.TrainingScoreJPADAO;
import com.mastek.graduateapp.entities.CareerPath;
import com.mastek.graduateapp.entities.Employee;
import com.mastek.graduateapp.entities.EssentialTraining;
import com.mastek.graduateapp.entities.Mentor;
import com.mastek.graduateapp.entities.TrainingScore;

@Component
public class GraduateService {
	
	@Autowired
	CareerPathJPADAO careerPathDAO;
	
	@Autowired
	MentorJPADAO mentorDAO;
	
	@Autowired
	EssentialTrainingJPADAO essTrainDAO;
	
	@Autowired
	TrainingScoreJPADAO tScoreDAO;
	
	@Autowired
	EmployeeJPADAO empDAO;
	
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
	
	@Transactional
	public EssentialTraining assignEssentialTrainingToTrainingScore(int eTrainId, int tScoreId) {
		EssentialTraining eTrain = essTrainDAO.findById(eTrainId).get();
		TrainingScore tScore = tScoreDAO.findById(tScoreId).get();
		
		tScore.setAssignedEssentialTraining(eTrain);
		eTrain.getTrainingScoreAssigned().add(tScore);
		
		essTrainDAO.save(eTrain);
		tScoreDAO.save(tScore);
		
		return eTrain;
	}
	
	@Transactional
	public Employee assignEmployeeToTrainingScore(int empId, int tScoreId) {
		Employee emp = empDAO.findById(empId).get();
		TrainingScore tScore = tScoreDAO.findById(tScoreId).get();
		
		emp.getAssignedTrainingScore().add(tScore);
		empDAO.save(emp);
		
		return emp;
	}

}
