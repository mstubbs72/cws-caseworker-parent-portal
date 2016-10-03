package com.unisys.cws.dao;

import java.util.List;

import com.unisys.cws.domain.County;
import com.unisys.cws.domain.ProviderType;
import com.unisys.cws.domain.QualityRating;

public interface IMetadataDAO {
	
	public List<County> getAllCountys();

	public List<ProviderType> getAllProviderTypes();

	public List<QualityRating> getAllRatings();
}
