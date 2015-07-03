package com.zhongrun.dao;

import java.util.List;

import com.zhongrun.common.dao.IBaseDao;
import com.zhongrun.model.Resource;


@SuppressWarnings("hiding")
public interface IResourceDao<Resource extends java.io.Serializable, Integer extends java.io.Serializable> extends IBaseDao<Resource, Integer>{

	public List<Resource> listResByAdminId(Integer adminId);
}
