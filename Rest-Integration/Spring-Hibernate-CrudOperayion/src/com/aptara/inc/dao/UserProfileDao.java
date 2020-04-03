package com.aptara.inc.dao;

import java.util.List;

import com.aptara.inc.model.UserProfile;




public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
