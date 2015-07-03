package com.zhongrun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import com.zhongrun.common.model.AbstractModel;

@Entity
@Proxy(lazy = true)
@Table(name = "Ad_video")
public class AdAppInfo extends AbstractModel implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -6132117804511468562L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="adId")
	private int adId;
	@Column(name="appTypeId")
	private int appTypeId;//分类ID
	@Column(name="SystemId")
	private int SystemId;//平台类型 0-android 1-ios
	@Column(name="TabIds")
	private int TabIds;//标签ID串
	@Column(name="AppName")
	private String AppName;//游戏名称
	@Column(name="AppTitle")
	private String AppTitle;//简短标题（不超过15个汉字）
	@Column(name="AppVersion")
	private String AppVersion;//版本号。
	@Column(name="AppMinVersion")
	private String AppMinVersion;//游戏可运行的系统最低版本号
	
	@Column(name="size")
	private float size;//大小
	@Column(name="logo")
	private String logo;//图标
	@Column(name="introduction")
	private String introduction;//简介
	@Column(name="downloadNum")
	private int downloadNum;//下载次数
	@Column(name="appUrl")
	private String appUrl;//下载地址
	@Column(name="packageName")
	private String packageName;//应用包名
	@Column(name="rating")
	private int rating;//评分等级
	@Column(name="priority")
	private int priority;//优先级
	@Column(name="state")
	private int state;//状态
	@Column(name="sdkFlag")
	private int sdkFlag;//0/1 是否嵌入支付 SDK
	@Column(name="adminId")
	private int adminId;//操作员
	@Column(name="addTime")
	private String addTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdId() {
		return adId;
	}

	public void setAdId(int adId) {
		this.adId = adId;
	}

	public int getAppTypeId() {
		return appTypeId;
	}

	public void setAppTypeId(int appTypeId) {
		this.appTypeId = appTypeId;
	}

	public int getSystemId() {
		return SystemId;
	}

	public void setSystemId(int systemId) {
		SystemId = systemId;
	}

	public int getTabIds() {
		return TabIds;
	}

	public void setTabIds(int tabIds) {
		TabIds = tabIds;
	}

	public String getAppName() {
		return AppName;
	}

	public void setAppName(String appName) {
		AppName = appName;
	}

	public String getAppTitle() {
		return AppTitle;
	}

	public void setAppTitle(String appTitle) {
		AppTitle = appTitle;
	}

	public String getAppVersion() {
		return AppVersion;
	}

	public void setAppVersion(String appVersion) {
		AppVersion = appVersion;
	}

	public String getAppMinVersion() {
		return AppMinVersion;
	}

	public void setAppMinVersion(String appMinVersion) {
		AppMinVersion = appMinVersion;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public int getDownloadNum() {
		return downloadNum;
	}

	public void setDownloadNum(int downloadNum) {
		this.downloadNum = downloadNum;
	}

	public String getAppUrl() {
		return appUrl;
	}

	public void setAppUrl(String appUrl) {
		this.appUrl = appUrl;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getSdkFlag() {
		return sdkFlag;
	}

	public void setSdkFlag(int sdkFlag) {
		this.sdkFlag = sdkFlag;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	

}