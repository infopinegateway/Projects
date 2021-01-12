package com.spring.ioc.app.bean;

import com.spring.ioc.app.service.MotorInterf;

public class CarBean implements MotorInterf{	
	public void getVehicleInfo() { System.out.println("You are using CarBean Object!"); }
}
