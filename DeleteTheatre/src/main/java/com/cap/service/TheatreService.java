package com.cap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.MovieTab;
import com.cap.bean.TheatreTab;
import com.cap.dao.MovieDao;
import com.cap.dao.TheatreDao;
import com.cap.exception.InvalidTheatreId;

@Service
@Transactional
public class TheatreService implements TheatreServiceI {

	@Autowired
	private TheatreDao theatre_dao;

	@Autowired
	private MovieDao movie_dao;

	@Override
	public List<TheatreTab> deleteTheatre(int id) throws InvalidTheatreId {
		TheatreTab t1 = theatre_dao.findTheatre(id); 
		if(t1 != null ) {
			List<MovieTab> list1 = movie_dao.getMovie(t1.getTheatre_Name());
			if(list1.size() == 0) {
				theatre_dao.deleteById(id);
				List<TheatreTab> list = theatre_dao.findAll();
				return list;
			}
			else {
				List<TheatreTab> list = theatre_dao.findAll();
				return list;
			}
		}
		else {
			List<TheatreTab> list = theatre_dao.findAll();
			return list;
		}
	}

	@Override
	public List<TheatreTab> listOfCities(String name) {
		List<TheatreTab> list = theatre_dao.listOfCities(name);
		return list;
	}

	@Override
	public List<TheatreTab> getList() {
		List<TheatreTab> list = theatre_dao.findAll();
		return list;
	}
}