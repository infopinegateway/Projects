package com.ioc.pattern.factory;

public class FactoryPattern1 {
	
	public static final FactoryPattern1 obj_Instance = new FactoryPattern1();
	
	public FactoryPattern1() { System.out.println("Default Consturctor in FactoryPattern1"); }
	
	//Factory method
	public static FactoryPattern1 getMethod1() {
		System.out.println("Factory Method in FactoryPattern1");
		return obj_Instance;
	}
	
	public void message() { System.out.println("normal method in FactoryPattern1"); }
	
	
	
}
