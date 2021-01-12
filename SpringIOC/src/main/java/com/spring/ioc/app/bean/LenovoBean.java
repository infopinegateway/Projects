package com.spring.ioc.app.bean;

import com.spring.ioc.app.service.LaptopInterf;

public class LenovoBean implements LaptopInterf{	
	public void getMachineInfo() { System.out.println("You are using LenovoBean Object"); }
}
