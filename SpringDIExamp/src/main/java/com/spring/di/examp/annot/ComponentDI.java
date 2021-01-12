package com.spring.di.examp.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.di.examp.services.MessageService;

/*
 * This @Component annotation helps to spring, this class as "Component".
 * This annotation only applicable to Class only and it performs at run time only
 */
@Component
public class ComponentDI {
	
	// Field based dependency injection
	@Autowired
	private MessageService msgService;
	
	// Method based dependency injection
	@Autowired
	public void setService(MessageService argMsgService) { this.msgService = argMsgService; }
	
	public boolean setMessage(String messageContent, String senderUN) { return this.msgService.sendMessage(messageContent, senderUN); }
	

}
