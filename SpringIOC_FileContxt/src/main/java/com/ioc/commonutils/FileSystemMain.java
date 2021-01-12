package com.ioc.commonutils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemMain {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("external/externalDBConfig.xml");		
		DBConfig configDB = (DBConfig) context.getBean("xmlDBContext");
		System.out.println(configDB);
		System.out.println(configDB.getConnectionString());
	
	}

}
