package com.zhongrun.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Proxy;

import com.zhongrun.common.model.AbstractModel;

@Entity
@Proxy(lazy = true)
@Table(name = "ad")
public class Ad extends AbstractModel {

	// Fields
	/*
	 * 此时主键id的增长是按照hibernate自动处理的方式，而并非数据库中定义的sequence来处理。
	 * 必须加allocationSize=1,initialValue=1这两项配置才可以解决上述问题。
	 */

	private static final long serialVersionUID = -6132117804511468562L;

	@Id
	@SequenceGenerator(name = "ADPK", allocationSize=1, initialValue=1, sequenceName = "SEQ_AD")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "ADPK")
	private Integer adId;
	@Column(name="userId")
	private Integer userId;
	@Column(name="adName")
	private String adName;
	@Column(name="aliasName")
	private String aliasName;
	@Column(name="adType")
	private Integer adType;
	@Column(name="startDate")
	private Timestamp startDate;
	@Column(name="endDate")
	private Timestamp endDate;
	@Column(name="budget")
	private Double budget;
	@Column(name="memo")
	private String memo;
	@Column(name="verifyStatus")
	private Integer verifyStatus;
	@Column(name="verifyDesc")
	private String verifyDesc;
	@Column(name="status")
	private Integer status;
	@Column(name="verifyTime")
	private Timestamp verifyTime;
	@Column(name="adminId")
	private Integer adminId;
	@Column(name="addTime")
	private Timestamp addTime;
	
	@Transient
	private String adTypeName;

	

	public Integer getAdId() {
		return adId;
	}

	public void setAdId(Integer adId) {
		this.adId = adId;
	}

	public String getAdName() {
		return adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public Integer getAdType() {
		return adType;
	}

	public void setAdType(Integer adType) {
		this.adType = adType;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Integer getVerifyStatus() {
		return verifyStatus;
	}

	public void setVerifyStatus(Integer verifyStatus) {
		this.verifyStatus = verifyStatus;
	}

	public String getVerifyDesc() {
		return verifyDesc;
	}

	public void setVerifyDesc(String verifyDesc) {
		this.verifyDesc = verifyDesc;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Timestamp getVerifyTime() {
		return verifyTime;
	}

	public void setVerifyTime(Timestamp verifyTime) {
		this.verifyTime = verifyTime;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public Timestamp getAddTime() {
		return addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	/**
	 * @return the adTypeName
	 */
	
	public String getAdTypeName() {
		return adTypeName;
	}

	/**
	 * @param adTypeName
	 *            the adTypeName to set
	 */
	public void setAdTypeName(String adTypeName) {
		this.adTypeName = adTypeName;
	}

}