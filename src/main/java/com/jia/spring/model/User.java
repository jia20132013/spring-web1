package com.jia.spring.model;

import java.sql.Date;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(includeFieldNames=true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER")
public class User {
	
	@Id
	@Column(name = "USER_ID")
	private String userId;
	private long Id;
	private String active;
	@Column(name = "CEC_ID")
	private String cecId;
	@Column(name = "CREATED_DT")
	private Date createdDt;
	@Column(name = "CREATED_BY")
	private String createdBy;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	private int region;
	private int theater;
	@Column(name = "UPDATED_BY")
	private String updatedBy;
	@Column(name = "UPDATED_DT")
	private Date updatedDt;
	
	

//	public String getUserId() {
//		return userId;
//	}
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//
//	public String getActive() {
//		return active;
//	}
//
//	public void setActive(String active) {
//		this.active = active;
//	}
//
//	public String getCecId() {
//		return cecId;
//	}
//
//	public void setCecId(String cecId) {
//		this.cecId = cecId;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public long getRegion() {
//		return region;
//	}
//
//	public void setNumber(int region) {
//		this.region = region;
//	}
//
//	public long getTheater() {
//		return theater;
//	}
//
//	public void setTheater(int theater) {
//		this.theater = theater;
//	}
//
//	public Date getCreatedDt() {
//		return createdDt;
//	}
//
//	public void setCreatedDt(Date createdDt) {
//		this.createdDt = createdDt;
//	}
//
//	public String getCreatedBy() {
//		return createdBy;
//	}
//
//	public void setCreatedBy(String createdBy) {
//		this.createdBy = createdBy;
//	}
//
//	public String getUpdatedBy() {
//		return updatedBy;
//	}
//
//	public void setUpdatedBy(String updatedBy) {
//		this.updatedBy = updatedBy;
//	}
//
//	public Date getUpdatedDt() {
//		return updatedDt;
//	}
//
//	public void setUpdatedDt(Date updatedDt) {
//		this.updatedDt = updatedDt;
//	}
//
//	public long getId() {
//		return Id;
//	}
//
//	public void setId(long id) {
//		Id = id;
//	}
//
//	public User(String userId, long id, String active, String cecId, Date createdDt, String createdBy, String firstName,
//			String lastName, int region, int theater, String updatedBy, Date updatedDt) {
//		super();
//		this.userId = userId;
//		this.Id = id;
//		this.active = active;
//		this.cecId = cecId;
//		this.createdDt = createdDt;
//		this.createdBy = createdBy;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.region = region;
//		this.theater = theater;
//		this.updatedBy = updatedBy;
//		this.updatedDt = updatedDt;
//	}
//	
//	public User() { }
		
	

}
