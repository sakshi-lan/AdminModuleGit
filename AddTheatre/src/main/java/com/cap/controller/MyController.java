package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.bean.TheatreTab;
import com.cap.service.TheatreServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class MyController {
	
	@Autowired
	private TheatreServiceI service;
	
	@PostMapping("/add/theatre")
	public ResponseEntity<String> addTheatre(@RequestBody TheatreTab theatre){
		String string = service.addTheatre(theatre);
		return new ResponseEntity<>(string, HttpStatus.OK);
	}

}
