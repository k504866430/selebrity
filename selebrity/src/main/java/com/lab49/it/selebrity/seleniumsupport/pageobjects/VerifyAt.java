package com.lab49.it.selebrity.seleniumsupport.pageobjects;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
public @interface VerifyAt {
	VerificationType value() default VerificationType.CUSTOM;

	String title() default "";

	String url() default "";

	String css() default "";

	String text() default "";

}
