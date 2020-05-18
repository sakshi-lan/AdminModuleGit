package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.AdminDao;
import com.cap.entity.Admin;

@Service
@Transactional
public class AdminService implements AdminServiceI {

	@Autowired
	private AdminDao dao;
	
	@Override
	public Admin authenticate(String uname, String pass) {
		return dao.authenticate(uname, pass);
	}
}