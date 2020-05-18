package com.cap.service;

import com.cap.entity.Admin;

public interface AdminServiceI {

	Admin authenticate(String uname, String pass);

}
