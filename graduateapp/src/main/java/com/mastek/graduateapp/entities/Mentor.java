package com.mastek.graduateapp.entities;

import javax.persistence.Entity;
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
		return "Mentor [mentorId=" + mentorId + ", mentorName=" + mentorName + ", jobTitle=" + jobTitle + ", skills="
				+ skills + ", grade=" + grade + ", currentPath=" + currentPath + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mentorId;
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
		if (mentorId != other.mentorId)
			return false;
		return true;
	}

		
}
