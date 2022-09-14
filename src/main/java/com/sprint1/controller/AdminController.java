package com.sprint1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sprint1.entity.Admin;
import com.sprint1.service.IServiceAdmin;

@RestController
public class AdminController {
	
	
	@Autowired
	IServiceAdmin serviceAdmin;
	
	@GetMapping("/admin")
	public List<Admin> getAllAdmins()
	{
		return this.serviceAdmin.getAllAdmins();
	}
	
	@GetMapping("/admin/{adminId}")
	public Admin getAdminById(@PathVariable int adminId)
	{
		return this.serviceAdmin.getAdminById(adminId);
	}
	
	@GetMapping("/adminByName/{adminName}")
	public List<Admin> getAdminByName(@PathVariable("adminName") String adminName)
	{
		return this.serviceAdmin.getAdminByName(adminName);
	}
	
	@GetMapping("/adminByContactNumber/{contactNumber}")
	public List<Admin> getAdminByContactNumber(@PathVariable("contactNumber") long adminContactNumber)
	{
		return this.serviceAdmin.getAdminByContactNumber(adminContactNumber);
	}
	
	
	@PostMapping("/admin")
	public Admin addAdmin(@RequestBody Admin admin)
	{
		return this.serviceAdmin.addAdmin(admin);
	}
	
	@PutMapping("/admin")
	public Admin updateAdmin(@RequestBody Admin admin)
	{
		return this.serviceAdmin.updateAdmin(admin);
	}
	
	@DeleteMapping("/admin/{adminId}")
	public ResponseEntity<HttpStatus> deleteAdminById(@PathVariable int adminId)
	{
		try {
			this.serviceAdmin.deleteAdminById(adminId);
			return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
		} catch (Exception ex)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}	
	
	
	

}
