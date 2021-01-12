package ioc.appcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ioc.service.ComputerServices;
import ioc.service.MotorServices;

public class AppContextMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		//ApplicationContext resource = new ClassPathXmlApplicationContext(new String[] {"motorContext.xml", "computerContext.xml"});
		ApplicationContext resource = new ClassPathXmlApplicationContext("appcontextConfig.xml");		
		MotorServices vehInf = (MotorServices) resource.getBean("motorContext");
		ComputerServices compIntf = (ComputerServices) resource.getBean("computerContext");
		
		vehInf.getVehicleInfo();
		compIntf.getHardwareInfo();
		System.out.println("Test File!");
	}

}
