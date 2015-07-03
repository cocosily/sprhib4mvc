package com.zhongrun.service;

import java.util.List;

import com.zhongrun.model.Admin;
import com.zhongrun.model.Resource;

public interface IAdminService {

	public List<Admin> getAdminsByName(String userName);
	
	public List<Resource> getReourcesByAdmin(Integer adminId);
	
}
