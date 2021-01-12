package com.spring.di.constructor.spellExamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("beanContextConst.xml");

	      TextEditor te = (TextEditor) context.getBean("textSpellConst");
	      te.spellCheck();
	}

}
