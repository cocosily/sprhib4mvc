package com.zhongrun.dao;

import java.util.List;

import com.zhongrun.common.dao.IBaseDao;
import com.zhongrun.model.Admin;

public interface IAdminDao<M extends java.io.Serializable, PK extends java.io.Serializable> extends IBaseDao<M, PK>{

	public List<Admin> listAdminsByName(String userName);
}
