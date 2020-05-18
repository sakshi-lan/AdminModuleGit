package com.cap.service;

import java.util.List;

import com.cap.bean.CityTab;
import com.cap.exception.InvalidCityId;

public interface CityServiceI {

	List<CityTab> deleteCity(int id) throws InvalidCityId;

	List<CityTab> listOfCities();

}
