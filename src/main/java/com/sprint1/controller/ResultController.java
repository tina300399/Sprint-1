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
import com.sprint1.entity.Result;
import com.sprint1.service.IServiceResult;


@RestController
public class ResultController {
	
	@Autowired
	IServiceResult serviceResult;

	@GetMapping("/result")
	public List<Result> getAllResults()
	{
		return this.serviceResult.getAllResults();
	}
	
	@GetMapping("/result/{resultId}")
	public Result getResultById(@PathVariable int resultId)
	{
		return this.serviceResult.getResultById(resultId);
	}
	
	
	@PostMapping("/result")
	public Result addResult(@RequestBody Result result)
	{
		return this.serviceResult.addResult(result);
	}
	
	@PutMapping("/result")
	public Result updateResult(@RequestBody Result result)
	{
		return this.serviceResult.updateResult(result);
	}
	
	@DeleteMapping("/result/{resultId}")
	public ResponseEntity<HttpStatus> deleteResultById(@PathVariable int resultId)
	{
		try {
			this.serviceResult.deleteResultById(resultId);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception ex)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}	
}