package com.cap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.CityTab;
import com.cap.bean.TheatreTab;
import com.cap.dao.CityDao;
import com.cap.dao.TheatreDao;
import com.cap.exception.InvalidCityId;

@Service
@Transactional
public class CityService implements CityServiceI {

	@Autowired
	private CityDao city_dao;
	
	@Autowired
	private TheatreDao theatre_dao;

	@Override
	public List<CityTab> deleteCity(int id) throws InvalidCityId {
		CityTab c = city_dao.findCity(id);
		if(c != null) {
			List<TheatreTab> list1 = theatre_dao.getCity(c.getCity_Name());
			if(list1.size() == 0) {
				city_dao.deleteById(id);
				List<CityTab> list = city_dao.findAll();
				return list;
			}
			else {
				List<CityTab> list = city_dao.findAll();
				return list;
			}
		}
		else {
			List<CityTab> list = city_dao.findAll();
			return list;
		}
	}

	@Override
	public List<CityTab> listOfCities() {
		List<CityTab> list = city_dao.findAll();
		return list;
	}
}