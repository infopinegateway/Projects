package com.spring.ioc.main;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.ioc.bean.EmployeeBean;

public class ApplicatonMain {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("empBean.xml");
		EmployeeBean emp = (EmployeeBean) beanFactory.getBean("empContext");
		System.out.println(emp);
		
		EmployeeBean emp0 = (EmployeeBean) beanFactory.getBean("empPassByVal");
		System.out.println(emp0);

		Resource resource=new ClassPathResource("empBean.xml");  
		@SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(resource);  
		EmployeeBean emp1 = (EmployeeBean) factory.getBean("empConstArg");
		System.out.println(emp1);
		
	}

}
