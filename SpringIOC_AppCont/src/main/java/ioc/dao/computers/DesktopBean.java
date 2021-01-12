package ioc.dao.computers;

import ioc.service.ComputerServices;

public class DesktopBean implements ComputerServices {
	
	public void getHardwareInfo() { System.out.println("You are using Desktop Object!"); }

}
