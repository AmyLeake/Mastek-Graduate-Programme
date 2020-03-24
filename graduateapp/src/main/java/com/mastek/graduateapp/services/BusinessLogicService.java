package com.mastek.graduateapp.services;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mastek.graduateapp.dao.EmployeeJPADAO;
import com.mastek.graduateapp.entities.Employee;
import com.mastek.graduateapp.entities.EssentialTraining;
import com.mastek.graduateapp.entities.TrainingScore;

@Component	
public class BusinessLogicService {

	
	@Autowired
	EmployeeJPADAO empDAO;
	
	@Transactional
	public void hasEmployeePassedEssentialTraining(int empId) {
		Employee emp = empDAO.findById(empId).get();
		Set<TrainingScore> assignedTraining = emp.getAssignedTrainingScore();
		System.out.println(assignedTraining);
		if (assignedTraining != null) {
			for (TrainingScore trainingScore : assignedTraining) {
				EssentialTraining assignedEssentialTraining = trainingScore.getAssignedEssentialTraining();
				System.out.println(assignedEssentialTraining);
				if(assignedEssentialTraining != null && trainingScore.getUserScorePercentage()
						<assignedEssentialTraining.getMinimumScorePercentage()) {
					trainingScore.setPass(false);
				}
				else {
					trainingScore.setPass(true);
				}
			}	
		}
	}
}
