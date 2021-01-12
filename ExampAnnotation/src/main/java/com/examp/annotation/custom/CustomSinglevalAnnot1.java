package com.examp.annotation.custom;

import java.lang.reflect.*;

class SampleAnnot{
	
	@CustomSinglevalAnnotation(value=10)
	public void sampleAnnotedMethod() { System.out.println("Annotation Example");}
	
}

public class CustomSinglevalAnnot1{
	
	public static void main (String[] args) throws Exception{
		
		SampleAnnot sampObj = new SampleAnnot();
		Method samp = sampObj.getClass().getMethod("sampleAnnotedMethod");
		
		CustomSinglevalAnnotation custObj = samp.getAnnotation(CustomSinglevalAnnotation.class);
		System.out.println("The value is "+ custObj.value());
	}	
}
