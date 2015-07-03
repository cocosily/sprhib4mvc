package com.zhongrun.ws.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.zhongrun.model.Ad;

@WebService
public interface AdWebService {

	@WebMethod
	public Ad getAdInfo(@WebParam(name = "id")Integer id);
	
	@WebMethod
	public List<Ad> getAdListByCon(@WebParam(name = "vo")Ad vo);
	
	@WebMethod
	public List<Ad> getAllAds();
}
