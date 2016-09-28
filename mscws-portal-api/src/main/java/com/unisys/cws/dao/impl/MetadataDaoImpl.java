package com.unisys.cws.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unisys.cws.dao.IMetadataDao;
import com.unisys.cws.domain.County;
import com.unisys.cws.domain.ProviderType;
import com.unisys.cws.domain.QualityRating;

@Repository
@Transactional
public class MetadataDaoImpl implements IMetadataDao{

	@Autowired
	private SessionFactory sessionFactory; 
	
	public List<County> getAllCountys(){
		return sessionFactory.getCurrentSession().createQuery("from County c").list();
	}
	public List<ProviderType> getAllProviderTypes(){
		return sessionFactory.getCurrentSession().createQuery("from ProviderType p").list();
	}
	
	public List<QualityRating> getAllRatings(){
		return sessionFactory.getCurrentSession().createQuery("from QualityRating p").list();
	}

}
