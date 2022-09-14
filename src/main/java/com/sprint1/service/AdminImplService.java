package com.sprint1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint1.dao.IAdminDAO;
import com.sprint1.entity.Admin;
import com.sprint1.exceptions.EmptyListException;
import com.sprint1.exceptions.EmptyNameException;
import com.sprint1.exceptions.NoResultFoundUsingContactNumberException;
import com.sprint1.exceptions.NoResultFoundUsingNameException;


@Service
public class AdminImplService implements IServiceAdmin {

	@Autowired
	private IAdminDAO adminDAO;
	
	
	
	@Override
	public List<Admin> getAllAdmins() {
		List<Admin> adminList = adminDAO.findAll();
		if(adminList.isEmpty())
		{
			throw new EmptyListException("602","No elements found");
		}
		return adminList;
	}

	@Override
	public Admin getAdminById(int adminId) {
		return adminDAO.findById(adminId).get();
	}

	@Override
	public Admin addAdmin(Admin admin) {
		if(admin.getAdminName().isEmpty() || admin.getAdminName().length()==0)
		{
			throw new EmptyNameException("601","Name field is empty");
		}
		adminDAO.save(admin);
		return admin;
		
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		if(admin.getAdminName().isEmpty() || admin.getAdminName().length()==0)
		{
			throw new EmptyNameException("601","Name field is empty");
		}
		adminDAO.save(admin);
		return admin;
	}

	@Override
	public void deleteAdminById(int adminId) {
		Admin admin = adminDAO.getOne(adminId);
		adminDAO.delete(admin);
	}

	
	@Override
	public List<Admin> getAdminByName(String adminName) {
		List<Admin> adminList = adminDAO.getAdminByName(adminName);
		if(adminList.isEmpty())
		{
			throw new NoResultFoundUsingNameException();
		}
		return adminList;
	}

	
	@Override
	public List<Admin> getAdminByContactNumber(long adminContactNumber) {
		List<Admin> adminList = adminDAO.getAdminByContactNumber(adminContactNumber);
		if(adminList.isEmpty())
		{
			throw new NoResultFoundUsingContactNumberException();
		}
		return adminList;
	}

}
