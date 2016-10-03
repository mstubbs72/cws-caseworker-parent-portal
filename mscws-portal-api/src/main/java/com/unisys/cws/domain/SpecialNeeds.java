package com.unisys.cws.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "special_needs")
public class SpecialNeeds {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 Long id;
	
	 String descr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	} 
	 
	 
}
