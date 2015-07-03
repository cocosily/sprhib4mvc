package com.zhongrun.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

/**
 * RoleResource entity. @author MyEclipse Persistence Tools
 */

@Entity
@Proxy(lazy = true)
@Table(name = "SYSTEM_ROLE_RESOURCE")
public class RoleResource implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 7355163072233850382L;
	@Id
	@SequenceGenerator(name = "SYSTEM_ROLE_RESOURCEPK", allocationSize=1, initialValue=1, sequenceName = "SEQ_SYSTEM_ROLE_RESOURCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "SYSTEM_ROLE_RESOURCEPK")
	private Integer id;
	@Column(name="resourceid")
	private Integer resourceid;
	@Column(name="roleid")
	private Integer roleid;
	@Column(name="modifyStr")
	private String modifyStr;
	@Column(name="ad")
	private String ad;
	@Column(name="del")
	private String del;

	// Constructors

	/** default constructor */
	public RoleResource() {
	}

	/** full constructor */
	public RoleResource(Integer resourceid, Integer roleid, String modifyStr,
			String ad, String del) {
		this.resourceid = resourceid;
		this.roleid = roleid;
		this.modifyStr = modifyStr;
		this.ad = ad;
		this.del = del;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getResourceid() {
		return this.resourceid;
	}

	public void setResourceid(Integer resourceid) {
		this.resourceid = resourceid;
	}

	public Integer getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getModifyStr() {
		return this.modifyStr;
	}

	public void setModifyStr(String modifyStr) {
		this.modifyStr = modifyStr;
	}

	public String getAd() {
		return this.ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getDel() {
		return this.del;
	}

	public void setDel(String del) {
		this.del = del;
	}

}