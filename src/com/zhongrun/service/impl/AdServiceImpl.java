package com.zhongrun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zhongrun.dao.IAdDao;
import com.zhongrun.model.Ad;
import com.zhongrun.service.IAdService;

@Service("adService")
public class AdServiceImpl implements IAdService {

	@Autowired
	@Qualifier("adDao")
//	@Resource(name="adDao")
	private IAdDao<Ad,Integer> adDao;
	
	public List<Ad> getAdList(){
		
		//return adDao.getAllAd();
		return adDao.listAll();
	}
	
	public Integer saveAd(Ad model){
		return adDao.save(model);
	}

	@Override
	public Integer saveAdM(Ad model) {
		// TODO Auto-generated method stub
		return adDao.save(model);
	}

	
}
