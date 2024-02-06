package com.consumeapi2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumeapi2.entity.Student;
import com.consumeapi2.service.Aservice;
@RestController
public class Acontroller {
	
	@Autowired
	private Aservice ser;
	@GetMapping("/c")
	public ResponseEntity<String> getapi(){
		return new ResponseEntity<String>(ser.getapi(),HttpStatus.OK);
		
	}

}
