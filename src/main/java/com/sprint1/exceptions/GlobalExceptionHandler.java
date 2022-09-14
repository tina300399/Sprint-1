package com.sprint1.exceptions;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(EmptyNameException.class)
	public ResponseEntity<String> handleEmptyInput(EmptyNameException emptyNameException)
	{
		return new ResponseEntity<String>("Name field is empty, Please look into it",HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(EmptyListException.class)
	public ResponseEntity<String> handleEmptyList(EmptyListException emptyListException)
	{
		return new ResponseEntity<String>("No elements in the DB, kindly enter some elements",HttpStatus.BAD_REQUEST);
	}
	
	
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElement(NoSuchElementException elementException)
	{
		return new ResponseEntity<String>("No such element found corresponding to the ID",HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(NoResultFoundUsingContactNumberException.class)
	public ResponseEntity<String> handleContactNumberException(NoResultFoundUsingContactNumberException noResultException)
	{
		return new ResponseEntity<String>("No such result found using contact number",HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(NoResultFoundUsingNameException.class)
	public ResponseEntity<String> handleNameException(NoResultFoundUsingNameException noResultException)
	{
		return new ResponseEntity<String>("No such result found using name",HttpStatus.BAD_REQUEST);
	}
	
	
}
