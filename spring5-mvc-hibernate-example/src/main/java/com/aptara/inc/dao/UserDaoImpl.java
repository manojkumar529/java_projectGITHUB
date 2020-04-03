package com.aptara.inc.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aptara.inc.model.User;
@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
	private SessionFactory sessionFactory;
	@Override
	public void save(User u) {
		sessionFactory.getCurrentSession().save(u);
		
	}

	@Override
	public List<User> list() {
		TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User");
		
		return query.getResultList();
	}

}
