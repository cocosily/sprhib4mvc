package com.zhongrun.service;

import java.util.List;

import com.zhongrun.entity.CacheLog;
import com.zhongrun.entity.SysLoginPersonBean;

public interface ICacheLogService {

    /**
     * <p>功能:增加memcached数据文件到临时表中</p>
     * @author 周枫
     * @date 2013-4-9
     * @param
     * @return void
     */
    public void saveCacheLog(CacheLog log);

    /**
     * <p>功能:查询以prefix为前缀的所有key值，在更新删除时使用此方法</p>
     * @author 周枫
     * @date 2013-4-9
     * @param
     * @return List<CacheLog>
     */
    public List<CacheLog> findListByPrefix(String prefix);

    /**
     * <p>功能:删除操作时，aop拦截</p>
     * @author 周枫
     * @date 2013-4-9
     * @param
     * @return void
     */
    public void memcacheDeleteByPrefix();

    /**
     * <p>功能:删除临时表记录的数据</p>
     * @author 周枫
     * @date 2013-4-9
     * @param
     * @return int
     */
    public int deleteByPrefix(String prefix);

    /**
     * <p>功能:查找例子，查找所有人员数据，后面的person_id没有使用，只是为了测试key值的生成策略</p>
     * @author 周枫
     * @date 2013-4-9
     * @param
     * @return List<SysLoginPersonBean>
     */
    public List<SysLoginPersonBean> memcacheFindAll(int b_use,String person_id);

    /**
     * <p>功能:测试方法，可以忽略</p>
     * @author 周枫
     * @date 2013-4-9
     * @param
     * @return List<CacheLog>
     */
    public List<CacheLog> memcacheCacheLogFindAll();

    /**
     * <p>功能:修改人员</p>
     * @author 周枫
     * @date 2013-4-9
     * @param
     * @return int
     */
    public int updateMemSysLoginPersonBean(String prefix,String person_id,String real_name);


}
