package com.mastek.graduateapp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.data.annotation.Transient;


@XmlRootElement
@Entity
@Table(name="JPA_Employees")
@NamedQuery(name="Employee.findByUsernameAndPassword", //Declare query name as method in dao
query="select a from Employee a where a.username=:username and a.password=:password")
public class Employee {
	
	int employeeId;
	
	@FormParam("username")
	String username;
	@FormParam("firstName")
	String firstName;
	@FormParam("secondName")
	String secondName;
	@FormParam("email")
	String email;
	@FormParam("joiningDate")
	String joiningDate;
	@FormParam("password")
	String password;
	

	//Relationships
	

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

	
	
	Set<CareerPath> pathAssigned = new HashSet<>();
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "JPA_CAREER_PATH_ASSIGNED",
				joinColumns= {@JoinColumn(name="fk_employeeId")},
				inverseJoinColumns = {@JoinColumn(name="fk_jobId")}
				)
	@Transient
	@XmlTransient
	public Set<CareerPath> getPathAssigned() {
		return pathAssigned;
	}
	
	public void setPathAssigned(Set<CareerPath> pathAssigned) {
		this.pathAssigned = pathAssigned;
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
	@Column(unique=true)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
	

	
	//Hashcode
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		return result;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", username=" + username + ", firstName=" + firstName
				+ ", secondName=" + secondName + ", email=" + email + ", joiningDate=" + joiningDate + ", password="
				+ password + ", assignedTrainingScore=" + assignedTrainingScore + "]";
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
