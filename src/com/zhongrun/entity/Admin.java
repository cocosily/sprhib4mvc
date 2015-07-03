package com.zhongrun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

@Entity
@Proxy(lazy = true)
@Table(name = "system_admin")
public class Admin implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1018965531319988582L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="adminId")
	private Integer adminId;
	@Column(name="adminName")
	private String adminName;
	@Column(name="password")
	private String password;
	@Column(name="realName")
	private String realName;
	@Column(name="dept")
	private String dept;
	@Column(name="title")
	private String title;
	@Column(name="tel")
	private String tel;
	@Column(name="lastLogTime")
	private String lastLogTime;
	@Column(name="lastIp")
	private String lastIp;
	@Column(name="state")
	private Integer state;
	@Column(name="sid")
	private Integer sid;
	
	private boolean isAdmin;
	private boolean isBusiness;
	private boolean isMedium;
	private boolean isBoss;
	private boolean isOperate;
	private boolean isExamineOperate;
	private boolean isExamineBoss;
	
	private boolean isUniqueBusiness;
	private boolean isUniqueMedium;
	
	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** minimal constructor */
	public Admin(String adminName, String password) {
		this.adminName = adminName;
		this.password = password;
	}

	/** full constructor */
	public Admin(String adminName, String password, String realName,
			String dept, String title, String tel, String lastLogTime,
			String lastIp, Integer state, Integer sid) {
		this.adminName = adminName;
		this.password = password;
		this.realName = realName;
		this.dept = dept;
		this.title = title;
		this.tel = tel;
		this.lastLogTime = lastLogTime;
		this.lastIp = lastIp;
		this.state = state;
		this.sid = sid;
	}

	// Property accessors

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getDept() {
		return this.dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getLastLogTime() {
		return this.lastLogTime;
	}

	public void setLastLogTime(String lastLogTime) {
		this.lastLogTime = lastLogTime;
	}

	public String getLastIp() {
		return this.lastIp;
	}

	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	/**
	 * @return the isAdmin
	 */
	public boolean isAdmin() {
		return isAdmin;
	}

	/**
	 * @param isAdmin the isAdmin to set
	 */
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	/**
	 * @return the isBusiness
	 */
	public boolean isBusiness() {
		return isBusiness;
	}

	/**
	 * @param isBusiness the isBusiness to set
	 */
	public void setBusiness(boolean isBusiness) {
		this.isBusiness = isBusiness;
	}

	/**
	 * @return the isMedium
	 */
	public boolean isMedium() {
		return isMedium;
	}

	/**
	 * @param isMedium the isMedium to set
	 */
	public void setMedium(boolean isMedium) {
		this.isMedium = isMedium;
	}

	/**
	 * @return the isBoss
	 */
	public boolean isBoss() {
		return isBoss;
	}

	/**
	 * @param isBoss the isBoss to set
	 */
	public void setBoss(boolean isBoss) {
		this.isBoss = isBoss;
	}

	/**
	 * @return the isOperate
	 */
	public boolean isOperate() {
		return isOperate;
	}

	/**
	 * @param isOperate the isOperate to set
	 */
	public void setOperate(boolean isOperate) {
		this.isOperate = isOperate;
	}

	/**
	 * @return the isExamineOperate
	 */
	public boolean isExamineOperate() {
		return isExamineOperate;
	}

	/**
	 * @param isExamineOperate the isExamineOperate to set
	 */
	public void setExamineOperate(boolean isExamineOperate) {
		this.isExamineOperate = isExamineOperate;
	}

	/**
	 * @return the isExamineBoss
	 */
	public boolean isExamineBoss() {
		return isExamineBoss;
	}

	/**
	 * @param isExamineBoss the isExamineBoss to set
	 */
	public void setExamineBoss(boolean isExamineBoss) {
		this.isExamineBoss = isExamineBoss;
	}

	/**
	 * 只为商务权限，无其他权限
	 * @return 
	 * true-只有商务权限
	 * false-还有其他权限
	 */
	public boolean isUniqueBusiness() {
		return isUniqueBusiness;
	}

	/**
	 * 只为媒介权限，无其他权限
	 * @return
	 * true-只有媒介权限
	 * false-还有其他权限
	 */
	public boolean isUniqueMedium() {
		return isUniqueMedium;
	}

	/**
	 * @param isUniqueBusiness the isUniqueBusiness to set
	 */
	public void setUniqueBusiness(boolean isUniqueBusiness) {
		this.isUniqueBusiness = isUniqueBusiness;
	}

	/**
	 * @param isUniqueMedium the isUniqueMedium to set
	 */
	public void setUniqueMedium(boolean isUniqueMedium) {
		this.isUniqueMedium = isUniqueMedium;
	}

}