package com.zhongrun.model;

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
@Table(name = "ad")
public class Ad extends AbstractModel implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -6132117804511468562L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="adTypeId")
	private int adTypeId;
	@Column(name="adName")
	private String adName;
	@Column(name="adImage")
	private String adImage;
	@Column(name="actionType")
	private int actionType;
	@Column(name="actionUri")
	private String actionUri;
	@Column(name="adPriority")
	private int adPriority;
	@Column(name="updateTime")
	private String updateTime;
	@Column(name="adState")
	private int adState;
	@Column(name="adAddTime")
	private String adAddTime;
	@Transient
	private String adTypeName;

	/**
	 * @return the id
	 */
	
	public int getId() {
		return id;
	}

	/**
	 * @return the adTypeId
	 */
	public int getAdTypeId() {
		return adTypeId;
	}

	/**
	 * @return the adName
	 */
	public String getAdName() {
		return adName;
	}

	/**
	 * @return the adImage
	 */
	public String getAdImage() {
		return adImage;
	}

	/**
	 * @return the actionType
	 */
	public int getActionType() {
		return actionType;
	}

	/**
	 * @return the actionUri
	 */
	public String getActionUri() {
		return actionUri;
	}

	/**
	 * @return the adPriority
	 */
	public int getAdPriority() {
		return adPriority;
	}

	/**
	 * @return the updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}

	/**
	 * @return the adState
	 */
	public int getAdState() {
		return adState;
	}

	/**
	 * @return the adAddTime
	 */
	public String getAdAddTime() {
		return adAddTime;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param adTypeId
	 *            the adTypeId to set
	 */
	public void setAdTypeId(int adTypeId) {
		this.adTypeId = adTypeId;
	}

	/**
	 * @param adName
	 *            the adName to set
	 */
	public void setAdName(String adName) {
		this.adName = adName;
	}

	/**
	 * @param adImage
	 *            the adImage to set
	 */
	public void setAdImage(String adImage) {
		this.adImage = adImage;
	}

	/**
	 * @param actionType
	 *            the actionType to set
	 */
	public void setActionType(int actionType) {
		this.actionType = actionType;
	}

	/**
	 * @param actionUri
	 *            the actionUri to set
	 */
	public void setActionUri(String actionUri) {
		this.actionUri = actionUri;
	}

	/**
	 * @param adPriority
	 *            the adPriority to set
	 */
	public void setAdPriority(int adPriority) {
		this.adPriority = adPriority;
	}

	/**
	 * @param updateTime
	 *            the updateTime to set
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @param adState
	 *            the adState to set
	 */
	public void setAdState(int adState) {
		this.adState = adState;
	}

	/**
	 * @param adAddTime
	 *            the adAddTime to set
	 */
	public void setAdAddTime(String adAddTime) {
		this.adAddTime = adAddTime;
	}

	/**
	 * @return the adTypeName
	 */
	
	public String getAdTypeName() {
		return adTypeName;
	}

	/**
	 * @param adTypeName
	 *            the adTypeName to set
	 */
	public void setAdTypeName(String adTypeName) {
		this.adTypeName = adTypeName;
	}

}