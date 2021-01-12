package com.spring.ioc.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ioc.app.service.LaptopInterf;
import com.spring.ioc.app.service.MotorInterf;

public class IOCAppContext {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		//ApplicationContext resource = new ClassPathXmlApplicationContext(new String[]{"laptopContext.xml","motorsContext.xml"});
		
		ApplicationContext resource = new ClassPathXmlApplicationContext("projectContextConfig.xml");
		
		LaptopInterf lapIntf = (LaptopInterf) resource.getBean("laptopContext");
		lapIntf.getMachineInfo();
		
		MotorInterf motIntf = (MotorInterf) resource.getBean("motorsContext");
		motIntf.getVehicleInfo();		
	}

}
