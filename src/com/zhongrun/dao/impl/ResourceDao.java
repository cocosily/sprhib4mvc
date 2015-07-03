package com.zhongrun.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.type.Type;
import org.springframework.stereotype.Repository;

import com.zhongrun.common.dao.hibernate4.BaseHibernateDao;
import com.zhongrun.dao.IResourceDao;
import com.zhongrun.model.Resource;

@Repository("resourceDao")
public class ResourceDao extends BaseHibernateDao<Resource, Integer> implements IResourceDao<Resource, Integer>{

	@Override
	public List<Resource> listResByAdminId(Integer adminId) {
		// TODO Auto-generated method stub
		StringBuffer sql = new StringBuffer("select r.* ");
		//sql.append("r.resname resname, r.resurl resurl, r.displayorder displayorder ")
		sql.append("from SYSTEM_RESOURCE r ")
		.append("left join SYSTEM_Role_Resource rr on r.resourceId = rr.resourceid ")
		.append("where rr.roleid in (select roleId from SYSTEM_ADMIN_ROLE where adminId = ?) ")
		.append("order by r.respid, r.displayorder");
		Map<String, Class<?>> entityMap = new HashMap<String, Class<?>>();
		entityMap.put("r", Resource.class);
		
		Map<String, Type> scalarList = new HashMap<String, Type>();
		List<Resource> resList = this.listByNative(sql.toString(), -1, -1, entityMap, null, new Object[]{adminId});
		
		return resList;
	}

}
