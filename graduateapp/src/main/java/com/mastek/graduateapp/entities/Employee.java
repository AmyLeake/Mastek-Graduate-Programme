package com.mastek.graduateapp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement
@Entity
@Table(name="JPA_Employees")
public class Employee {
	
	int employeeId;
	String firstName;
	String secondName;
	String email;
	String joiningDate;
	String password;
	
	Set<TrainingScore> assignedTrainingScore = new HashSet<>();
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="JPA_EMPLOYEE_TRAINING", 
			joinColumns= {@JoinColumn(name="fk_EmployeeId")}, 
			inverseJoinColumns = {@JoinColumn(name="fk_TrainingScoreId")} 
			)
	@XmlTransient 
	public Set<TrainingScore> getAssignedTrainingScore() {
		return assignedTrainingScore;
	}

	public void setAssignedTrainingScore(Set<TrainingScore> assignedTrainingScore) {
		this.assignedTrainingScore = assignedTrainingScore;
	}

	//Constructor
	public Employee() {
	}
	
	//Getters and setters
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//toSring
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", secondName=" + secondName
				+ ", email=" + email + ", joiningDate=" + joiningDate + ", password=" + password + "]";
	}
	
	//Hashcode
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
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
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		return true;
	}
	

	
	
}
