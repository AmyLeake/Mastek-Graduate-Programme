package com.mastek.graduateapp.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="JPA_Employees")
public class Employee {
	
	int employeeId;
	String firstName;
	String secondName;
	String email;
	int joiningDate;
	String password;
	
	//Constructor
	public Employee() {
	}
	
	//Getters and setters
	
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
	public int getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(int joiningDate) {
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
