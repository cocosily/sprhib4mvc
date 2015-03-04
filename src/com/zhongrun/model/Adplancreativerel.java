package com.zhongrun.model;

/**
 * Adplancreativerel entity. @author MyEclipse Persistence Tools
 */

public class Adplancreativerel implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -4525317513679968223L;
	private int relationId;
	private int adCreativeId;
	private int adplanId;

	// Constructors

	/** default constructor */
	public Adplancreativerel() {
	}

	/** full constructor */
	public Adplancreativerel(int adCreativeId, int adplanId) {
		this.adCreativeId = adCreativeId;
		this.adplanId = adplanId;
	}

	// Property accessors

	public int getRelationId() {
		return this.relationId;
	}

	public void setRelationId(int relationId) {
		this.relationId = relationId;
	}

	public int getAdCreativeId() {
		return this.adCreativeId;
	}

	public void setAdCreativeId(int adCreativeId) {
		this.adCreativeId = adCreativeId;
	}

	public int getAdplanId() {
		return this.adplanId;
	}

	public void setAdplanId(int adplanId) {
		this.adplanId = adplanId;
	}

}