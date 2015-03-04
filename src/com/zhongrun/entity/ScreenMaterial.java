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
public class ScreenMaterial extends AbstractModel implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -6132117804511468562L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="adId")
	private int adId;
	@Column(name="name")
	private String name;//视频名称
	@Column(name="format")
	private int format;//视频格式
	@Column(name="size")
	private int size;//视频的大小
	@Column(name="MaterialId")
	private int MaterialId;//物料ID
	@Column(name="Vediourl")
	private String Vediourl;//
	@Column(name="behavior")
	private int behavior;//右边的小图标。
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFormat() {
		return format;
	}

	public void setFormat(int format) {
		this.format = format;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getMaterialId() {
		return MaterialId;
	}

	public void setMaterialId(int materialId) {
		MaterialId = materialId;
	}

	public String getVediourl() {
		return Vediourl;
	}

	public void setVediourl(String vediourl) {
		Vediourl = vediourl;
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