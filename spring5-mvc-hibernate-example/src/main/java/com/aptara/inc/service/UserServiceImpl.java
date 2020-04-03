package com.aptara.inc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aptara.inc.dao.UserDao;
import com.aptara.inc.model.User;
@Service
public class UserServiceImpl implements UserService {
     @Autowired
	 private UserDao userDao;
	@Override
	@Transactional
	public void save(User u) {
	userDao.save(u);
		
	}

	@Override
	@Transactional
	public List<User> list() {
		// TODO Auto-generated method stub
		return userDao.list();
	}

}
