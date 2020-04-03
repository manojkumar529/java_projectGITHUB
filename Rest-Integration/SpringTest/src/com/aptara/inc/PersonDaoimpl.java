package com.aptara.inc;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class PersonDaoimpl {
	HibernateTemplate template;


	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	public void saveEmployee(Person p)
	{
		template.save(p);
	}
	public void updateEmployee(Person p)
	{
		template.update(p);
	}
	public void deleteEmployee(Person p)
	{
		template.delete(p);
	}
	

}
