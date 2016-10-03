package com.unisys.cws.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unisys.cws.dao.ISearchDAO;
import com.unisys.cws.domain.County;
import com.unisys.cws.domain.ProviderType;
import com.unisys.cws.domain.Providers;
import com.unisys.cws.domain.QualityRating;
import com.unisys.cws.util.SearchCriteria;

@Repository
@Transactional
public class SearchDAOImpl implements ISearchDAO {

	@SuppressWarnings("unused")
	@Autowired
	private SessionFactory sessionFactory;

	public List<Providers> findProvidersByCriteria(SearchCriteria searchCriteria) {
		StringBuffer querySQL = new StringBuffer();
		querySQL.append("from Providers p");
		String str = "";
		if (null != searchCriteria) {
			if (null != searchCriteria.getProviderName() && !"".equals(searchCriteria.getProviderName())) {
				if (null != str && !"".equalsIgnoreCase(str))
					str = str + " and p.providerName = '" + searchCriteria.getProviderName() + "'";
				else
					str = str + " p.providerName = '" + searchCriteria.getProviderName() + "'";
			}
			if (null != searchCriteria.getCityId()) {
				if (null != str && !"".equalsIgnoreCase(str))
					str = str + " and p.physicalCity.id = " + searchCriteria.getCityId();
				else
					str = str + " p.physicalCity.id = " + searchCriteria.getCityId();
			}
			if (null != searchCriteria.getCountyId()) {
				if (null != str && !"".equalsIgnoreCase(str))
					str = str + " and p.county.countyNumber = " + searchCriteria.getCountyId();
				else
					str = str + " p.county.countyNumber = " + searchCriteria.getCountyId();
			}
			if (null != searchCriteria.getRatingId()) {
				if (null != str && !"".equalsIgnoreCase(str))
					str = str + " and p.qualityRating.qualityRating = " + searchCriteria.getRatingId();
				else
					str = str + " p.qualityRating.qualityRating = " + searchCriteria.getRatingId();
			}
			if (null != searchCriteria.getProviderTypeId()) {
				if (null != str && !"".equalsIgnoreCase(str))
					str = str + " and p.providerType.providerType = " + searchCriteria.getProviderTypeId();
				else
					str = str + " p.providerType.providerType = " + searchCriteria.getProviderTypeId();
			}
		}
		if (!"".equals(str)) {
			querySQL.append(" where ");
			querySQL.append(str);
		}
		Query query = sessionFactory.getCurrentSession().createQuery(querySQL.toString());
		return query.list();
	}

}
