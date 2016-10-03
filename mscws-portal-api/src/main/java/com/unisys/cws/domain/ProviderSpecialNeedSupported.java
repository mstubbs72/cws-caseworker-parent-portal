package com.unisys.cws.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "provider_special_needs_support")
public class ProviderSpecialNeedSupported {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	Long providerId; 
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	SpecialNeeds specialNeedId;

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

	public SpecialNeeds getSpecialNeedId() {
		return specialNeedId;
	}

	public void setSpecialNeedId(SpecialNeeds specialNeedId) {
		this.specialNeedId = specialNeedId;
	}
	
	
}
