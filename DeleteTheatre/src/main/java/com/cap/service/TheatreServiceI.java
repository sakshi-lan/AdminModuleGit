package com.cap.service;

import java.util.List;

import com.cap.bean.TheatreTab;
import com.cap.exception.InvalidTheatreId;

public interface TheatreServiceI {

	List<TheatreTab> deleteTheatre(int id) throws InvalidTheatreId;

	List<TheatreTab> listOfCities(String name);

	List<TheatreTab> getList();

}
