package com.consumeapi2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consumeapi2.entity.Student;
@Service
public class Aservice {
	
	@Autowired
	private RestTemplate rest;
	
	public String getapi() {
		return rest.getForObject("https://www.universal-tutorial.com/api/countries", String.class);
	}
	
}
