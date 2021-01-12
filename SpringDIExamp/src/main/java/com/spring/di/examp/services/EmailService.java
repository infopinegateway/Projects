package com.spring.di.examp.services;

public class EmailService implements MessageService{
	
	public boolean sendMessage(String msg, String rec) {
		System.out.println("Message Receiver Email Id/Name: "+ rec+", Content "+msg );
		return true;
	}
	

}
