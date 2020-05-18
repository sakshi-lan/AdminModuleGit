package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.Bean.CityTab;

public interface AddDao extends JpaRepository<CityTab, Integer>{

	@Query("select c from CityTab c where city_Name=?1")
	public CityTab findCity(String city_Name);

}