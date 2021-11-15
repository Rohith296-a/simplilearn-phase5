package com.simplilearn.webservice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class User {
	
	@Id
	@GeneratedValue(generator = "increment")
	@Column(name="user_id")
	private long userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="mobile_number")
	private double mobNum;
	
	@Column(name="customer_emailId")
	private String email;
	
	
	@Column(name="Address")
	private String address;
	// @Column(name="brand_name")
	// private String name;
	 
	 @Column(name="size")
	 private long size;
	 
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
			@JoinColumn(name="brand_name")
		 private Product product;
	public User(long userId, String userName, double mobNum, String email, String address, long size) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.mobNum = mobNum;
		this.email = email;
		this.address = address;
		this.size = size;
	}
	public User() {
		super();
	}
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getMobNum() {
		return mobNum;
	}
	public void setMobNum(double mobNum) {
		this.mobNum = mobNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	
	
	
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "User [id=" + userId + ", userName=" + userName + ", mobNum=" + mobNum + ", email=" + email + ", address="
				+ address + ", size=" + size + "]";
	}
	 
	
	 

	

	

	
	
	 
	 
	
	 
	 

}
