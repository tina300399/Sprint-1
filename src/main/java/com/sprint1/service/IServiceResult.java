package com.sprint1.service;

import java.util.List;

import com.sprint1.entity.Result;



public interface IServiceResult {
	
	public List<Result> getAllResults();
	public Result getResultById(int resultId);
	public Result addResult(Result result);
	public Result updateResult(Result result);
	public void deleteResultById(int resultId);

}
