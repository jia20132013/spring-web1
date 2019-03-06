package com.jia.spring.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Id;


@Data
@ToString(includeFieldNames=true)
@Entity
@Table(name = "USER_ROLE_MAP")
public class UserRole {
	
	@Id
	@Column(name = "USER_ROLE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userRoleId;
	@Column(name = "ROLE_ID")
	private long roleId;
	@Column(name = "USER_ID")
	private String userId;
	@Column(name = "PROXY_USER_ID")
	private String proxyUserId;
	@Column(name = "CREATED_DT")
	private Date createDt;
	@Column(name = "CREATED_BY")
	private String createdBy;
	@Column(name = "UPDATED_BY")
	private String updatedBy;
	@Column(name = "UPDATED_DT")
	private Date updatedDt;
	private String status;
	private int region;
	private int theater;
	
	
	
//	public long getUserRoleId() {
//		return userRoleId;
//	}
//	public void setUserRoleId(long userRoleId) {
//		this.userRoleId = userRoleId;
//	}
//	public long getRoleId() {
//		return roleId;
//	}
//	public void setRoleId(long roleId) {
//		this.roleId = roleId;
//	}
//	public String getUserId() {
//		return userId;
//	}
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//	public String getProxyUserId() {
//		return proxyUserId;
//	}
//	public void setProxyUserId(String proxyUserId) {
//		this.proxyUserId = proxyUserId;
//	}
//	public Date getCreateDt() {
//		return createDt;
//	}
//	public void setCreateDt(Date createDt) {
//		this.createDt = createDt;
//	}
//	public String getCreatedBy() {
//		return createdBy;
//	}
//	public void setCreatedBy(String createdBy) {
//		this.createdBy = createdBy;
//	}
//	public String getUpdatedBy() {
//		return updatedBy;
//	}
//	public void setUpdatedBy(String updatedBy) {
//		this.updatedBy = updatedBy;
//	}
//	public Date getUpdatedDt() {
//		return updatedDt;
//	}
//	public void setUpdatedDt(Date updatedDt) {
//		this.updatedDt = updatedDt;
//	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
//	public int getRegion() {
//		return region;
//	}
//	public void setNumber(int region) {
//		this.region = region;
//	}
//	public int getTheater() {
//		return theater;
//	}
//	public void setTheater(int theater) {
//		this.theater = theater;
//	}
//	
//	

}
