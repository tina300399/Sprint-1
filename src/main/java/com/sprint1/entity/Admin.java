package com.sprint1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="admin_id")
	private int adminId;
	
	@Column(name="admin_name")
	private String adminName;
	
	@Column(name="admin_email")
	private String adminEmail;
	
	@Column(name="admin_contact_number")
	private long adminContactNumber;
	public Admin() {
		super();
	
	}
	public Admin(int adminId, String adminName, String adminEmail, long adminContactNumber) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminContactNumber = adminContactNumber;
	}
	
	
	public int getAdminId() {
		return adminId;
	}
	@Column(name="admin_id")
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	
	
	public String getAdminName() {
		return adminName;
	}
	@Column(name="admin_name")
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	
	public String getAdminEmail() {
		return adminEmail;
	}
	@Column(name="admin_email")
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	
	
	public long getAdminContactNumber() {
		return adminContactNumber;
	}
	@Column(name="admin_contact_number")
	public void setAdminContactNumber(long adminContactNumber) {
		this.adminContactNumber = adminContactNumber;
	}
	
	
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminEmail=" + adminEmail
				+ ", adminContactNumber=" + adminContactNumber + "]";
	}
}