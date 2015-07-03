package com.zhongrun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zhongrun.dao.IAdFlowDayDao;
import com.zhongrun.model.AdFlowDay;
import com.zhongrun.service.IAdFlowService;

//@Service("adFlowService")
public class AdFlowDayServiceImpl implements IAdFlowService {

	/*@Autowired
	*/@Qualifier("adFlowDayDao")
	private IAdFlowDayDao<AdFlowDay,Integer> adFlowDayDao;
	
	public List<AdFlowDay> staticsAdFlowDay(){
		
		
		//adFlowDayDao.
		return adFlowDayDao.listAll();
	}
	
	
	
}
