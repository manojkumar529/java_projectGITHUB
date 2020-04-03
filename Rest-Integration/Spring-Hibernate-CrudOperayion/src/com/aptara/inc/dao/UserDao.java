package com.aptara.inc.dao;

import java.util.List;

import com.aptara.inc.model.User;



public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
	void save(User user);
	
	void deleteBySSO(String sso);
	
	List<User> findAllUsers();

}

