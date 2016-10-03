package com.unisys.cws.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provider_age_support")
public class ProviderAgeSupport {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	Long id; 
	
	Long providerId; 
	
	String description; 
	
	boolean partitme; 
	
	boolean fulltime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProviderId() {
		return providerId;
	}

	public void setProviderId(Long providerId) {
		this.providerId = providerId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPartitme() {
		return partitme;
	}

	public void setPartitme(boolean partitme) {
		this.partitme = partitme;
	}

	public boolean isFulltime() {
		return fulltime;
	}

	public void setFulltime(boolean fulltime) {
		this.fulltime = fulltime;
	} 
	
	
}
