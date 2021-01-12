package com.spring.di.examp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.di.examp.services.EmailService;
import com.spring.di.examp.services.MessageService;

/*
 * @Configuration : This annotation helps to spring, to be consider as a Configuration class
 * @ComponentScan : This is helps to spring, Addresses of the components (where the components configured)
 * @Bean : This annotation helps to grab the Bean implementation from Method and Inject into Component class.   
 */
@Configuration
@ComponentScan(value={"com.spring.di.examp.annot"})
public class DIComponentConfig {

		@Bean
		public MessageService getMessageService() {	return new EmailService();	}
		
}
