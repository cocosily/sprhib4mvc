package com.zhongrun.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import com.zhongrun.common.model.AbstractModel;

@Entity
@Proxy(lazy = true)
@Table(name = "tb_adtask")
public class AdTask extends AbstractModel implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -6132117804511468562L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer adtaskId;
	@Column(name="adId")
	private Integer adId;
	@Column(name="area")
	private String area;
	@Column(name="effectivetime")
	private String effectivetime;
	
	@Column(name="publicweek")
	private String publicweek;
	@Column(name="userGrade")
	private Integer userGrade;
	@Column(name="tasktype")
	private Integer tasktype;
	@Column(name="rewarddescription")
	private String rewarddescription;
	@Column(name="adAddTime")
	private String adAddTime;
	public Integer getAdtaskId() {
		return adtaskId;
	}
	public void setAdtaskId(Integer adtaskId) {
		this.adtaskId = adtaskId;
	}
	public Integer getAdId() {
		return adId;
	}
	public void setAdId(Integer adId) {
		this.adId = adId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getEffectivetime() {
		return effectivetime;
	}
	public void setEffectivetime(String effectivetime) {
		this.effectivetime = effectivetime;
	}
	public String getPublicweek() {
		return publicweek;
	}
	public void setPublicweek(String publicweek) {
		this.publicweek = publicweek;
	}
	public Integer getUserGrade() {
		return userGrade;
	}
	public void setUserGrade(Integer userGrade) {
		this.userGrade = userGrade;
	}
	public Integer getTasktype() {
		return tasktype;
	}
	public void setTasktype(Integer tasktype) {
		this.tasktype = tasktype;
	}
	public String getRewarddescription() {
		return rewarddescription;
	}
	public void setRewarddescription(String rewarddescription) {
		this.rewarddescription = rewarddescription;
	}
	public String getAdAddTime() {
		return adAddTime;
	}
	public void setAdAddTime(String adAddTime) {
		this.adAddTime = adAddTime;
	}
	

}