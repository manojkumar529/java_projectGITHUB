package com.aptara.inc.dao;

import java.util.List;

import com.aptara.inc.model.Person;

public interface PersonDAO {
	 public void addPerson(Person p);
	    public List<Person> getAllPerson();
	    public void deletePerson(Integer personid);

}
