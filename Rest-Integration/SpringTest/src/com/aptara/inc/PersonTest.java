package com.aptara.inc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		PersonDaoimpl dao=(PersonDaoimpl)context.getBean("id");
		Person p=new Person();
		p.setId(2);
		p.setName("manoj");
		p.setSalary(123654);
		//System.out.println("Details saved"+p);
		p.setId(3);
		p.setName("manoj kumar");
		p.setSalary(12365400);
		p.setId(4);
		p.setName("manoj kumar singh");
		p.setSalary(123654000);
				}

}
