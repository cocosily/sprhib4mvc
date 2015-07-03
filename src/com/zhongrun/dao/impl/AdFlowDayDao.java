package com.zhongrun.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhongrun.common.dao.hibernate4.BaseHibernateDao;
import com.zhongrun.dao.IAdFlowDayDao;
import com.zhongrun.model.Ad;
import com.zhongrun.model.AdFlowDay;

@Repository("adFlowDayDao")
public class AdFlowDayDao extends BaseHibernateDao<AdFlowDay,Integer> implements IAdFlowDayDao<AdFlowDay,Integer>{

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

	public List<AdFlowDay> staticsAdFlowDay(){
		//this.
		return null;
	}
	
}
