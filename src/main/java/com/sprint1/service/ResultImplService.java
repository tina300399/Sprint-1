package com.sprint1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint1.dao.IResultDAO;
import com.sprint1.entity.Result;


@Service
public class ResultImplService implements IServiceResult {
	
	@Autowired
	IResultDAO resultDAO;

	@Override
	public List<Result> getAllResults() {
		return resultDAO.findAll();
	}

	@Override
	public Result getResultById(int resultId) {
		return resultDAO.findById(resultId).orElse(null);
	}

	@Override
	public Result addResult(Result result) {
		resultDAO.save(result);
		return result;
	}

	@Override
	public Result updateResult(Result result) {
		resultDAO.save(result);
		return result;
	}

	@Override
	public void deleteResultById(int resultId) {
		Result result = resultDAO.getOne(resultId);
		resultDAO.delete(result);
	}
}