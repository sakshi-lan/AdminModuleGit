package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cap.entity.Admin;
import com.cap.service.AdminServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class MyController {
	
	@Autowired
	private AdminServiceI service;
	
	@GetMapping("/authenticate/{username}/{password}")
	public ResponseEntity<Admin> authenticate(@PathVariable("username") String uname, @PathVariable("password") String pass){
		Admin admin = service.authenticate(uname, pass);
		return new ResponseEntity<>(admin, HttpStatus.OK);
	}
}
