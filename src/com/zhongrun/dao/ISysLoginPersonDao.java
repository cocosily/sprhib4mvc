package com.zhongrun.dao;

import java.util.List;

import com.zhongrun.entity.SysLoginPersonBean;

public interface ISysLoginPersonDao {

    public List<SysLoginPersonBean> findAll(int b_use);

    public int updateSysLoginPersonBean(String person_id,String real_name);

}
