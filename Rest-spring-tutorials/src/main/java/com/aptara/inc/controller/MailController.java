package com.aptara.inc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aptara.inc.mail.MailService;
import com.aptara.inc.mail.MockmailSender;

@RestController
public class MailController {
	private MailService mailSender=new  MockmailSender(); 
	
	
	@RequestMapping("/mail")
	public String hello()
	{
		mailSender.send("tomanoj529@gmail.com", "test mail", "mail sender");
		return "mail send";
	}

}
