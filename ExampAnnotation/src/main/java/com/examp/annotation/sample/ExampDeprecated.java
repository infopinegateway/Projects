package com.examp.annotation.sample;

/*
 * @Deprecated : Marks the method as obsolete. Causes a compile warning if the methods is used.
 * 
 * Result: 
 * 	Will see on command prompt during compile time only, javac ExampDeprecated.java
 * 
 * Output as below 
	Note: ExampDeprecated.java uses or overrides a deprecated API.
	Note: Recompile with -Xlint:deprecation for details.
 *
 */

class Foodies {
	
	public void aa() { System.out.println("Test message1"); }
	
	@Deprecated
	public void bb() { System.out.println("Test message2"); }
}
public class ExampDeprecated {	
	
	public static void main(String[] args) {
		Foodies ff = new Foodies();
		ff.bb();
	}

}
