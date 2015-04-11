package com.zhongrun.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Proxy;

import com.zhongrun.common.model.AbstractModel;

@Entity
@Proxy(lazy = true)
@Table(name = "ad")
public class Ad extends AbstractModel {

	// Fields

	private static final long serialVersionUID = -6132117804511468562L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="adId")
	private int adId;
	@Column(name="userID")
	private int userID;
	@Column(name="adName")
	private String adName;
	@Column(name="adType")
	private int adType;
	@Column(name="startdate")
	private Date startdate;
	@Column(name="enddate")
	private Date enddate;
	@Column(name="budget")
	private double budget;//广告总预算
	@Column(name="memo")
	private String memo;
	@Column(name="verifyStatus")
	private int verifyStatus;//审核状态
	@Column(name="verifyDesc")
	private String vrifyDesc;//审核说明
	@Column(name="status")
	private int status;//运行状态
	@Column(name="verifyTime")
	private Date verifyTime;//审核时间
	@Column(name="adminId")
	private int adminId;//审核人
	@Column(name="adAddTime")
	private String adAddTime;
	
	
	@Transient
	private String adTypeName;


	public int getAdId() {
		return adId;
	}


	public void setAdId(int adId) {
		this.adId = adId;
	}


	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}


	public String getAdName() {
		return adName;
	}


	public void setAdName(String adName) {
		this.adName = adName;
	}


	public int getAdType() {
		return adType;
	}


	public void setAdType(int adType) {
		this.adType = adType;
	}


	public Date getStartdate() {
		return startdate;
	}


	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}


	public Date getEnddate() {
		return enddate;
	}


	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}


	public double getBudget() {
		return budget;
	}


	public void setBudget(double budget) {
		this.budget = budget;
	}


	public String getMemo() {
		return memo;
	}


	public void setMemo(String memo) {
		this.memo = memo;
	}


	public int getVerifyStatus() {
		return verifyStatus;
	}


	public void setVerifyStatus(int verifyStatus) {
		this.verifyStatus = verifyStatus;
	}


	public String getVrifyDesc() {
		return vrifyDesc;
	}


	public void setVrifyDesc(String vrifyDesc) {
		this.vrifyDesc = vrifyDesc;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public Date getVerifyTime() {
		return verifyTime;
	}


	public void setVerifyTime(Date verifyTime) {
		this.verifyTime = verifyTime;
	}


	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}


	public String getAdAddTime() {
		return adAddTime;
	}


	public void setAdAddTime(String adAddTime) {
		this.adAddTime = adAddTime;
	}


	public String getAdTypeName() {
		return adTypeName;
	}


	public void setAdTypeName(String adTypeName) {
		this.adTypeName = adTypeName;
	}

	

}