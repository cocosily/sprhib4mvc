package com.zhongrun.model;

/**
 * Adcreative entity. @author MyEclipse Persistence Tools
 */

public class Adcreative implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -3452186103036949155L;
	private int adCreativeId;
	private String adCreativeName;
	private String remarks;
	private int creativityType;
	private int costType;
	private int adShowType;
	private int layoutType;
	private int cornerColor;
	private int cornerLocation;
	private int adCreativeStatus;
	private int userId;
	private String addTime;

	// Constructors

	/** default constructor */
	public Adcreative() {
	}



	// Property accessors

	public int getAdCreativeId() {
		return this.adCreativeId;
	}

	public void setAdCreativeId(int adCreativeId) {
		this.adCreativeId = adCreativeId;
	}

	public String getAdCreativeName() {
		return this.adCreativeName;
	}

	public void setAdCreativeName(String adCreativeName) {
		this.adCreativeName = adCreativeName;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getCreativityType() {
		return this.creativityType;
	}

	public void setCreativityType(int creativityType) {
		this.creativityType = creativityType;
	}

	public int getCostType() {
		return this.costType;
	}

	public void setCostType(int costType) {
		this.costType = costType;
	}

	public int getAdShowType() {
		return this.adShowType;
	}

	public void setAdShowType(int adShowType) {
		this.adShowType = adShowType;
	}

	public int getLayoutType() {
		return this.layoutType;
	}

	public void setLayoutType(int layoutType) {
		this.layoutType = layoutType;
	}

	public int getCornerColor() {
		return this.cornerColor;
	}

	public void setCornerColor(int cornerColor) {
		this.cornerColor = cornerColor;
	}

	public int getCornerLocation() {
		return this.cornerLocation;
	}

	public void setCornerLocation(int cornerLocation) {
		this.cornerLocation = cornerLocation;
	}

	public int getAdCreativeStatus() {
		return this.adCreativeStatus;
	}

	public void setAdCreativeStatus(int adCreativeStatus) {
		this.adCreativeStatus = adCreativeStatus;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAddTime() {
		return this.addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

}