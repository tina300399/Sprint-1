package com.sprint1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprint1.entity.Question;



@Repository
public interface IQuestionDAO extends JpaRepository<Question, Integer> {

}
