package com.spring.di.examp.services;

public class TwitterService implements MessageService{

	public boolean sendMessage(String msg, String rec) {
		System.out.println("Twitter Receiver Id/Name: "+ rec+", Content "+msg );
		return true;
	}
}
