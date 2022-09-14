package com.sprint1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Result {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "result_id")
	private int resultId;
	
	@Column(name = "exam_score")
	private double examScore;
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Result(int resultId, double examScore) {
		super();
		this.resultId = resultId;
		this.examScore = examScore;
	}
	
	
	public int getResultId() {
		return resultId;
	}
	@Column(name = "result_id")
	public void setResultId(int resultId) {
		this.resultId = resultId;
	}
	
	
	public double getExamScore() {
		return examScore;
	}
	@Column(name = "exam_score")
	public void setExamScore(double examScore) {
		this.examScore = examScore;
	}
	@Override
	public String toString() {
		return "Result [resultId=" + resultId + ", examScore=" + examScore + "]";
	}
}