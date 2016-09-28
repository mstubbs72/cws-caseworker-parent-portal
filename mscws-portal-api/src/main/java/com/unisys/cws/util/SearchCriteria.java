package com.unisys.cws.util;

import java.io.Serializable;

public class SearchCriteria implements Serializable {

	Long countyId;

	Long providerTypeId;

	String providerName;

	Long cityId;

	Long ratingId;

	public SearchCriteria() {

	}

	public SearchCriteria(String providerName2, Long county, Long providertype, Long city, Long rating) {
		this.cityId = city;
		this.providerName = providerName2;
		this.countyId = county;
		this.ratingId = rating;
		this.providerTypeId = providertype;
	}

	public Long getCountyId() {
		return countyId;
	}

	public void setCountyId(Long countyId) {
		this.countyId = countyId;
	}

	public Long getProviderTypeId() {
		return providerTypeId;
	}

	public void setProviderTypeId(Long providerTypeId) {
		this.providerTypeId = providerTypeId;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public Long getRatingId() {
		return ratingId;
	}

	public void setRatingId(Long ratingId) {
		this.ratingId = ratingId;
	}

	@Override
	public String toString() {
		return "SearchCriteria [countyId=" + countyId + ", providerTypeId=" + providerTypeId + ", providerName="
				+ providerName + ", cityId=" + cityId + ", ratingId=" + ratingId + "]";
	}

}
