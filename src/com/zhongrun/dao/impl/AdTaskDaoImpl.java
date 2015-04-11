package com.zhongrun.dao.impl;

import java.util.List;

import org.hibernate.Criteria;

import com.zhongrun.common.dao.hibernate4.BaseHibernateDao;
import com.zhongrun.common.dao.util.ConditionQuery;
import com.zhongrun.common.dao.util.OrderBy;
import com.zhongrun.dao.IAdTaskDao;
import com.zhongrun.model.AdTask;

public class AdTaskDaoImpl extends BaseHibernateDao<AdTask, Integer> implements
		IAdTaskDao {

	@Override
	public List<AdTask> findAdTaskByCon() {
		// TODO Auto-generated method stub
		ConditionQuery query = new ConditionQuery();
		Criteria cri = this.getSession().createCriteria(AdTask.class);
		//cri.
		
				/*query.add(criterion);*/
		OrderBy order = new OrderBy();
		int pn = 0;
		int pageSize = 10;
		StringBuffer hql = new StringBuffer(); 
		this.listPage(hql.toString(), pn, pageSize, new Object[]{});
		return null;
	}

	@Override
	public boolean addAdTask(AdTask adtask) {
		// TODO Auto-generated method stub
		Integer id = this.save(adtask);
		return id != null;
	}

	@Override
	public void upadateAdTask(AdTask adTask) {
		// TODO Auto-generated method stub
		this.update(adTask);
	}

	@Override
	public void deleteAdTask(AdTask adTask) {
		// TODO Auto-generated method stub
		this.deleteObject(adTask);
	}

	@Override
	public AdTask getAdTaskById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
