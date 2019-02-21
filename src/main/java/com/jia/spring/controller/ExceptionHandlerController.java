package com.jia.spring.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.jia.spring.exception.ExceptionResponse;
import com.jia.spring.exception.UserNotFoundException;

@ControllerAdvice
@RestController
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handlerUserNotFoundExcepton (UserNotFoundException ex) {
		
		ExceptionResponse exceptionReponse = new ExceptionResponse (new Date(), ex.getMessage());
		
		return new ResponseEntity(exceptionReponse, HttpStatus.NOT_FOUND);
		
	}
	
	
	
	

}
