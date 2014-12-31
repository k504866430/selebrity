package com.lab49.it.selebrity.seleniumsupport;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.lab49.it.selebrity.seleniumsupport.pageobjects.Page;
import com.lab49.it.selebrity.seleniumsupport.pageobjects.PageConfiguration;
import com.lab49.it.selebrity.seleniumsupport.pageobjects.PageConfigurationManager;

public class Browser {

	private static WebDriver driver;

	public static WebDriver driver() {
		return driver;
	}

	public static String baseURL() {
		return null;
	}

	public static <E extends Page> E go(final Class<E> clazz) {
		final String url = "";
		driver.get(url);
		return null;
	}

	public static <E extends Page> E verifyAt(final Class<E> clazz) {
		final PageConfiguration pageConf = PageConfigurationManager
				.loadConfig(clazz);
		if (!isAt(clazz)) {
			Assert.fail("Page verification failed");
		}

		final E page = PageFactory.initElements(driver, clazz);

		return null;
	}

	public static boolean isAt(final Class<? extends Page> clazz) {
		final PageConfiguration pageConf = PageConfigurationManager
				.loadConfig(clazz);
		final Boolean verified;
		switch (pageConf.verifyBy()) {
		case CSS:
			verified = $(pageConf.getVerifiableCSSSelector()).getText().equals(
					pageConf.getVerifiableText());
			break;
		case CUSTOM:
			try {
				verified = (Boolean) pageConf.getCustomVerifier().invoke(null);
			} catch (final Exception e) {
				throw new RuntimeException(e);
			}
			break;
		case TITLE:
			verified = driver.getTitle().equals(pageConf.getTitle());
			break;
		case URL:
			verified = driver.getTitle().equals(pageConf.getURL());
			break;
		default:
			throw new IllegalStateException("Invalid verification type");
		}
		return verified;
	}

	public static Navigator $(final String selector) {
		return new Navigator(selector);
	}
}
