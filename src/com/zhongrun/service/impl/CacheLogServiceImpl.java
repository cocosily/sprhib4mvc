
package com.zhongrun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.zhongrun.common.annotation.Cache;
import com.zhongrun.common.annotation.Flush;
import com.zhongrun.dao.ICacheLogDao;
import com.zhongrun.dao.ISysLoginPersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zhongrun.entity.CacheLog;
import com.zhongrun.entity.SysLoginPersonBean;
import com.zhongrun.service.ICacheLogService;

@Service
public class CacheLogServiceImpl implements ICacheLogService {

    @Autowired
    @Qualifier("cacheLogDao")
    private ICacheLogDao cacheLogDao;

    @Autowired
    @Qualifier("sysLoginPersonDao")
    private ISysLoginPersonDao sysLoginPersonDao;

    @Override
    public void saveCacheLog(CacheLog log) {
        cacheLogDao.add(log);
    }

    @Override
    public List<CacheLog> findListByPrefix(String prefix) {
        // TODO Auto-generated method stub
        return cacheLogDao.findListByPrefix(prefix);
    }

    @Override
    @Flush(prefix="sys")
    public void memcacheDeleteByPrefix() {
        // TODO Auto-generated method stub
    }

    @Override
    public int deleteByPrefix(String prefix) {
        // TODO Auto-generated method stub
        return cacheLogDao.deleteByPrefix(prefix);
    }

    @Override
    @Cache(prefix="sys",expiration=1000*60*60*2)
    public List<SysLoginPersonBean> memcacheFindAll(int b_use,String person_id) {
        // TODO Auto-generated method stub
        return sysLoginPersonDao.findAll(b_use);
    }

    @Override
    @Cache(prefix="sys",expiration=1000*60*60*2)
    public List<CacheLog> memcacheCacheLogFindAll() {
        // TODO Auto-generated method stub
        return cacheLogDao.findCacheLogAll();
    }

    @Override
    @Flush(prefix="sys")
    public int updateMemSysLoginPersonBean(String prefix,String person_id,String real_name) {
        return sysLoginPersonDao.updateSysLoginPersonBean(person_id,real_name);

    }

}
