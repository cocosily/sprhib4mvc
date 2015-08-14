package com.zhongrun.dao;
import java.util.List;

import com.zhongrun.entity.CacheLog;

public interface ICacheLogDao {

    public void add(CacheLog log);

    public int deleteByPrefix(String prefix);

    public List<CacheLog> findListByPrefix(String prefix);

    public List<CacheLog> findCacheLogAll();

}
