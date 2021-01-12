package com.spring.di.setter.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.di.setter.bean.SetterEmpBean;

@SuppressWarnings("deprecation")
public class SetterExampMain {

	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("appEmpContext.xml");
		BeanFactory empBeanFactory = new XmlBeanFactory(res);
		SetterEmpBean empBeanObject = (SetterEmpBean) empBeanFactory.getBean("empObjXML");
		System.out.println(empBeanObject);
		
		SetterEmpBean empBeanObject1 = (SetterEmpBean) empBeanFactory.getBean("empObj2");
		System.out.println(empBeanObject1);
	}

}
