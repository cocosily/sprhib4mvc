package com.zhongrun.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

/**
 * Adcreativematerial entity. @author MyEclipse Persistence Tools
 */
@Entity
@Proxy(lazy = true)
@Table(name="adcreativematerial")
public class Adcreativematerial implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -3519681577662466859L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int materialId;
	@Column(name="adCreativeId")
	private int adCreativeId;
	@Column(name="materialType")
	private int materialType;
	@Column(name="prefixImg")
	private String prefixImg;
	@Column(name="middleFirstFont")
	private String middleFirstFont;
	@Column(name="middleFirstDescribe")
	private String middleFirstDescribe;
	@Column(name="middleSecondFont")
	private String middleSecondFont;
	@Column(name="middleSecondDescribe")
	private String middleSecondDescribe;
	@Column(name="middleThirdFont")
	private String middleThirdFont;
	@Column(name="middleThirdDescribe")
	private String middleThirdDescribe;
	@Column(name="clickBehavior")
	private int clickBehavior;
	@Column(name="targetUrl")
	private String targetUrl;
	@Column(name="verticalImg")
	private String verticalImg;
	@Column(name="crosswiseImg")
	private String crosswiseImg;
	@Column(name="downLoadMode")
	private int downLoadMode;
	@Column(name="appName")
	private String appName;
	@Column(name="appType")
	private String appType;
	@Column(name="appSize")
	private Double appSize;
	@Column(name="appIcon")
	private String appIcon;
	@Column(name="appRemarks")
	private String appRemarks;
	@Column(name="appVersion")
	private String appVersion;
	@Column(name="updateTime")
	private String updateTime;
	@Column(name="isCharge")
	private int isCharge;
	@Column(name="appSystem")
	private int appSystem;
	@Column(name="materialStatus")
	private int materialStatus;
	@Column(name="addTime")
	private String addTime;


	// Property accessors

	public int getMaterialId() {
		return this.materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	public int getAdCreativeId() {
		return this.adCreativeId;
	}

	public void setAdCreativeId(int adCreativeId) {
		this.adCreativeId = adCreativeId;
	}


	/**
	 * @return the materialType
	 */
	public int getMaterialType() {
		return materialType;
	}

	/**
	 * @param materialType the materialType to set
	 */
	public void setMaterialType(int materialType) {
		this.materialType = materialType;
	}

	public String getPrefixImg() {
		return this.prefixImg;
	}

	public void setPrefixImg(String prefixImg) {
		this.prefixImg = prefixImg;
	}


	/**
	 * @return the middleFirstFont
	 */
	public String getMiddleFirstFont() {
		return middleFirstFont;
	}

	/**
	 * @return the middleFirstDescribe
	 */
	public String getMiddleFirstDescribe() {
		return middleFirstDescribe;
	}

	/**
	 * @return the middleSecondFont
	 */
	public String getMiddleSecondFont() {
		return middleSecondFont;
	}

	/**
	 * @return the middleSecondDescribe
	 */
	public String getMiddleSecondDescribe() {
		return middleSecondDescribe;
	}

	/**
	 * @return the middleThirdFont
	 */
	public String getMiddleThirdFont() {
		return middleThirdFont;
	}

	/**
	 * @return the middleThirdDescribe
	 */
	public String getMiddleThirdDescribe() {
		return middleThirdDescribe;
	}

	/**
	 * @param middleFirstFont the middleFirstFont to set
	 */
	public void setMiddleFirstFont(String middleFirstFont) {
		this.middleFirstFont = middleFirstFont;
	}

	/**
	 * @param middleFirstDescribe the middleFirstDescribe to set
	 */
	public void setMiddleFirstDescribe(String middleFirstDescribe) {
		this.middleFirstDescribe = middleFirstDescribe;
	}

	/**
	 * @param middleSecondFont the middleSecondFont to set
	 */
	public void setMiddleSecondFont(String middleSecondFont) {
		this.middleSecondFont = middleSecondFont;
	}

	/**
	 * @param middleSecondDescribe the middleSecondDescribe to set
	 */
	public void setMiddleSecondDescribe(String middleSecondDescribe) {
		this.middleSecondDescribe = middleSecondDescribe;
	}

	/**
	 * @param middleThirdFont the middleThirdFont to set
	 */
	public void setMiddleThirdFont(String middleThirdFont) {
		this.middleThirdFont = middleThirdFont;
	}

	/**
	 * @param middleThirdDescribe the middleThirdDescribe to set
	 */
	public void setMiddleThirdDescribe(String middleThirdDescribe) {
		this.middleThirdDescribe = middleThirdDescribe;
	}

	public int getClickBehavior() {
		return this.clickBehavior;
	}

	public void setClickBehavior(int clickBehavior) {
		this.clickBehavior = clickBehavior;
	}

	public String getTargetUrl() {
		return this.targetUrl;
	}

	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public String getVerticalImg() {
		return this.verticalImg;
	}

	public void setVerticalImg(String verticalImg) {
		this.verticalImg = verticalImg;
	}

	public String getCrosswiseImg() {
		return this.crosswiseImg;
	}

	public void setCrosswiseImg(String crosswiseImg) {
		this.crosswiseImg = crosswiseImg;
	}

	public int getDownLoadMode() {
		return this.downLoadMode;
	}

	public void setDownLoadMode(int downLoadMode) {
		this.downLoadMode = downLoadMode;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppType() {
		return this.appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
	}

	public Double getAppSize() {
		return this.appSize;
	}

	public void setAppSize(Double appSize) {
		this.appSize = appSize;
	}

	public String getAppIcon() {
		return this.appIcon;
	}

	public void setAppIcon(String appIcon) {
		this.appIcon = appIcon;
	}

	public String getAppRemarks() {
		return this.appRemarks;
	}

	public void setAppRemarks(String appRemarks) {
		this.appRemarks = appRemarks;
	}

	public String getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public int getIsCharge() {
		return this.isCharge;
	}

	public void setIsCharge(int isCharge) {
		this.isCharge = isCharge;
	}

	public int getAppSystem() {
		return this.appSystem;
	}

	public void setAppSystem(int appSystem) {
		this.appSystem = appSystem;
	}

	public int getMaterialStatus() {
		return this.materialStatus;
	}

	public void setMaterialStatus(int materialStatus) {
		this.materialStatus = materialStatus;
	}

	public String getAddTime() {
		return this.addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

}