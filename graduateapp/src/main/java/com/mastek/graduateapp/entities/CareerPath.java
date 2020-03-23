package com.mastek.graduateapp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="JPA_Career_Path")
public class CareerPath {

	int jobId;
	String titleId;
	String desciption;
	int grade;
	int yearsOfExperience;
	
	Set<Mentor> path = new HashSet<>();	
	
	//Relationships
	@OneToMany(mappedBy="currentPath", cascade=CascadeType.ALL)
	public Set<Mentor> getPath() {
		return path;
	}
	
	public void setPath(Set<Mentor> path) {
		this.path = path;
	}

		//constructor
		public CareerPath() {
		}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getTitleId() {
		return titleId;
	}

	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public String toString() {
		return "CareerPath [jobId=" + jobId + ", titleId=" + titleId + ", desciption=" + desciption + ", grade=" + grade
				+ ", yearsOfExperience=" + yearsOfExperience + ", path=" + path + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + jobId;
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
		CareerPath other = (CareerPath) obj;
		if (jobId != other.jobId)
			return false;
		return true;
	}

	
	
}
