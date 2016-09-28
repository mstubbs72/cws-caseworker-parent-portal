package com.unisys.cws.dao;

import java.util.List;

import com.unisys.cws.domain.Providers;
import com.unisys.cws.util.SearchCriteria;

public interface ISearchDao {
	public List<Providers> findProvidersByCriteria(SearchCriteria searchCriteria);
}
