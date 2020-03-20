package com.mastek.graduateapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class CareerPath {

	int jobId;
	String titleId;
	String desciption;
	
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

	@Override
	public String toString() {
		return "CareerPath [jobId=" + jobId + ", titleId=" + titleId + ", desciption=" + desciption + "]";
	}
	
}
