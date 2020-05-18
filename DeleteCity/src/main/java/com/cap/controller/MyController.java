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

import com.cap.bean.CityTab;
import com.cap.exception.InvalidCityId;
import com.cap.service.CityServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class MyController {
	
	@Autowired
	private CityServiceI service;
	
	@DeleteMapping("/delete_city/{city_id}")
	public ResponseEntity<List<CityTab>> deleteCity(@PathVariable("city_id") int id) throws InvalidCityId{
		List<CityTab> list = service.deleteCity(id);
		return new ResponseEntity<List<CityTab>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/list_of_cities")
	public ResponseEntity<List<CityTab>> listOfCities(){
		List<CityTab> list = service.listOfCities();
		return new ResponseEntity<List<CityTab>>(list, HttpStatus.OK);
	}
}
