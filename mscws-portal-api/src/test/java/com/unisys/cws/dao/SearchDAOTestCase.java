package com.unisys.cws.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.unisys.cws.util.SearchCriteria;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-config.xml")
public class SearchDAOTestCase {

	@Autowired
	ISearchDAO searchDao;
	
	@Test
	public void testFindProvidersByName() {
		 SearchCriteria criteria = new SearchCriteria();
		 criteria.setProviderName("A Castles Tale");
		 List providers = searchDao.findProvidersByCriteria(criteria);
		 Assert.assertEquals(1, providers.size());
	}
	@Test
	public void testFindProvidersByCounty() {
		 SearchCriteria criteria = new SearchCriteria();
		 criteria.setCountyId(new Long(78));
		 List providers = searchDao.findProvidersByCriteria(criteria);
		 Assert.assertEquals(1, providers.size());
	}
	
	@Test
	public void testFindProvidersByProviderType() {
		 SearchCriteria criteria = new SearchCriteria();
		 criteria.setProviderTypeId(new Long(3));
		 List providers = searchDao.findProvidersByCriteria(criteria);
		 Assert.assertEquals(50, providers.size());
	}

}