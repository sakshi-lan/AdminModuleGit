package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.bean.CityTab;

public interface CityDao extends JpaRepository<CityTab, Integer>{

	@Query("select c from CityTab c where city_Id=?1")
	public CityTab findCity(int id);

}
