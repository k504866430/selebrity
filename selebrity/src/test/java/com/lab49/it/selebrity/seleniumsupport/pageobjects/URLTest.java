package com.lab49.it.selebrity.seleniumsupport.pageobjects;

import static org.junit.Assert.fail;

import org.junit.Test;

public class URLTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@URL("/someURL")
	class HomePage {

	}

	static class FieldPageURL {
		@URL
		private static String url = "/someURL";
	}

	static class FieldPageCustom {
		@URL
		private static String url() {
			return "/someURL";
		}
	}

}
