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
@Table(name = "Ad_ Material")
public class AdMaterial extends AbstractModel implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -6132117804511468562L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="adId")
	private int adId;
	@Column(name="materialType")
	private int materialType;//物料类型 1 icon 2 图片 3 视频
	@Column(name="mname")
	private String mname;//物料名称
	@Column(name="resolution")
	private String resolution;//分辨率
	@Column(name="filename")
	private Date filename;//物料存储的全路径
	@Column(name="format")
	private String format;//文件格式
	@Column(name="size")
	private double size;//文件大小
	
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

	public int getMaterialType() {
		return materialType;
	}

	public void setMaterialType(int materialType) {
		this.materialType = materialType;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public Date getFilename() {
		return filename;
	}

	public void setFilename(Date filename) {
		this.filename = filename;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
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