package com.zhongrun.model;


/**
 * Adplancycle entity. @author MyEclipse Persistence Tools
 */

public class Adplancycle implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 8488648991407625834L;
	private int cycleId;
	private int adplanId;
	private String beginTime;
	private String endTime;
	private String dateString;
	private Double money;
	private int discount;
	private int dayclick;
	private int hourclick;
	private int frequency;
	private String addTime;

	// Constructors

	/** default constructor */
	public Adplancycle() {
	}

	/** minimal constructor */
	public Adplancycle(int adplanId, String beginTime, String endTime) {
		this.adplanId = adplanId;
		this.beginTime = beginTime;
		this.endTime = endTime;
	}

	/** full constructor */
	public Adplancycle(int adplanId, String beginTime,
			String endTime, String dateString, Double money,
			int discount, int dayclick, int hourclick,
			int frequency, String addTime) {
		this.adplanId = adplanId;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.dateString = dateString;
		this.money = money;
		this.discount = discount;
		this.dayclick = dayclick;
		this.hourclick = hourclick;
		this.frequency = frequency;
		this.addTime = addTime;
	}

	// Property accessors

	public int getCycleId() {
		return this.cycleId;
	}

	public void setCycleId(int cycleId) {
		this.cycleId = cycleId;
	}

	public int getAdplanId() {
		return this.adplanId;
	}

	public void setAdplanId(int adplanId) {
		this.adplanId = adplanId;
	}

	public String getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getDateString() {
		return this.dateString;
	}

	public void setDateString(String dateString) {
		this.dateString = dateString;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public int getDiscount() {
		return this.discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getDayclick() {
		return this.dayclick;
	}

	public void setDayclick(int dayclick) {
		this.dayclick = dayclick;
	}

	public int getHourclick() {
		return this.hourclick;
	}

	public void setHourclick(int hourclick) {
		this.hourclick = hourclick;
	}

	public int getFrequency() {
		return this.frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public String getAddTime() {
		return this.addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

}