package com.zhongrun.dao;

import java.util.List;

import com.zhongrun.common.dao.IBaseDao;
import com.zhongrun.model.Ad;

public interface IAdDao<M extends java.io.Serializable, PK extends java.io.Serializable> extends IBaseDao<M, PK>{

	public List<Ad> getAllAd();
}
