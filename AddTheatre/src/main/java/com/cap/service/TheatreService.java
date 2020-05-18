package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.CityTab;
import com.cap.bean.TheatreTab;
import com.cap.dao.CityDao;
import com.cap.dao.TheatreDao;

@Service
@Transactional
public class TheatreService implements TheatreServiceI {

	@Autowired
	private CityDao city_dao;

	@Autowired
	private TheatreDao theatre_dao;

	@Override
	public String addTheatre(TheatreTab theatre) {
		String s = theatre.getCity_Name().toUpperCase();
		theatre.setCity_Name(s);
		CityTab c = city_dao.findCity(theatre.getCity_Name());
		if( c != null) {
			String s1 = theatre.getTheatre_Name().toUpperCase();
			theatre.setTheatre_Name(s1);
			TheatreTab t = theatre_dao.findTheatreName(theatre.getTheatre_Name());
			if(t == null) {
				theatre_dao.save(theatre);
				return "Theatre was added successfully..!!";
			}
			else {
				return "sorry, theatre was not added..!!";
			}
		}
		else {
			return "Sorry, theatre was not added..!!";
		}
	}
}