package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.Bean.CityTab;
import com.cap.service.AddServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class MyController {

	@Autowired
	private AddServiceI service;

	@PostMapping("/add/city")
	public ResponseEntity<String> addCity(@RequestBody CityTab city){
		String string = service.addCity(city);
		return new ResponseEntity<>(string, HttpStatus.OK);	
	}
}