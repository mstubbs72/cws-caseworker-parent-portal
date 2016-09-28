/**
 * 
 */
package com.unisys.cws.controller;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * @author KulkarnK
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-mvc-config.xml")
@WebAppConfiguration
public class SearchControllerTestCase {/*

	*//**
	 * @throws java.lang.Exception
	 *//*
	@Before
	public void setUp() throws Exception {
		this.mockMvc = webAppContextSetup(ctx).build();
	}

	*//**
	 * @throws java.lang.Exception
	 *//*
	@After
	public void tearDown() throws Exception {
	}

	*//**
	 * Test method for
	 * {@link com.unisys.cws.controller.SearchController#findProvidersByCriteria(java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long)}
	 * .
	 *//*
	@Test
	public void testFindProvidersByCriteria() {
		try {
			mockMvc.perform(get("/hello").accept(MediaType.APPLICATION_JSON_VALUE))				
					.andExpect(status().isOk());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Autowired
	private WebApplicationContext ctx;

	private MockMvc mockMvc;
*/}
