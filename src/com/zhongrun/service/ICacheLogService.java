package com.zhongrun.service;

import java.util.List;

import com.zhongrun.entity.CacheLog;
import com.zhongrun.entity.SysLoginPersonBean;

public interface ICacheLogService {

    /**
     * <p>����:����memcached�����ļ�����ʱ����</p>
     * @author �ܷ�
     * @date 2013-4-9
     * @param
     * @return void
     */
    public void saveCacheLog(CacheLog log);

    /**
     * <p>����:��ѯ��prefixΪǰ׺������keyֵ���ڸ���ɾ��ʱʹ�ô˷���</p>
     * @author �ܷ�
     * @date 2013-4-9
     * @param
     * @return List<CacheLog>
     */
    public List<CacheLog> findListByPrefix(String prefix);

    /**
     * <p>����:ɾ������ʱ��aop����</p>
     * @author �ܷ�
     * @date 2013-4-9
     * @param
     * @return void
     */
    public void memcacheDeleteByPrefix();

    /**
     * <p>����:ɾ����ʱ���¼������</p>
     * @author �ܷ�
     * @date 2013-4-9
     * @param
     * @return int
     */
    public int deleteByPrefix(String prefix);

    /**
     * <p>����:�������ӣ�����������Ա���ݣ������person_idû��ʹ�ã�ֻ��Ϊ�˲���keyֵ�����ɲ���</p>
     * @author �ܷ�
     * @date 2013-4-9
     * @param
     * @return List<SysLoginPersonBean>
     */
    public List<SysLoginPersonBean> memcacheFindAll(int b_use,String person_id);

    /**
     * <p>����:���Է��������Ժ���</p>
     * @author �ܷ�
     * @date 2013-4-9
     * @param
     * @return List<CacheLog>
     */
    public List<CacheLog> memcacheCacheLogFindAll();

    /**
     * <p>����:�޸���Ա</p>
     * @author �ܷ�
     * @date 2013-4-9
     * @param
     * @return int
     */
    public int updateMemSysLoginPersonBean(String prefix,String person_id,String real_name);


}
