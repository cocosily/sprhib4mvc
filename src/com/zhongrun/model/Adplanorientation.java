package com.zhongrun.model;

/**
 * Adplanorientation entity. @author MyEclipse Persistence Tools
 */

public class Adplanorientation implements java.io.Serializable {
	
	// Fields
	
	private static final long serialVersionUID = 4007531548133409861L;
	private int orientationId;
	private int adplanId;
	private String adTag;
	private String network;
	private String phoneModel;
	private String os;
	private String area;
	private String rdsex;
	private String rdage;
	private String addTime;
	
	// Constructors
	
	/** default constructor */
	public Adplanorientation() {}
	
	/** minimal constructor */
	public Adplanorientation(int adplanId, String addTime) {
		this.adplanId = adplanId;
		this.addTime = addTime;
	}
	
	/** full constructor */
	public Adplanorientation(int adplanId, String adTag, String network, String phoneModel, String os, String area, String rdsex, String rdage, String addTime) {
		this.adplanId = adplanId;
		this.adTag = adTag;
		this.network = network;
		this.phoneModel = phoneModel;
		this.os = os;
		this.area = area;
		this.rdsex = rdsex;
		this.rdage = rdage;
		this.addTime = addTime;
	}
	
	// Property accessors
	
	public int getOrientationId() {
		return this.orientationId;
	}
	
	public void setOrientationId(int orientationId) {
		this.orientationId = orientationId;
	}
	
	public int getAdplanId() {
		return this.adplanId;
	}
	
	public void setAdplanId(int adplanId) {
		this.adplanId = adplanId;
	}
	
	public String getAdTag() {
		return this.adTag;
	}
	
	public void setAdTag(String adTag) {
		this.adTag = adTag;
	}
	
	public String getNetwork() {
		return this.network;
	}
	
	public void setNetwork(String network) {
		this.network = network;
	}
	
	public String getPhoneModel() {
		return this.phoneModel;
	}
	
	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}
	
	public String getOs() {
		return this.os;
	}
	
	public void setOs(String os) {
		this.os = os;
	}
	
	public String getArea() {
		return this.area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public String getRdsex() {
		return this.rdsex;
	}
	
	public void setRdsex(String rdsex) {
		this.rdsex = rdsex;
	}
	
	public String getRdage() {
		return this.rdage;
	}
	
	public void setRdage(String rdage) {
		this.rdage = rdage;
	}
	
	public String getAddTime() {
		return this.addTime;
	}
	
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	
}