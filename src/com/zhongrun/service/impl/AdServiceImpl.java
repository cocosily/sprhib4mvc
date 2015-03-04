package com.zhongrun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zhongrun.dao.IAdDao;
import com.zhongrun.dao.impl.AdDao;
import com.zhongrun.model.Ad;
import com.zhongrun.service.IAdService;

@Service("adService")
public class AdServiceImpl implements IAdService {

	@Autowired
	@Qualifier("adDao")
//	@Resource(name="adDao")
	private IAdDao adDao;
	
	public List<Ad> getAdList(){
		return adDao.getAllAd();
		//return null;
	}
	
}
