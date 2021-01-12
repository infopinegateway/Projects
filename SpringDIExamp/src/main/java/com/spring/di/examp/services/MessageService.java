package com.spring.di.examp.services;

public interface MessageService {

	//passing argument mail message and receiver name/email-id
	boolean sendMessage(String msg, String rec);

}
