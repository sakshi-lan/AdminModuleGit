package com.cap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cap.bean.TheatreTab;
import com.cap.exception.InvalidTheatreId;
import com.cap.service.TheatreServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class MyController {

	@Autowired
	private TheatreServiceI theatre_service;

	@DeleteMapping("/delete_theatre/{theatre_id}")
	public ResponseEntity<List<TheatreTab>> deleteTheatre(@PathVariable("theatre_id") int id) throws InvalidTheatreId{
		List<TheatreTab> list = theatre_service.deleteTheatre(id);
		return new ResponseEntity<List<TheatreTab>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/list_of_theatres/{city_name}")
	public ResponseEntity<List<TheatreTab>> listOfCities(@PathVariable("city_name") String name){
		List<TheatreTab> list = theatre_service.listOfCities(name);
		return new ResponseEntity<List<TheatreTab>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<TheatreTab>> list(){
		List<TheatreTab> list = theatre_service.getList();
		return new ResponseEntity<List<TheatreTab>>(list, HttpStatus.OK);
	}
}
