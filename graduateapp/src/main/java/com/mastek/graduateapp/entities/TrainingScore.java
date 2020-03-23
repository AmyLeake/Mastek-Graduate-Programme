package com.mastek.graduateapp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
public class TrainingScore {

	int trainingScoreId;
	double userScorePercentage;
	boolean pass;
	
//	EssentialTraining assignedEssentialTraining;
//	Set<Employee> assignedEmployee = new HashSet<>();
//	
//	@ManyToMany(mappedBy="assignedTrainingScore")
//	@XmlTransient
//	public Set<Employee> getAssignedEmployee() {
//		return assignedEmployee;
//	}
//
//	public void setAssignedEmployee(Set<Employee> assignedEmployee) {
//		this.assignedEmployee = assignedEmployee;
//	}
//
//	@ManyToOne
//	@JoinColumn(name = "FK_Essential_Training_ID")
//	@XmlTransient
//	public EssentialTraining getAssignedEssentialTraining() {
//		return assignedEssentialTraining;
//	}
//
//	public void setAssignedEssentialTraining(EssentialTraining assignedEssentialTraining) {
//		this.assignedEssentialTraining = assignedEssentialTraining;
//	}

	public TrainingScore() {
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getTrainingScoreId() {
		return trainingScoreId;
	}
	public void setTrainingScoreId(int trainingScoreId) {
		this.trainingScoreId = trainingScoreId;
	}
	public double getUserScorePercentage() {
		return userScorePercentage;
	}
	public void setUserScorePercentage(double userScorePercentage) {
		this.userScorePercentage = userScorePercentage;
	}
	public boolean isPass() {
		return pass;
	}
	public void setPass(boolean pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "TrainingScore [trainingScoreId=" + trainingScoreId + ", userScorePercentage=" + userScorePercentage
				+ ", pass=" + pass + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + trainingScoreId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainingScore other = (TrainingScore) obj;
		if (trainingScoreId != other.trainingScoreId)
			return false;
		return true;
	}
	
	
}
