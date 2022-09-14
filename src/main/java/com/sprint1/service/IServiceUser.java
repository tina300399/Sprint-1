package com.sprint1.service;

import java.util.List;

import com.sprint1.entity.User;


public interface IServiceUser {
	
	public List<User> getAllUsers();
	public User getUserById(int userId);
	public User addUser(User user);
	public User updateUser(User user);
	public void deleteUserById(int userId);
	public List<User> getUserByContactNumber(long userContactNumber);
	public List<User> getUserByName(String userName);

}
