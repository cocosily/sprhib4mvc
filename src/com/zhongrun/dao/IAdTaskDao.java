package com.zhongrun.dao;

import java.util.List;

import com.zhongrun.model.AdTask;

public interface IAdTaskDao {

	public List<AdTask> findAdTaskByCon();
	
	public boolean addAdTask(AdTask adtask);
	
	public void upadateAdTask(AdTask adTask);
	
	public void deleteAdTask(AdTask adTask);
	
	public AdTask getAdTaskById(Integer id);
}
