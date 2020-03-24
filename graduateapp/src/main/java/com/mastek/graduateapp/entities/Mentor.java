package com.mastek.graduateapp.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.data.annotation.Transient;

@XmlRootElement
@Entity
@Table(name="JPA_Mentor")
public class Mentor {

	int mentorId;
	String mentorName;
	String jobTitle;
	Designation designation;
	Languages mainLanguage;
	String skills;
	int grade;

	CareerPath currentPath;
	
	//Relationships
	
	@ManyToOne
	@JoinColumn(name="fk_path_number")
	@Transient
	@XmlTransient
	public CareerPath getCurrentPath() {
		return currentPath;
	}
	
	public void setCurrentPath(CareerPath currentPath) {
		this.currentPath = currentPath;
	}
	
	//constructor
		public Mentor() {
		}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getMentorId() {
		return mentorId;
	}

	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}

	public String getMentorName() {
		return mentorName;
	}

	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}
	
	@Enumerated(EnumType.STRING)
	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	
	@Enumerated(EnumType.STRING)
	public Languages getMainLanguage() {
		return mainLanguage;
	}

	public void setMainLanguage(Languages mainLanguage) {
		this.mainLanguage = mainLanguage;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Mentor [mentorId=" + mentorId + ", mentorName=" + mentorName + ", jobTitle=" + jobTitle
				+ ", designation=" + designation + ", mainLanguage=" + mainLanguage + ", skills=" + skills + ", grade="
				+ grade + ", currentPath=" + currentPath + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentPath == null) ? 0 : currentPath.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + grade;
		result = prime * result + ((jobTitle == null) ? 0 : jobTitle.hashCode());
		result = prime * result + ((mainLanguage == null) ? 0 : mainLanguage.hashCode());
		result = prime * result + mentorId;
		result = prime * result + ((mentorName == null) ? 0 : mentorName.hashCode());
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
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
		Mentor other = (Mentor) obj;
		if (currentPath == null) {
			if (other.currentPath != null)
				return false;
		} else if (!currentPath.equals(other.currentPath))
			return false;
		if (designation != other.designation)
			return false;
		if (grade != other.grade)
			return false;
		if (jobTitle == null) {
			if (other.jobTitle != null)
				return false;
		} else if (!jobTitle.equals(other.jobTitle))
			return false;
		if (mainLanguage != other.mainLanguage)
			return false;
		if (mentorId != other.mentorId)
			return false;
		if (mentorName == null) {
			if (other.mentorName != null)
				return false;
		} else if (!mentorName.equals(other.mentorName))
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		return true;
	}


		
}
