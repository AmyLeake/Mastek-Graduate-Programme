package com.mastek.graduateapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class SiteDeployment {
	
	int siteId;
	String siteName;
	int noOfPositions;
	int noOfEmptyPositions;
	
	//constructor
	public SiteDeployment() {
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getSiteId() {
		return siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public int getNoOfPositions() {
		return noOfPositions;
	}

	public void setNoOfPositions(int noOfPositions) {
		this.noOfPositions = noOfPositions;
	}

	public int getNoOfEmptyPositions() {
		return noOfEmptyPositions;
	}

	public void setNoOfEmptyPositions(int noOfEmptyPositions) {
		this.noOfEmptyPositions = noOfEmptyPositions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + siteId;
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
		SiteDeployment other = (SiteDeployment) obj;
		if (siteId != other.siteId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SiteDeployment [siteId=" + siteId + ", siteName=" + siteName + ", noOfPositions=" + noOfPositions
				+ ", noOfEmptyPositions=" + noOfEmptyPositions + "]";
	}
	
	
	
	
	

}
