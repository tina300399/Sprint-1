package com.sprint1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint1.dao.IUserDAO;
import com.sprint1.entity.User;
import com.sprint1.exceptions.EmptyListException;
import com.sprint1.exceptions.EmptyNameException;
import com.sprint1.exceptions.NoResultFoundUsingContactNumberException;
import com.sprint1.exceptions.NoResultFoundUsingNameException;



@Service
public class UserImplService implements IServiceUser {

	@Autowired
	IUserDAO userDAO;
	
	
	@Override
	public List<User> getAllUsers() {
		List<User> userList = userDAO.findAll();
		if(userList.isEmpty())
		{
			throw new EmptyListException("602", "No elements found");
		}
		return userList;
	}

	@Override
	public User getUserById(int userId) {
		return userDAO.findById(userId).get();
	}

	@Override
	public User addUser(User user) {
		if(user.getUserName().isEmpty() || user.getUserName().length()==0)
		{
			throw new EmptyNameException();
		}
		userDAO.save(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		if(user.getUserName().isEmpty() || user.getUserName().length()==0)
		{
			throw new EmptyNameException();
		}
		userDAO.save(user);
		return user;
	}

	@Override
	public void deleteUserById(int userId) {
		User user = userDAO.getOne(userId);
		userDAO.delete(user);
		
	}

	@Override
	public List<User> getUserByContactNumber(long userContactNumber) {
		List<User> userList = userDAO.getUserByContactNumber(userContactNumber);
		if(userList.isEmpty())
		{
			throw new NoResultFoundUsingContactNumberException();
		}
		return userList;
	}

	@Override
	public List<User> getUserByName(String userName) {
		List<User> userList = userDAO.getUserByName(userName);
		if(userList.isEmpty())
		{
			throw new NoResultFoundUsingNameException();
		}
		return userList;
	}
	
	

}