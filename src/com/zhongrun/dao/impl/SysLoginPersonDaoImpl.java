package com.zhongrun.dao.impl;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.zhongrun.common.dao.hibernate4.BaseHibernateDao;
import com.zhongrun.dao.ISysLoginPersonDao;
import com.zhongrun.entity.SysLoginPersonBean;

@Repository("sysLoginPersonDao")
public class SysLoginPersonDaoImpl extends BaseHibernateDao<SysLoginPersonBean, Integer> implements ISysLoginPersonDao {

    public List<SysLoginPersonBean> findAll(int b_use) {
        try {
            //String sql = "SELECT * FROM t_sys_loginperson WHERE b_use = ?";
            String hql = "from SysLoginPersonBean where b_use = ?";
            return this.list(hql, new Integer[]{b_use});
            //return RSMapper.queryList(jdbcTemplate, sql, SysLoginPersonBean.class,b_use);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int updateSysLoginPersonBean(String person_id,String real_name) {
        int result = 0;
        try {
            String sql = "UPDATE t_sys_loginperson SET real_name = ? WHERE person_id = ?";
            this.execteNativeBulk(sql, new String[]{real_name, person_id});
            return 1;
        } catch (DataAccessException e) {
            e.printStackTrace();
            System.out.println("ÐÞ¸ÄÊ±±¨´í");
        }
        return result;
    }
}
