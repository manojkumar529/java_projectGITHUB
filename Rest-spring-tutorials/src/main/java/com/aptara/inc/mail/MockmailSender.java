package com.aptara.inc.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MockmailSender implements MailService {
  private static Log log=LogFactory.getLog(MockmailSender.class);
	@Override
	public void send(String to, String subject, String body) {
		log.info("Sending mock mail :"+to);
		log.info("from subject:"+subject);
		log.info("Sending mail body:"+body);
				
	}

}
