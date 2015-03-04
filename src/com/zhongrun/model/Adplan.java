package com.zhongrun.model;

/**
 * Adplan entity. @author MyEclipse Persistence Tools
 */

public class Adplan implements java.io.Serializable,Cloneable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -8832058264296766953L;
	private int adplanId;
	private String adplanName;
	private String keywords;
	private String remarks;
	private int platform;
	private int appType;
	private int isPrivate;
	private int userId;
	
	private int verifyStatus;
	private int adplanStatus;
	private String verifyTime;
	private int verifyAdminId;
	private String addTime;
	
	private String mediaName;
	private String userName;
	private String adminName;
	private int priority;
	private int testFlag;
	private int creativityType;

	public int getAdplanId() {
		return this.adplanId;
	}

	public void setAdplanId(int adplanId) {
		this.adplanId = adplanId;
	}

	public String getAdplanName() {
		return this.adplanName;
	}

	public void setAdplanName(String adplanName) {
		this.adplanName = adplanName;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getPlatform() {
		return this.platform;
	}

	public void setPlatform(int platform) {
		this.platform = platform;
	}

	public int getAppType() {
		return this.appType;
	}

	public void setAppType(int appType) {
		this.appType = appType;
	}

	public int getIsPrivate() {
		return this.isPrivate;
	}

	public void setIsPrivate(int isPrivate) {
		this.isPrivate = isPrivate;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the verifyStatus
	 */
	public int getVerifyStatus() {
		return verifyStatus;
	}

	/**
	 * @param verifyStatus the verifyStatus to set
	 */
	public void setVerifyStatus(int verifyStatus) {
		this.verifyStatus = verifyStatus;
	}

	public int getAdplanStatus() {
		return this.adplanStatus;
	}

	public void setAdplanStatus(int adplanStatus) {
		this.adplanStatus = adplanStatus;
	}

	public String getVerifyTime() {
		return this.verifyTime;
	}

	public void setVerifyTime(String verifyTime) {
		this.verifyTime = verifyTime;
	}


	/**
	 * @return the verifyAdminId
	 */
	public int getVerifyAdminId() {
		return verifyAdminId;
	}

	/**
	 * @param verifyAdminId the verifyAdminId to set
	 */
	public void setVerifyAdminId(int verifyAdminId) {
		this.verifyAdminId = verifyAdminId;
	}

	public String getAddTime() {
		return this.addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

	/**
	 * @return the mediaName
	 */
	public String getMediaName() {
		return mediaName;
	}

	/**
	 * @param mediaName the mediaName to set
	 */
	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}

	/**
	 * @return the adminName
	 */
	public String getAdminName() {
		return adminName;
	}

	/**
	 * @param adminName the adminName to set
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @return the testFlag
	 */
	public int getTestFlag() {
		return testFlag;
	}

	/**
	 * @param testFlag the testFlag to set
	 */
	public void setTestFlag(int testFlag) {
		this.testFlag = testFlag;
	}

	/**
	 * @return the creativityType
	 */
	public int getCreativityType() {
		return creativityType;
	}

	/**
	 * @param creativityType the creativityType to set
	 */
	public void setCreativityType(int creativityType) {
		this.creativityType = creativityType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}