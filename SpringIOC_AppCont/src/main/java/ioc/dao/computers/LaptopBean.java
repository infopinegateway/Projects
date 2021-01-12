package ioc.dao.computers;

import ioc.service.ComputerServices;

public class LaptopBean implements ComputerServices{
	public void getHardwareInfo() { System.out.println("You are using Laptop Object!"); }
}
