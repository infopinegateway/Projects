package com.examp.annotation.sample;

/*
 * @SuppressWarnings : Instructs to compiler to suppress the compile time warnings specified in the annotation parameters.
 * 
 */

import java.util.ArrayList;

public class ExampSuppress {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	 @SuppressWarnings("rawtypes")
	ArrayList lst =new ArrayList();
	
	 lst.add("ruby");
	 lst.add("diamond");
	 lst.add("cobalt");
	 lst.add("granite");
	 
	 for(Object objs: lst) System.out.println("The list is "+ objs);
	
	}

}
