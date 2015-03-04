package com.zhongrun.model;

/**
 * Adplancost entity. @author MyEclipse Persistence Tools
 */

public class Adplancost implements java.io.Serializable,Cloneable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -4777206169740113977L;
	private int costId;
	private int adplanId;
	private int mediaId;
	private Double price;
	private int creativityType;
	private int costType;
	private int testFlag;
	private int adplanCostStatus;
	private String addTime;

	private String mediaName;
	private Double minPrice;
	private Double averagePrice;
	private Double maxPrice;
	// Constructors

	/** default constructor */
	public Adplancost() {
	}


	// Property accessors

	public int getCostId() {
		return this.costId;
	}

	public void setCostId(int costId) {
		this.costId = costId;
	}


	/**
	 * @return the adplanId
	 */
	public int getAdplanId() {
		return adplanId;
	}


	/**
	 * @param adplanId the adplanId to set
	 */
	public void setAdplanId(int adplanId) {
		this.adplanId = adplanId;
	}


	public int getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(int mediaId) {
		this.mediaId = mediaId;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the creativityType
	 */
	public int getCreativityType() {
		return creativityType;
	}


	/**
	 * @return the costType
	 */
	public int getCostType() {
		return costType;
	}


	/**
	 * @param creativityType the creativityType to set
	 */
	public void setCreativityType(int creativityType) {
		this.creativityType = creativityType;
	}


	/**
	 * @param costType the costType to set
	 */
	public void setCostType(int costType) {
		this.costType = costType;
	}


	public int getAdplanCostStatus() {
		return this.adplanCostStatus;
	}

	public void setAdplanCostStatus(int adplanCostStatus) {
		this.adplanCostStatus = adplanCostStatus;
	}

	public String getAddTime() {
		return this.addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}


	/**
	 * @return the minPrice
	 */
	public Double getMinPrice() {
		return minPrice;
	}


	/**
	 * @return the maxPrice
	 */
	public Double getMaxPrice() {
		return maxPrice;
	}


	/**
	 * @param minPrice the minPrice to set
	 */
	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}


	/**
	 * @param maxPrice the maxPrice to set
	 */
	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}


	/**
	 * @return the averagePrice
	 */
	public Double getAveragePrice() {
		return averagePrice;
	}


	/**
	 * @param averagePrice the averagePrice to set
	 */
	public void setAveragePrice(Double averagePrice) {
		this.averagePrice = averagePrice;
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


	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}