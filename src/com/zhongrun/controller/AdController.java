package com.zhongrun.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zhongrun.common.pagination.IPageContext;
import com.zhongrun.common.pagination.Page;
import com.zhongrun.common.pagination.PageContext;
import com.zhongrun.common.web.controller.BaseController;
import com.zhongrun.model.Ad;
import com.zhongrun.service.IAdService;
@Scope("prototype")
@Controller
@RequestMapping("/ad")
public class AdController extends BaseController{

	@Autowired
	@Qualifier("adService")
	private IAdService adService;
	/**
	 * 返回页面路径
	 * @return
	 */
	@RequestMapping(value = "/list", method = {RequestMethod.GET})
	public String adList(){
		System.out.println("qqqqqqqqqqq");
		return "ad/adList";
	}
	
	/**
	 * model view 返回jsp 页面
	 * @return
	 */
	@RequestMapping(value = "/newlist", method = {RequestMethod.GET})
	public ModelAndView getAdList(int pn){
		ModelAndView mv;
		try {
 			mv = new ModelAndView("ad/adListNew");
			List<Ad> adList = adService.getAdList();
			IPageContext<Ad> pageCont = new PageContext<Ad>(adList);
			pn = pn < 1 ? 1 : pn;
			Page<Ad> page = pageCont.getPage(pn);
			//page.setContext(pageCont);
			/*List<Ad> adList = new ArrayList<Ad>();
			for(int i=0;i<8;i++){			
				Ad ad = new Ad();
				ad.setActionType(1);
				ad.setAdAddTime(new Date().toString());
				ad.setAdName("AAA"+i);
				adList.add(ad);
			}*/
			
			mv.addObject("page", page);
			return mv;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 输出json 数据
	 * @return
	 */
	@RequestMapping(value = "/adjson", method = {RequestMethod.GET})
	@ResponseBody
	public Object rtJson(){
		List<Ad> adList = adService.getAdList();
		for(int i=0;i<8;i++){			
			Ad ad = new Ad();
			/*ad.setActionType(1);
			ad.setAdAddTime(new Date().toString());
			ad.setAdName("AAA"+i);*/
			adList.add(ad);
		}
		return adList;
	}
	@RequestMapping(value = "/adanalize", method = {RequestMethod.GET})
	public String analizData(){
		
		return "highchartsDemo/hichartsdemo";
	}
	
	/**
	 * model view 返回jsp 页面
	 * @return
	 */
	@RequestMapping(value = "/add", method = {RequestMethod.POST})
	public ModelAndView addAdModel(@ModelAttribute Ad ad, String flag){
		ModelAndView mv = new ModelAndView("ad/adsuccess");
		System.out.println(flag+"==="+ad.getAdName());
		ad.setUserId(0);
		ad.setAddTime(new Timestamp(System.currentTimeMillis()));
		Integer adId = adService.saveAdM(ad);
		
		mv.addObject("result", adId);
		return mv;
	}
	
	/**
	 * model view 返回jsp 页面
	 * @return
	 */
	@RequestMapping(value = "/addPage", method = {RequestMethod.GET})
	public ModelAndView addAdPage(){
		return new ModelAndView("ad/ad_add");
	}
	
	/**
	 * 实现对象参数传递 例如 ad.id=88
	 * @param binder
	 */
	@InitBinder("ad")
	public void initBinderAd(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("ad.");
	}
}
