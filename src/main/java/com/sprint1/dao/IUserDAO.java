package com.sprint1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sprint1.entity.Admin;
import com.sprint1.entity.User;



@Repository
public interface IUserDAO extends JpaRepository<User, Integer> {

	
	@Query("SELECT u from User u where u.userContactNumber=:contact")
	List<User> getUserByContactNumber(@Param("contact") long userContactNumber);
	
	@Query("SELECT u from User u where u.userName=:name")
	List<User> getUserByName(@Param("name") String name);
}
