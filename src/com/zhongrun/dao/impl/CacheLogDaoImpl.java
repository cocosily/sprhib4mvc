package com.zhongrun.dao.impl;

import com.zhongrun.dao.ICacheLogDao;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.List;

import com.zhongrun.common.dao.hibernate4.BaseHibernateDao;
import com.zhongrun.entity.CacheLog;

@Repository("cacheLogDao")
public class CacheLogDaoImpl<M, PK> extends BaseHibernateDao<CacheLog, BigInteger> implements ICacheLogDao {
    public void add(CacheLog log) {
        try {
            //String sql = "INSERT INTO t_cache_log(prefix,cache_key,add_time) VALUES (?,?,?)";
            int result = 0;
            //Date now = new Date();
            log.setAdd_time(new Timestamp(System.currentTimeMillis()));
            result = this.save(log).intValue();
            //result = this.jdbcTemplate.update(sql, log.getPrefix(),log.getCache_key(),now);
            System.out.println("增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("增加报错");
        }
    }

    public int deleteByPrefix(String prefix) {
        try {
            String sql = "DELETE FROM t_cache_log WHERE prefix = ?";
            int result = 0;
            this.execteNativeBulk(sql, new String[]{prefix});
            //result = this.jdbcTemplate.update(sql, prefix);
            return 1;
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<CacheLog> findListByPrefix(String prefix) {
        try {
            //String sql = "SELECT * FROM t_cache_log WHERE prefix = ?";
            String hql = "form CacheLog where prefix = ?";
            return this.list(hql, new String[]{prefix});
            //return RSMapper.queryList(jdbcTemplate, sql, CacheLog.class, prefix);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<CacheLog> findCacheLogAll() {
        try {
            //String sql = "SELECT * FROM t_cache_log";
            return this.listAll();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }



}
