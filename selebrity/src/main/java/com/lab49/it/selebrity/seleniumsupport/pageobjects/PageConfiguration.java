package com.lab49.it.selebrity.seleniumsupport.pageobjects;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class PageConfiguration {

	// private VerifyAt verifyAt;
	// private URL url;

	public VerificationType verifyBy() {
		return null;
	}

	public String getVerifiableCSSSelector() {
		return null;
	}

	public String getVerifiableText() {
		return null;
	}

	public Method getCustomVerifier() {
		return null;
	}

	public String getTitle() {
		return null;
	}

	public String getURL() {
		return null;
	}

	public <A extends Annotation> A getAnnotation(final Class<A> clazz) {
		return null;
	}

	public AnnotatedElement getAnnotatedElement(
			final Class<? extends Annotation> clazz) {
		return null;
	}

}
