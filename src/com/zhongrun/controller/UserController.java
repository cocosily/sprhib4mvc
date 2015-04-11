package com.zhongrun.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zhongrun.common.web.controller.BaseController;
import com.zhongrun.model.Ad;
@Scope("prototype")
@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

	
	
	/**
	 * model view 返回jsp 页面
	 * @return
	 */
	@RequestMapping(value = "/tologin", method = {RequestMethod.GET})
	public ModelAndView getAdList(){
		ModelAndView mv = new ModelAndView("user/login");
		/*List<Ad> adList = new ArrayList<Ad>();
		for(int i=0;i<8;i++){			
			Ad ad = new Ad();
			ad.setActionType(1);
			ad.setAdAddTime(new Date().toString());
			ad.setAdName("AAA"+i);
			adList.add(ad);
		}
		
		mv.addObject("adList", adList);*/
		return mv;
	}
	
	/**
	 * 输出json 数据
	 * @return
	 */
	@RequestMapping(value = "/adjson", method = {RequestMethod.GET})
	@ResponseBody
	public Object rtJson(){
		List<Ad> adList = new ArrayList<Ad>();
		for(int i=0;i<8;i++){			
			Ad ad = new Ad();
			adList.add(ad);
		}
		return adList;
	}
	@RequestMapping(value = "/adanalize", method = {RequestMethod.GET})
	public String analizData(){
		
		return "highchartsDemo/hichartsdemo";
	}
}
