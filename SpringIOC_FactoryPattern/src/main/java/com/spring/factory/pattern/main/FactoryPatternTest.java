package com.spring.factory.pattern.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.pattern.factory.FactoryPattern1;

public class FactoryPatternTest {

		ApplicationContext resource = new ClassPathXmlApplicationContext("applicationContext.xml");		
		FactoryPattern1 objectFactPtrn = (FactoryPattern1) resource.getBean("factoryContext1");
		objectFactPtrn.message();
		
		
}
