package com.examp.annotation.custom;

import java.lang.annotation.*;  
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
public @interface CustomSinglevalAnnotation {
	int value() default 100;
}
