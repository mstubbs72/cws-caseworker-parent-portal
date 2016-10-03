package com.unisys.cws.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

	public City getPhysicalCity() {
		return physicalCity;
	}

	public void setPhysicalCity(City physicalCity) {
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	String providerName;

	@Enumerated(EnumType.ORDINAL)
	LicenseType licenseType;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	ProviderType providerType;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	QualityRating qualityRating;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	County county;

	int providerCapacity;

	@Column(nullable = true)
	int providerAvlCapacity;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	City physicalCity;

	String physicalZipCode;

	String phoneNumber;

	@Column(nullable = true)
	boolean providesFullTime;
	@Column(nullable = true)
	boolean providesPartTime;
	@Column(nullable = true)
	boolean providesHandicappedAccess;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	Set<ProviderAgeSupport> providerAgeSupport = new HashSet<ProviderAgeSupport>(0);

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	Set<ProviderSpecialNeedSupported> providerSpecialNeeds = new HashSet<ProviderSpecialNeedSupported>(0);

	String description; 
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getProviderAvlCapacity() {
		return providerAvlCapacity;
	}

	public void setProviderAvlCapacity(int providerAvlCapacity) {
		this.providerAvlCapacity = providerAvlCapacity;
	}

	public boolean isProvidesFullTime() {
		return providesFullTime;
	}

	public void setProvidesFullTime(boolean providesFullTime) {
		this.providesFullTime = providesFullTime;
	}

	public boolean isProvidesPartTime() {
		return providesPartTime;
	}

	public void setProvidesPartTime(boolean providesPartTime) {
		this.providesPartTime = providesPartTime;
	}

	public boolean isProvidesHandicappedAccess() {
		return providesHandicappedAccess;
	}

	public void setProvidesHandicappedAccess(boolean providesHandicappedAccess) {
		this.providesHandicappedAccess = providesHandicappedAccess;
	}

	public Set<ProviderAgeSupport> getProviderAgeSupport() {
		return providerAgeSupport;
	}

	public void setProviderAgeSupport(Set<ProviderAgeSupport> providerAgeSupport) {
		this.providerAgeSupport = providerAgeSupport;
	}

	public Set<ProviderSpecialNeedSupported> getProviderSpecialNeeds() {
		return providerSpecialNeeds;
	}

	public void setProviderSpecialNeeds(Set<ProviderSpecialNeedSupported> providerSpecialNeeds) {
		this.providerSpecialNeeds = providerSpecialNeeds;
	}

}
