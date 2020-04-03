package com.aptara.inc.dao;

import java.util.List;

import com.aptara.inc.domain.User;

public interface UserDao {
	public void save(User u);
	public void update(User u);
	public void delete(User u);
	public void delete(Integer UserID);
	public void findById(Integer UserID);
	public List<User> findAll();
	public List<User> findByProperty(String propName, Object propValue);

}
