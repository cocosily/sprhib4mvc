package com.zhongrun.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.zhongrun.common.dao.hibernate4.BaseHibernateDao;
import com.zhongrun.dao.IAdminDao;
import com.zhongrun.model.Admin;

@Repository("adminDao")
public class AdminDao extends BaseHibernateDao<Admin,Integer> implements IAdminDao<Admin,Integer>{

	@Override
	public List<Admin> listAdminsByName(String userName) {
		Criteria criteria = this.getSession().createCriteria(Admin.class); 
		Criterion cron = Restrictions.like("adminName",userName);
		criteria.add(cron);
		List<Admin> list = this.list(criteria);
		// TODO Auto-generated method stub
		return list;
	}

}
