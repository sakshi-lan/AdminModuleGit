package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.MovieTab;
import com.cap.bean.TheatreTab;
import com.cap.dao.MovieDao;
import com.cap.dao.TheaterDao;

@Service
@Transactional
public class MovieService implements MovieServiceI {

	@Autowired
	private TheaterDao theatre_dao;

	@Autowired
	private MovieDao movie_dao;

	@Override
	public String addMovie(MovieTab movie) {
		boolean bool = movie_dao.existsById(movie.getMovie_Id());
		if(bool) {
			return "sorry, the movie was not added..!!";
		}
		else {
			String s = movie.getTheatre_Name().toUpperCase();
			movie.setTheatre_Name(s);
			TheatreTab t = theatre_dao.getTheatre(movie.getTheatre_Name());
			if(t != null) {
				String s1 = movie.getMovie_Name().toUpperCase();
				movie.setMovie_Name(s1);
				MovieTab m = movie_dao.getMovieName(movie.getMovie_Name());
				if(m == null) {
					movie_dao.save(movie);
					return "movie was added successfully..!!";
				}
				else {
					return "sorry, movie was not added..!!";
				}
			}
			else {
				return "sorry, movie was not added..!!";
			}
		}
	}
}