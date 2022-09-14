package com.sprint1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprint1.entity.Result;

@Repository
public interface IResultDAO extends JpaRepository<Result, Integer> {	

}