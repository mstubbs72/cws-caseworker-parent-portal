package com.unisys.cws.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "providers")
public class Providers {

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public LicenseType getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(LicenseType licenseType) {
		this.licenseType = licenseType;
	}

	public ProviderType getProviderType() {
		return providerType;
	}

	public void setProviderType(ProviderType providerType) {
		this.providerType = providerType;
	}

	public QualityRating getQualityRating() {
		return qualityRating;
	}

	public void setQualityRating(QualityRating qualityRating) {
		this.qualityRating = qualityRating;
	}

	public County getCounty() {
		return county;
	}

	public void setCounty(County county) {
		this.county = county;
	}

	public int getProviderCapacity() {
		return providerCapacity;
	}

	public void setProviderCapacity(int providerCapacity) {
		this.providerCapacity = providerCapacity;
	}

	public String getPhysicalCity() {
		return physicalCity;
	}

	public void setPhysicalCity(String physicalCity) {
		this.physicalCity = physicalCity;
	}

	public String getPhysicalZipCode() {
		return physicalZipCode;
	}

	public void setPhysicalZipCode(String physicalZipCode) {
		this.physicalZipCode = physicalZipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	Long id;

	String providerName; 
	
	@Enumerated(EnumType.ORDINAL)
	LicenseType licenseType; 
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	ProviderType providerType; 
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	QualityRating qualityRating; 
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	County county; 
	
	int providerCapacity;
	
	String physicalCity;
	
	String physicalZipCode;
	
	String phoneNumber;
	
	
}
