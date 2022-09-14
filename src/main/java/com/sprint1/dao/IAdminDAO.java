package com.sprint1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sprint1.entity.Admin;


@Repository
public interface IAdminDAO extends JpaRepository<Admin, Integer> {
	
	@Query("SELECT a from Admin a where a.adminName=:name")
	List<Admin> getAdminByName(@Param("name") String name);
	
	@Query("SELECT a from Admin a where a.adminContactNumber=:contact")
	List<Admin> getAdminByContactNumber(@Param("contact") long adminContactNumber);

}
