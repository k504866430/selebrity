package com.lab49.it.selebrity.seleniumsupport.pageobjects;

import java.lang.annotation.Annotation;

public class PageAnnotationProcessor {

	public static <A extends Annotation, E extends Page> A findAnnotationInClass(
			final Class<E> clazz, final Class<A> annotationType) {
		return null;
	}

	// public static <A extends Annotation, E extends Page> A
	// findAnnotatedElement(
	// final Class<E> clazz, final Class<A>...annotationTypes) {
	//
	// }
}
