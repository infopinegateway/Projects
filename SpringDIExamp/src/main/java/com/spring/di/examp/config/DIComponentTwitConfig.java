package com.spring.di.examp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import com.spring.di.examp.services.EmailService;
import com.spring.di.examp.services.MessageService;
import com.spring.di.examp.services.TwitterService;

@Configuration
@ComponentScan(value= {"com.spring.di.examp.annot"})
public class DIComponentTwitConfig {
	
	@Bean
	public MessageService getMessageService() {	return new TwitterService();	}
}
