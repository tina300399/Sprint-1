package com.sprint1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usersprint1")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private int userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_address")
	private String userAddress;
	
	@Column(name="user_email")
	private String userEmail;
	
	@Column(name="user_contact_number")
	private long userContactNumber;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userName, String userAddress, String userEmail, long userContactNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userEmail = userEmail;
		this.userContactNumber = userContactNumber;
	}
	
	public int getUserId() {
		return userId;
	}
	@Column(name="user_id")
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	public String getUserName() {
		return userName;
	}
	@Column(name="user_name")
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public String getUserAddress() {
		return userAddress;
	}
	@Column(name="user_address")
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserEmail() {
		return userEmail;
	}
	
	@Column(name="user_email")
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	public long getUserContactNumber() {
		return userContactNumber;
	}
	@Column(name="user_contact_number")
	public void setUserContactNumber(long userContactNumber) {
		this.userContactNumber = userContactNumber;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", userEmail="
				+ userEmail + ", userContactNumber=" + userContactNumber + "]";
	}
}