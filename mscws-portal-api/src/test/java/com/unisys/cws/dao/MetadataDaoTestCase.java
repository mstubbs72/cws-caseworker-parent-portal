package com.unisys.cws.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-config.xml")
public class MetadataDaoTestCase {

	@Autowired
	private IMetadataDAO metadataDao;
	
	@Test
	public void testGetAllProviderTypes(){
		Assert.assertNotNull(metadataDao.getAllCountys());
	}
	
	@Test
	public void testGetAllCountys(){
		Assert.assertNotNull(metadataDao.getAllCountys());	
	}
	
	@Test
	public void testGetAllRatings(){
		Assert.assertNotNull(metadataDao.getAllRatings());
	}
}