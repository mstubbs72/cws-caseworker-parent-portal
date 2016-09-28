package com.unisys.cws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unisys.cws.dao.ISearchDao;
import com.unisys.cws.domain.Providers;
import com.unisys.cws.util.SearchCriteria;

@RestController
@RequestMapping(path = "/api/rest/providers")
public class SearchController {

	@Autowired
	ISearchDao searchDao;

	@RequestMapping(path = "/find", produces = MediaType.APPLICATION_JSON_VALUE , method = RequestMethod.GET)
	public List<Providers> findProvidersByCriteria(@RequestParam(value = "providerName", required = false) String providerName ,
			@RequestParam(value = "county", required = false) Long county, 
			@RequestParam(value = "providerType", required = false) Long providertype , 
			@RequestParam(value = "city", required = false) Long city	, @RequestParam(value = "rating", required = false) Long rating	) {
		SearchCriteria searchCriteria = new SearchCriteria(providerName, county, providertype, city,rating);
		return searchDao.findProvidersByCriteria(searchCriteria);
	}
}
