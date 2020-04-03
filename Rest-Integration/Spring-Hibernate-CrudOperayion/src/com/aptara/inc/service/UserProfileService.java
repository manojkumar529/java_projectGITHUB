package com.aptara.inc.service;
import java.util.List;

import com.aptara.inc.model.UserProfile;




public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
