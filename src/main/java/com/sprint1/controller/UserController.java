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

import com.sprint1.entity.User;
import com.sprint1.service.IServiceUser;


@RestController
public class UserController {
	
	@Autowired
	IServiceUser serviceUser;
	
	@GetMapping("/user")
	public List<User> getAllUsers()
	{
		return this.serviceUser.getAllUsers();
	}
	
	
	@GetMapping("/user/{userId}")
	public User getUserById(@PathVariable int userId)
	{
		return this.serviceUser.getUserById(userId);
	}
	
	
	@GetMapping("/userByContact/{number}")
	public List<User> getUserByContactNumber(@PathVariable("number") long userContactNumber)
	{
		return this.serviceUser.getUserByContactNumber(userContactNumber);
	}
	
	
	@GetMapping("/userByName/{name}")
	public List<User> getUserByName(@PathVariable("name") String userName)
	{
		return this.serviceUser.getUserByName(userName);
	}
	
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user)
	{
		return this.serviceUser.addUser(user);
	}
	
	
	@PutMapping("/user")
	public User updateUser(@RequestBody User user)
	{
		return this.serviceUser.updateUser(user);
	}
	
	
	@DeleteMapping("/user/{userId}")
	public ResponseEntity<HttpStatus> deleteUserById(@PathVariable int userId)
	{
		try {
			this.serviceUser.deleteUserById(userId);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception ex)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
