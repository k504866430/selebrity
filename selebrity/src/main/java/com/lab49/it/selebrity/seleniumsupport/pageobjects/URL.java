package com.lab49.it.selebrity.seleniumsupport.pageobjects;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
public @interface URL {
	String value() default "";
}
