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

import com.cap.bean.MovieTab;
import com.cap.exception.InvalidMovieId;
import com.cap.service.MovieServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class MyController {

	@Autowired
	private MovieServiceI movie_service;

	@DeleteMapping("/delete/movie/{movie_Id}")
	public ResponseEntity<List<MovieTab>> deleteMovie(@PathVariable("movie_Id") int id)throws InvalidMovieId{
		List<MovieTab> list = movie_service.deleteMovie(id);
		return new ResponseEntity<List<MovieTab>>(list, HttpStatus.OK);
	}

	@GetMapping("/list_of_movies/{theatre_name}")
	public ResponseEntity<List<MovieTab>> listOfMovies(@PathVariable("theatre_name") String name){
		List<MovieTab> list = movie_service.listOfMovies(name);
		return new ResponseEntity<List<MovieTab>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/listOfMovies")
	public ResponseEntity<List<MovieTab>> listOfMovies(){
		List<MovieTab> list = movie_service.listOfMovies();
		return new ResponseEntity<List<MovieTab>>(list, HttpStatus.OK);
	}
}
