package com.zhongrun.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zhongrun.common.dao.IBaseDao;
import com.zhongrun.common.service.impl.BaseService;
import com.zhongrun.dao.IAdminDao;
import com.zhongrun.dao.IResourceDao;
import com.zhongrun.model.Admin;
import com.zhongrun.model.Resource;
import com.zhongrun.service.IAdminService;

@Service("adminService")
public class AdminServiceImpl extends BaseService<Admin, Integer> implements IAdminService {

	@Autowired
	@Qualifier("adminDao")
	private IAdminDao<Admin,Integer> adminDao;
	
	@Autowired
	@Qualifier("resourceDao")
	private IResourceDao<Resource,Integer> resourceDao;
	
	@Override
	public void setBaseDao(IBaseDao<Admin, Integer> baseDao) {
		// TODO Auto-generated method stub
		this.adminDao = (IAdminDao<Admin, Integer>) baseDao;
	}

	@Override
	public List<Admin> getAdminsByName(String userName) {
		// TODO Auto-generated method stub
		
		return adminDao.listAdminsByName(userName);
	}
	
	@Override
	public List<Resource> getReourcesByAdmin(Integer adminId){
		List<Resource> totalList = resourceDao.listResByAdminId(adminId);
		Map<Integer, Resource> map = new HashMap<Integer, Resource>();
		for (Resource resource : totalList) {
			if(resource.getRespid() == 0){//主菜单
				map.put(resource.getResourceId(), resource);
			}else{
				Resource menu = map.get(resource.getRespid());
				if(null != menu){
					List<Resource> childList = menu.getChildResources();
					if(null == childList)
						childList = new ArrayList<Resource>();
					childList.add(resource);
					menu.setChildResources(childList);
					map.put(resource.getRespid(), menu);
				}
			}
		}
		
		List<Resource> result = new ArrayList<Resource>();
		for(Entry<Integer, Resource> entry : map.entrySet()){
			result.add(entry.getValue());
		}
		return result;
	}

	
}
