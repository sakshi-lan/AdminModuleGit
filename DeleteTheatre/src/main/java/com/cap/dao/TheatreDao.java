package com.cap.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.bean.TheatreTab;

public interface TheatreDao extends JpaRepository<TheatreTab, Integer>{

	@Query("select t from TheatreTab t where city_Name=?1")
	public List<TheatreTab> listOfCities(String name);

	@Query("select t from TheatreTab t where theatre_Id=?1")
	public TheatreTab findTheatre(int id);

}
