package com.sprint1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint1.dao.IQuestionDAO;
import com.sprint1.entity.Question;



@Service
public class QuestionImplService implements IServiceQuestion {

	@Autowired
	IQuestionDAO questionDAO;
	
	
	
	@Override
	public List<Question> getAllQuestions() {
		return questionDAO.findAll();
	}

	@Override
	public Question getQuestionById(int questionId) {
		return questionDAO.findById(questionId).orElse(null);
	}

	@Override
	public Question addQuestion(Question question) {
		questionDAO.save(question);
		return question;
	}

	@Override
	public Question updateQuestion(Question question) {
		questionDAO.save(question);
		return question;
	}

	@Override
	public void deleteQuestionById(int questionId) {
		Question question = questionDAO.getOne(questionId);
		questionDAO.delete(question);
	}
}