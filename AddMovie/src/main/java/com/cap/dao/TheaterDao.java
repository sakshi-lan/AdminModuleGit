package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.bean.TheatreTab;

public interface TheaterDao extends JpaRepository<TheatreTab, Integer>{

	@Query("select t from TheatreTab t where theatre_name=?1")
	public TheatreTab getTheatre(String theatre_Name);

}
