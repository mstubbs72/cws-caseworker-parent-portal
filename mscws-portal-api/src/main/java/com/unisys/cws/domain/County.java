package com.unisys.cws.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class County{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	Long countyNumber; 
	
	String countyName;

	public Long getCountyNumber() {
		return countyNumber;
	}

	public void setCountyNumber(Long countyNumber) {
		this.countyNumber = countyNumber;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
	
	
	

}
