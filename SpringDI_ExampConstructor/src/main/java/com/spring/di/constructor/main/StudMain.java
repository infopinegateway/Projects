package com.spring.di.constructor.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.constructor.bean.StudConst;


public class StudMain {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("studContext.xml");
		StudConst stud1 = (StudConst) beanFactory.getBean("studConst1");
		System.out.println(stud1);
		
		StudConst stud2 = (StudConst) beanFactory.getBean("studConst2");
		System.out.println(stud2);

	}

}
