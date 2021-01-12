package com.examp.annotation.sample;

/*
 * @Override : Checks that the methods is an override. Causes a compilation error if the method is not found in one of the parent classes or implemented interfaces.
 * 
 */

class Animals {	
	void eatSomething(){ System.out.println("eating something"); }  
}

class Dogs extends Animals{
	
	@Override
	void eatSomething() { System.out.println("Dogs eats mostly man eatables");}
}

public class ExampleOverride {

	public static void main(String[] args) {
		Animals and = new Dogs();
		and.eatSomething();
	}
	
}
