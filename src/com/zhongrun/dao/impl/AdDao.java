package com.zhongrun.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhongrun.dao.IAdDao;
import com.zhongrun.dao.hibernate4.BaseHibernateDao;
import com.zhongrun.model.Ad;

@Repository("adDao")
public class AdDao extends BaseHibernateDao<Ad,Integer> implements IAdDao{

	@Override
	public List<Ad> getAllAd() {
		// TODO Auto-generated method stub
//		this.getSession().createSQLQuery("").
		return this.listAll();
	}

	
}
