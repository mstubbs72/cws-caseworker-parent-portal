package com.unisys.cws.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provider_type")
public class ProviderType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	public Long providerType;

	public String providerTypeDescription;

	public Long getProviderType() {
		return providerType;
	}

	public void setProviderType(Long providerType) {
		this.providerType = providerType;
	}

	public String getProviderTypeDescription() {
		return providerTypeDescription;
	}

	public void setProviderTypeDescription(String providerTypeDescription) {
		this.providerTypeDescription = providerTypeDescription;
	}

	
}
