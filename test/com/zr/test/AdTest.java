package com.zr.test;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.zhongrun.model.Ad;
import com.zhongrun.service.IAdService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class AdTest {

	@Autowired
	private IAdService adService;
	
	@Test
	public void testGetAllAds(){
		//add ad entity
		Ad s = new Ad();
		s.setAddTime(new Timestamp(System.currentTimeMillis()));
		s.setUserId(0);
		s.setAdName("测试广告0");
		s.setAliasName("测试广告别名0");
	//	s.s
		int k = adService.saveAdM(s);
		
		System.out.println("添加的主键   :: "+k);
		List<Ad> list = adService.getAdList();
		System.out.println("======"+ list.size());
		for (Ad ad : list) {
			System.out.println(ad.getAdName());
			//System.out.println("======"+ list.size());
		}
		
	}
}
