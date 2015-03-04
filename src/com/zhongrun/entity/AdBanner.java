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
@Table(name = "Ad_banner")
public class AdBanner extends AbstractModel implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -6132117804511468562L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="adId")
	private int adId;
	@Column(name="mainMaterialId")
	private int mainMaterialId;//物料id，可以选择已经存在的物料
	@Column(name="mainImg")
	private String mainImg;//Banner图片地址。可以从物料中选择；可以独立上传
	@Column(name="mainBehavior")
	private int mainBehavior;//点击行为
	@Column(name="mainUrl")
	private String mainUrl;//网址、电话、应用下载地址、发短信目标号码
	@Column(name="rightMaterialId")
	private int rightMaterialId;
	@Column(name="rightIcon")
	private String rightIcon;//右边的小图标。
	@Column(name="righturl")
	private String righturl;//网址、电话、应用下载地址、发短信目标号码
	@Column(name="rightbehavior")
	private int rightbehavior;//点击行为
	
	@Column(name="status")
	private int status;//运行状态
	
	@Column(name="adAddTime")
	private String adAddTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdId() {
		return adId;
	}

	public void setAdId(int adId) {
		this.adId = adId;
	}

	public int getMainMaterialId() {
		return mainMaterialId;
	}

	public void setMainMaterialId(int mainMaterialId) {
		this.mainMaterialId = mainMaterialId;
	}

	public String getMainImg() {
		return mainImg;
	}

	public void setMainImg(String mainImg) {
		this.mainImg = mainImg;
	}

	public int getMainBehavior() {
		return mainBehavior;
	}

	public void setMainBehavior(int mainBehavior) {
		this.mainBehavior = mainBehavior;
	}

	public String getMainUrl() {
		return mainUrl;
	}

	public void setMainUrl(String mainUrl) {
		this.mainUrl = mainUrl;
	}

	public int getRightMaterialId() {
		return rightMaterialId;
	}

	public void setRightMaterialId(int rightMaterialId) {
		this.rightMaterialId = rightMaterialId;
	}

	public String getRightIcon() {
		return rightIcon;
	}

	public void setRightIcon(String rightIcon) {
		this.rightIcon = rightIcon;
	}

	public String getRighturl() {
		return righturl;
	}

	public void setRighturl(String righturl) {
		this.righturl = righturl;
	}

	public int getRightbehavior() {
		return rightbehavior;
	}

	public void setRightbehavior(int rightbehavior) {
		this.rightbehavior = rightbehavior;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getAdAddTime() {
		return adAddTime;
	}

	public void setAdAddTime(String adAddTime) {
		this.adAddTime = adAddTime;
	}

}