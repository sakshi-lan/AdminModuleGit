package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.bean.MovieTab;
import com.cap.service.MovieServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class MyController {
	
	@Autowired
	private MovieServiceI service;
	
	@PostMapping("/add/movie")
	public ResponseEntity<String> addMovie(@RequestBody MovieTab movie){
		String string = service.addMovie(movie);
		return new ResponseEntity<>(string,HttpStatus.OK);
	}
}
