package com.lab49.it.selebrity.seleniumsupport.pageobjects;

import static org.junit.Assert.fail;

import org.junit.Test;

public class VerifyAtTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@VerifyAt(title = "some title")
	class HomePage {

	}

	@VerifyAt(url = "/someurl")
	class URLPage {

	}

	@VerifyAt(css = "#el.myel", text = "some value")
	class CSSPage {

	}

	static class FieldPageURL {
		@VerifyAt(VerificationType.URL)
		private static String url = "/someURL";
	}

	static class FieldPageTitle {
		@VerifyAt(VerificationType.TITLE)
		private static String url = "some title";
	}

	static class FieldPageCustom {
		@VerifyAt
		private static boolean verify() {
			return false;
		}
	}

}
