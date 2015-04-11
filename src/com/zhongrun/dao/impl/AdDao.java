package com.zhongrun.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhongrun.common.dao.hibernate4.BaseHibernateDao;
import com.zhongrun.dao.IAdDao;
import com.zhongrun.model.Ad;

@Repository("adDao")
public class AdDao extends BaseHibernateDao<Ad,Integer> implements IAdDao<Ad,Integer>{

	@Override
	public List<Ad> getAllAd() {
		// TODO Auto-generated method stub
//		this.getSession().createSQLQuery("").
		String hql = "from Ad";
		Object[] paramlist = new Object[]{};
		List<Ad> list = this.listPage(hql, 2, 10, paramlist);
		this.execteBulk(hql, paramlist);
		return list;
	}

	
}
