package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.bean.TheatreTab;

public interface TheatreDao extends JpaRepository<TheatreTab, Integer>{

	@Query("select t from TheatreTab t where theatre_Name=?1")
	public TheatreTab findTheatreName(String theatre_Name);

}
