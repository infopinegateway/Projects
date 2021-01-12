package com.spring.ioc.app.bean;

import com.spring.ioc.app.service.MotorInterf;

public class BikeBean implements MotorInterf {
	public void getVehicleInfo() { System.out.println("You are using BikeBean Object!"); }
}
