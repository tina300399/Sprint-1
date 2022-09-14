package com.sprint1.service;

import java.util.List;

import com.sprint1.entity.Admin;


public interface IServiceAdmin {
	public List<Admin> getAllAdmins();
	public Admin getAdminById(int adminId);
	public Admin addAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public void deleteAdminById(int adminId);
	public List<Admin> getAdminByName(String adminName);
	public List<Admin> getAdminByContactNumber(long adminContactNumber);

}