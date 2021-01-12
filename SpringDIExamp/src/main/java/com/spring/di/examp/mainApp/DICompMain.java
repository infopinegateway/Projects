package com.spring.di.examp.mainApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.di.examp.annot.ComponentDI;
import com.spring.di.examp.config.DIComponentConfig;
import com.spring.di.examp.config.DIComponentTwitConfig;

/*
 * AbstractAppicationContext -> 
 * AnnotationConfigApplicationContext ->
 * getBean() -> 
 */
		
public class DICompMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIComponentConfig.class);
		ComponentDI diComponent = (ComponentDI) context.getBean(ComponentDI.class);		
		diComponent.setMessage("Hi Paul, can we met some another day","paul@in.com");

		// close the context
		context.close();
		
		AnnotationConfigApplicationContext twitContext = new AnnotationConfigApplicationContext(DIComponentTwitConfig.class);
		ComponentDI diComptwit = (ComponentDI) twitContext.getBean(ComponentDI.class);
		diComptwit.setMessage("Hi Leela, first twitter message","rockylionel");

		// close the context
		twitContext.close();
						
	}

}
