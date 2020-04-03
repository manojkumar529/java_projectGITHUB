package com.aptara.inc.service;

import java.util.List;

import com.aptara.inc.model.User;

public  interface UserService {
	void save(User u);
	List<User> list();

}
