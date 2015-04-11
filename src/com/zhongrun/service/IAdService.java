package com.zhongrun.service;

import java.util.List;

import com.zhongrun.model.Ad;

public interface IAdService {

	public List<Ad> getAdList();
	
	public Integer saveAdM(Ad model);
}
