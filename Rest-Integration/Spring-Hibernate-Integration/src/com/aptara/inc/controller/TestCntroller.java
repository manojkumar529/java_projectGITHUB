 package com.aptara.inc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aptara.inc.model.Person;
import com.aptara.inc.service.PersonServiceDao;

@Controller
public class TestCntroller {
	@Autowired
	private PersonServiceDao employeeManager;
	

	public void setEmployeeManager(PersonServiceDao employeeManager) {
		this.employeeManager = employeeManager;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listEmployees(ModelMap map) 
	{
		map.addAttribute("employee", new Person());
		map.addAttribute("employeeList", employeeManager.getAllPerson());
		
		return "editEmployeeList";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute(value="employee") Person employee, BindingResult result) 
	{
		employeeManager.addPerson(employee);
		return "redirect:/";
	}

	@RequestMapping("/delete/{employeeId}")
	public String deleteEmplyee(@PathVariable("id") Integer id)
	{
		employeeManager.deletePerson(id);
		return "redirect:/";
	}

	
}
