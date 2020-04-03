package com.aptara.inc.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PersonDaoImpl implements PersonDao{
	private SessionFactory  sessionFactory;
	

	public PersonDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addPerson(Person p) {
		Session session=this.sessionFactory.getCurrentSession();
		session.persist(p);
		}

	@Override
	public void updatePerson(Person p) {
		Session session=this.sessionFactory.getCurrentSession();
		session.update(p);
		
	}

	@Override
	public List<Person> listPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	
	
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePerson(int id) {
		// TODO Auto-generated method stub
		
	}
	

}
