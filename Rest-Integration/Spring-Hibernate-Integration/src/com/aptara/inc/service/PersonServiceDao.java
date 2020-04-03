package com.aptara.inc.service;

import java.util.List;

import com.aptara.inc.model.Person;

public interface PersonServiceDao {
	public void addPerson(Person p);
	public List<Person> getAllPerson();
	public void deletePerson(Integer id);
	

}
