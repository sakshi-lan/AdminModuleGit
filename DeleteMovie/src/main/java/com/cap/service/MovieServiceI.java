package com.cap.service;

import java.util.List;

import com.cap.bean.MovieTab;
import com.cap.exception.InvalidMovieId;

public interface MovieServiceI {

	List<MovieTab> deleteMovie(int id)throws InvalidMovieId;

	List<MovieTab> listOfMovies(String name);

	List<MovieTab> listOfMovies();

}
