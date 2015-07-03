package com.zhongrun.ws.service.impl;

import java.util.List;

import javax.jws.WebService;

import com.zhongrun.model.Ad;
import com.zhongrun.ws.service.AdWebService;

@WebService(endpointInterface="com.zhongrun.ws.service.AdWebService", serviceName="adWebService", targetNamespace = "http://service.webservice.com/")
public class AdWebServiceImpl implements AdWebService{

	@Override
	public Ad getAdInfo(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ad> getAdListByCon(Ad vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ad> getAllAds() {
		// TODO Auto-generated method stub
		return null;
	}

}
