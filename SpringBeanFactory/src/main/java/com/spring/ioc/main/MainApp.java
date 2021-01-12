package com.spring.ioc.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.ioc.bean.CollectionDemo;


public class MainApp {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("propertiesContext.xml"));
	    CollectionDemo instance = (CollectionDemo) factory.getBean("collectionsDemo");
	    instance.displayInfo();
	}

}
