package com.cap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.MovieTab;
import com.cap.dao.MovieDao;
import com.cap.exception.InvalidMovieId;

@Service
@Transactional
public class MovieService implements MovieServiceI {
	
	@Autowired
	private MovieDao movie_dao;

	@Override
	public List<MovieTab> deleteMovie(int id) throws InvalidMovieId {
		boolean bool = movie_dao.existsById(id);
		if(bool) {
			movie_dao.deleteById(id);
			List<MovieTab> list = movie_dao.findAll();
			return list;
		}
		else {
			
			List<MovieTab> list = movie_dao.findAll();
			return list;
			
		}
	}

	@Override
	public List<MovieTab> listOfMovies(String name) {
		List<MovieTab> list = movie_dao.listOfMovies(name);
		return list;
	}

	@Override
	public List<MovieTab> listOfMovies() {
		List<MovieTab> list = movie_dao.findAll();
		return list;
	}
}