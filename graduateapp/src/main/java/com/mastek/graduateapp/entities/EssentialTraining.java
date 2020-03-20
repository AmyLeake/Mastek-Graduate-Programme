package com.mastek.graduateapp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
public class EssentialTraining {
	
	int trainingId;
	String trainingName;
	int minimumScorePercentage;
	
	
	Set<TrainingScore> trainingScoreAssigned = new HashSet<>();
	
	
//	@OneToMany(mappedBy="assignedEssentialTraining", cascade=CascadeType.ALL)
	@XmlTransient
	public Set<TrainingScore> getTrainingScoreAssigned() {
		return trainingScoreAssigned;
	}

	public void setTrainingScoreAssigned(Set<TrainingScore> trainingScoreAssigned) {
		this.trainingScoreAssigned = trainingScoreAssigned;
	}

	//constructor
	public EssentialTraining() {
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public int getMinimumScorePercentage() {
		return minimumScorePercentage;
	}

	public void setMinimumScorePercentage(int minimumScorePercentage) {
		this.minimumScorePercentage = minimumScorePercentage;
	}

	@Override
	public String toString() {
		return "EssentialTraining [trainingId=" + trainingId + ", trainingName=" + trainingName
				+ ", minimumScorePercentage=" + minimumScorePercentage + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + trainingId;
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
		EssentialTraining other = (EssentialTraining) obj;
		if (trainingId != other.trainingId)
			return false;
		return true;
	}
	
	

}
