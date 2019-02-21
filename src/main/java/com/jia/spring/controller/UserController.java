package com.jia.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

import com.jia.spring.exception.UserNotFoundException;
import com.jia.spring.model.*;
import com.jia.spring.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository repository;
		
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById (@PathVariable("id") String Id) {
		
		 User user = repository.findByUserId(Id);
		 if (user == null) throw new UserNotFoundException("Can Not find " + Id + " user");	 
         return new ResponseEntity<User>(user, HttpStatus.OK);		
         
	}
	
	

	
	
	

}
