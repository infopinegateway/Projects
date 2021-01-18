package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Employee;

public class ResourceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("resource-annotation.xml");
		 
        Employee emp = ac.getBean("myemployee", Employee.class);
        System.out.println(emp.toString());
	}

}
