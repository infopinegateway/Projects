package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.commonutils.dbconfig.DBCredentials;
import com.commonutils.settings.GlobalNames;

public class IOCFileContextMain {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext("lib/mainSetupContext.xml");
		
		DBCredentials dbSetup = (DBCredentials) context.getBean("xmlDBContext");		
		System.out.println(dbSetup.toString());
		
		GlobalNames globalNames = (GlobalNames) context.getBean("xmlSettingsCntxt");		
		System.out.println(globalNames.toString());

	}

}
