package com.unisys.cws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unisys.cws.dao.MetadataDao;
import com.unisys.cws.domain.County;
import com.unisys.cws.domain.ProviderType;
import com.unisys.cws.domain.QualityRating;

@RestController
@RequestMapping(path = "/api/rest/metadata")
public class MetadataController {

	@Autowired
	private MetadataDao metadataDao; 
	
	@RequestMapping(path = "/county",produces = MediaType.APPLICATION_JSON_VALUE , method = RequestMethod.GET)
	public List<County> getCountys(){
		return metadataDao.getAllCountys();
	}
	@RequestMapping(path = "/providertypes",produces = MediaType.APPLICATION_JSON_VALUE , method = RequestMethod.GET)
	public List<ProviderType> getProviderTypes(){
		return metadataDao.getAllProviderTypes();
	}
	
	@RequestMapping(path = "/qualityratings",produces = MediaType.APPLICATION_JSON_VALUE , method = RequestMethod.GET)
	public List<QualityRating> getQualityRatings(){
		return metadataDao.getAllRatings();
	}
}
