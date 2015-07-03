package com.zhongrun.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Proxy;

/**
 * Resource entity. @author MyEclipse Persistence Tools
 */

@Entity
@Proxy(lazy = true)
@Table(name = "SYSTEM_RESOURCE")
public class Resource implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1125667513769033971L;
	@Id
	@SequenceGenerator(name = "RESOURCEPK", allocationSize=1, initialValue=1, sequenceName = "SEQ_SYSTEM_RESOURCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "RESOURCEPK")
	private Integer resourceId;
	@Column(name="resname")
	private String resname;
	@Column(name="resurl")
	private String resurl;
	@Column(name="resmodual")
	private String resmodual;
	@Column(name="restype")
	private Integer restype;
	@Column(name="respid")
	private Integer respid;
	@Column(name="displayorder")
	private Integer displayorder;
	@Transient
	private List<Resource> childResources;//子菜单集合

	// Constructors

	/** default constructor */
	public Resource() {
	}

	/** full constructor */
	public Resource(String resname, String resurl, String resmodual,
			Integer restype, Integer respid, Integer displayorder) {
		this.resname = resname;
		this.resurl = resurl;
		this.resmodual = resmodual;
		this.restype = restype;
		this.respid = respid;
		this.displayorder = displayorder;
	}

	// Property accessors

	public Integer getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	public String getResname() {
		return this.resname;
	}

	public void setResname(String resname) {
		this.resname = resname;
	}

	public String getResurl() {
		return this.resurl;
	}

	public void setResurl(String resurl) {
		this.resurl = resurl;
	}

	public String getResmodual() {
		return this.resmodual;
	}

	public void setResmodual(String resmodual) {
		this.resmodual = resmodual;
	}

	public Integer getRestype() {
		return this.restype;
	}

	public void setRestype(Integer restype) {
		this.restype = restype;
	}

	public Integer getRespid() {
		return this.respid;
	}

	public void setRespid(Integer respid) {
		this.respid = respid;
	}

	public Integer getDisplayorder() {
		return this.displayorder;
	}

	public void setDisplayorder(Integer displayorder) {
		this.displayorder = displayorder;
	}

	public List<Resource> getChildResources() {
		return childResources;
	}

	public void setChildResources(List<Resource> childResources) {
		this.childResources = childResources;
	}

}