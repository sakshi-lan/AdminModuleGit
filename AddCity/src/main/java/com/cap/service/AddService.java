package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.Bean.CityTab;
import com.cap.dao.AddDao;

@Service
@Transactional
public class AddService implements AddServiceI {

	@Autowired
	private AddDao dao;
	@Override
	public String addCity(CityTab city) {
		boolean bool = dao.existsById(city.getCity_Id());
		if(bool) {
			return "sorry, city was not added..!!";
		}
		else {
			CityTab c = dao.findCity(city.getCity_Name());
			if(c != null) {
				return "sorry, city was not added..!!";
			}
			else {
				String s = city.getCity_Name().toUpperCase();
				city.setCity_Name(s);
				dao.save(city);
				return "City was added successfully..!!";
			}
		}
	}
}
