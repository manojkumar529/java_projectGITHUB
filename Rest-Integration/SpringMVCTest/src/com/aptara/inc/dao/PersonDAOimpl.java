package com.aptara.inc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.aptara.inc.model.Person;

public class PersonDAOimpl implements PersonDAO{
	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addPerson(Person p) {
          Session session=this.sessionFactory.getCurrentSession();
          session.persist(p);
          System.out.println("Person saved successfully, Person Details="+p);

	}

	@Override
	public void updatePerson(Person p) {
		Session session=this.sessionFactory.getCurrentSession();
		session.persist(p);
		System.out.println("Person updated successfully, Person Details="+p);
		
	}

	@Override
	public List<Person> listPersons() {
	Session session=this.sessionFactory.getCurrentSession();
	List<Person> personsList=session.createCriteria("from Person").list();
	for(Person p : personsList){
		System.out.println("Person List::"+p);
		
	}
	return personsList;
	
	}

	@Override
	public Person getPersonById(int id) {
		Session session=this.sessionFactory.getCurrentSession();
		Person p=(Person)session.load(Person.class, new Integer(id));
		System.out.println("Person loaded successfully, Person details="+p);
		return p;
	}

	@Override
	public void removePerson(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Person p = (Person) session.load(Person.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		System.out.println("Person deleted successfully, person details="+p);
		//logger.info("Person deleted successfully, person details="+p);
	}
		
	}


