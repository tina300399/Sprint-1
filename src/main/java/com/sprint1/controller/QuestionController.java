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

import com.sprint1.entity.Question;
import com.sprint1.service.IServiceQuestion;


@RestController
public class QuestionController {
	
	@Autowired
	IServiceQuestion serviceQuestion;
	
	@GetMapping("/question")
	public List<Question> getAllQuestions()
	{
		return this.serviceQuestion.getAllQuestions();
	}
	
	@GetMapping("/question/{id}")
	public Question getQuestionById(@PathVariable int id)
	{
		return this.serviceQuestion.getQuestionById(id);
	}
	
	@PostMapping("/question")
	public Question addQuestion(@RequestBody Question question)
	{
		return this.serviceQuestion.addQuestion(question);
	}
	
	@PutMapping("/question")
	public Question updateQuestion(@RequestBody Question question)
	{
		return this.serviceQuestion.updateQuestion(question);
	}
	
	@DeleteMapping("/question/{questionId}")
	public ResponseEntity<HttpStatus> deleteQuestionById(@PathVariable int questionId)
	{
		try {
			this.serviceQuestion.deleteQuestionById(questionId);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception ex)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}