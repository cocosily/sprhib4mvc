package com.zhongrun.common.web.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.zhongrun.common.Constant;
import com.zhongrun.common.util.DateUtil;

public abstract class BaseController extends MultiActionController {

	public static HttpSession session;

	public static String Ip;
	
	protected String result = "success";
	
	
	@Autowired
	private HttpServletRequest request;
	
	
	
	/**
	 * 获取request值
	 * 
	 * @param name
	 */
	protected String getParameter(String name) {

		return request.getParameter(name);
	}
	
	/**
	 * 获取request值
	 * 
	 * @param name
	 */
	protected String[] getParameterValues(String name) {

		return request.getParameterValues(name);
	}
	
	/**
	 * 获取根目录
	 */
	protected String basePath() {
		return request.getScheme() + "://" + request.getServerName() + ":"
				+ request.getServerPort() + request.getContextPath() + "/";
	}

	/**
	 * 获取登录用户名称
	 */
	protected String getCurrentUserName() {
		return (String) request.getSession().getAttribute(
				Constant.CURRENT_USER_NAME_SESSION_KEY);
	}

	/**
	 * 获取登录用户ID
	 */
	protected String getCurrentUserId() {
		return (String) request.getSession().getAttribute(
				Constant.CURRENT_USER_ID_SESSION_KEY);
	}

	protected String getCurrentDate() {
		return DateUtil.getFullDate(new Date());
	}

	/*public Map<String, Object> getResultData() {
		return resultData;
	}

	public void setResultData(Map<String, Object> resultData) {
		this.resultData = resultData;
	}*/
	
}
