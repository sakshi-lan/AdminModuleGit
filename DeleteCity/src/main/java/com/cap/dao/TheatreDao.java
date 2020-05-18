package com.cap.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.bean.TheatreTab;

public interface TheatreDao extends JpaRepository<TheatreTab, Integer>{

	@Query("select t from TheatreTab t where city_Name=?1")
	public List<TheatreTab> getCity(String city_Name);

}
