package com.cap.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.bean.MovieTab;

public interface MovieDao extends JpaRepository<MovieTab, Integer>{

	@Query("select m from MovieTab m where theatre_Name=?1")
	public List<MovieTab> getMovie(String theatre_Name);

}
