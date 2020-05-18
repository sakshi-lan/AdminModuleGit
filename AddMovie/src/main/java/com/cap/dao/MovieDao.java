package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.bean.MovieTab;

public interface MovieDao extends JpaRepository<MovieTab, Integer>{

	@Query("select m from MovieTab m where movie_Name=?1")
	public MovieTab getMovieName(String movie_Name);

}
