package com.unisys.cws.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QualityRating {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	Long qualityRating; 
	
	String qualityRatingDescription;

	public Long getQualityRating() {
		return qualityRating;
	}

	public void setQualityRating(Long qualityRating) {
		this.qualityRating = qualityRating;
	}

	public String getQualityRatingDescription() {
		return qualityRatingDescription;
	}

	public void setQualityRatingDescription(String qualityRatingDescription) {
		this.qualityRatingDescription = qualityRatingDescription;
	}
	
	
}
