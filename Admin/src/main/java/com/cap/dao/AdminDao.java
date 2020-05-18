package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.entity.Admin;

public interface AdminDao extends JpaRepository<Admin, Integer>{

	@Query("select a from Admin a where username=?1 and password=?2")
	public Admin authenticate(String uname, String pass);

}
