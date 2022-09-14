package com.sprint1.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "question_id")
	private int questionId;
	
	@Column(name = "question_asked")
	private String questionAsked;
	
	@Column(name = "max_marks")
	private int maxMarks;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_result_id")
	private Result result;
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Question(int questionId, String questionAsked, int maxMarks, Result result) {
		super();
		this.questionId = questionId;
		this.questionAsked = questionAsked;
		this.maxMarks = maxMarks;
		this.result = result;
	}




	public int getQuestionId() {
		return questionId;
	}
	@Column(name = "question_id")
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	
	
	public String getQuestionAsked() {
		return questionAsked;
	}
	@Column(name = "question_asked")
	public void setQuestionAsked(String questionAsked) {
		this.questionAsked = questionAsked;
	}
	
	
	public int getMaxMarks() {
		return maxMarks;
	}
	@Column(name = "max_marks")
	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}




	public Result getResult() {
		return result;
	}




	public void setResult(Result result) {
		this.result = result;
	}
	
	
	
	
	
}
