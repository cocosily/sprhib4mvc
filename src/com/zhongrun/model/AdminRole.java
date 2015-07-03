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
 * AdminRole entity. @author MyEclipse Persistence Tools
 */
@Entity
@Proxy(lazy = true)
@Table(name = "SYSTEM_ADMIN_ROLE")
public class AdminRole implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -3888157375319743782L;
	@Id
	@SequenceGenerator(name = "SYSTEM_ADMIN_ROLEPK", allocationSize=1, initialValue=1, sequenceName = "SEQ_SYSTEM_ADMIN_ROLE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "SYSTEM_ADMIN_ROLEPK")
	private Integer id;
	@Column(name="adminId")
	private Integer adminId;
	@Column(name="roleId")
	private Integer roleId;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the userId
	 */
	public Integer getAdminId() {
		return adminId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	/**
	 * @return the roleId
	 */
	public Integer getRoleId() {
		return roleId;
	}
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}


}