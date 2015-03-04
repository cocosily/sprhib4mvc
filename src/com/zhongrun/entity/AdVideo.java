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
@Table(name = "Ad_video")
public class AdVideo extends AbstractModel implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -6132117804511468562L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="adId")
	private int adId;
	@Column(name="type")
	private String type;//视频名称
	@Column(name="screen_Material_Material")
	private int screen_Material_Material;//竖屏物料ID
	@Column(name="verticalImg")
	private String verticalImg;//竖屏图片地址
	@Column(name="HMaterialID")
	private int HMaterialID;//横屏物料ID
	@Column(name="horizontalImg")
	private String horizontalImg;//横屏图片地址
	@Column(name="behavior")
	private int behavior;//点击行为
	@Column(name="Targeturl")
	private String Targeturl;//网址、电话、应用下载地址、发短信目标号码
	
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
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getScreen_Material_Material() {
		return screen_Material_Material;
	}

	public void setScreen_Material_Material(int screen_Material_Material) {
		this.screen_Material_Material = screen_Material_Material;
	}

	public String getVerticalImg() {
		return verticalImg;
	}

	public void setVerticalImg(String verticalImg) {
		this.verticalImg = verticalImg;
	}

	public int getHMaterialID() {
		return HMaterialID;
	}

	public void setHMaterialID(int hMaterialID) {
		HMaterialID = hMaterialID;
	}

	public String getHorizontalImg() {
		return horizontalImg;
	}

	public void setHorizontalImg(String horizontalImg) {
		this.horizontalImg = horizontalImg;
	}

	public int getBehavior() {
		return behavior;
	}

	public void setBehavior(int behavior) {
		this.behavior = behavior;
	}

	public String getTargeturl() {
		return Targeturl;
	}

	public void setTargeturl(String targeturl) {
		Targeturl = targeturl;
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