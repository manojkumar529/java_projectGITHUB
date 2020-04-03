package com.aptara.inc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aptara.inc.model.Person;
@Repository
public class PersonDAOimpl implements PersonDAO {
   @Autowired
   private SessionFactory sessionFactory;
	@Override
	public void addPerson(Person p) {
		this.sessionFactory.getCurrentSession().save(p);
		
	}

	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().createCriteria("from Person").list();
	}

	@Override
	public void deletePerson(Integer personid) {
		// TODO Auto-generated method stub
		
	}

}
