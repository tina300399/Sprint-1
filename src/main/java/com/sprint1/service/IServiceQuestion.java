package com.sprint1.service;

import java.util.List;

import com.sprint1.entity.Question;



public interface IServiceQuestion {
	
	public List<Question> getAllQuestions();
	public Question getQuestionById(int questionId);
	public Question addQuestion(Question question);
	public Question updateQuestion(Question question);
	public void deleteQuestionById(int questionId);
}