package com.aptara.inc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aptara.inc.model.Person;
@Service
public class PersonServiceDaoImpl  implements PersonServiceDao{
   @Autowired
   private PersonServiceDao psDao;
	@Override
	public void addPerson(Person p) {
		psDao.addPerson(p);
		
	}

	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return psDao.getAllPerson();
	}

	@Override
	public void deletePerson(Integer id) {
psDao.deletePerson(id);		
	}

}
