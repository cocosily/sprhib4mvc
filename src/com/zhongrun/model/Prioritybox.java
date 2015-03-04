package com.zhongrun.model;

/**
 * Prioritybox entity. @author MyEclipse Persistence Tools
 */

public class Prioritybox implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -9193707254798179809L;
	private int priorityId;
	private int adplanId;
	private int mediaId;
	private int creativityType;
	private String addTime;

	// Constructors

	/** default constructor */
	public Prioritybox() {
	}

	/**
	 * @return the priorityId
	 */
	public int getPriorityId() {
		return priorityId;
	}

	/**
	 * @return the adplanId
	 */
	public int getAdplanId() {
		return adplanId;
	}

	/**
	 * @return the mediaId
	 */
	public int getMediaId() {
		return mediaId;
	}

	/**
	 * @return the creativityType
	 */
	public int getCreativityType() {
		return creativityType;
	}

	/**
	 * @return the addTime
	 */
	public String getAddTime() {
		return addTime;
	}

	/**
	 * @param priorityId the priorityId to set
	 */
	public void setPriorityId(int priorityId) {
		this.priorityId = priorityId;
	}

	/**
	 * @param adplanId the adplanId to set
	 */
	public void setAdplanId(int adplanId) {
		this.adplanId = adplanId;
	}

	/**
	 * @param mediaId the mediaId to set
	 */
	public void setMediaId(int mediaId) {
		this.mediaId = mediaId;
	}

	/**
	 * @param creativityType the creativityType to set
	 */
	public void setCreativityType(int creativityType) {
		this.creativityType = creativityType;
	}

	/**
	 * @param addTime the addTime to set
	 */
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}


	// Property accessors


}