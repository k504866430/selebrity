package com.lab49.it.selebrity.seleniumsupport;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.google.common.collect.Lists;

public class Navigator implements WebElement {

	private List<WebElement> webElements = new ArrayList<>();

	public Navigator(final String selector) {
		this.webElements = Browser.driver().findElements(
				By.cssSelector(selector));
	}

	private Navigator(final WebElement webElement) {
		this.webElements.add(webElement);
	}

	private Navigator(final List<WebElement> webElements) {
		this.webElements.addAll(webElements);
	}

	public WebElement el() {
		throwExceptionIfManyEls();
		return webElements.get(0);
	}

	public List<WebElement> els() {
		return webElements;
	}

	public Navigator find(final String selector) {
		throwExceptionIfManyEls();
		return new Navigator(el().findElements(By.cssSelector(selector)));
	}

	public String value() {
		return el().getAttribute("value");
	}

	public void value(final CharSequence... chars) {
		el().clear();
		el().sendKeys(chars);
	}

	private void throwExceptionIfManyEls() {
		if (webElements.size() > 1) {
			throw new IllegalStateException(
					"More than one web element. Cannot take action.");
		}
	}

	// Delegated methods
	@Override
	public void clear() {
		for (final WebElement webElement : webElements) {
			webElement.clear();
		}
	}

	@Override
	public void click() {
		throwExceptionIfManyEls();
		el().click();

	}

	@Override
	public String getAttribute(final String attributeName) {
		throwExceptionIfManyEls();
		return el().getAttribute(attributeName);
	}

	@Override
	public String getCssValue(final String css) {
		throwExceptionIfManyEls();
		return el().getCssValue(css);
	}

	@Override
	public Point getLocation() {
		throwExceptionIfManyEls();
		return el().getLocation();
	}

	@Override
	public Dimension getSize() {
		throwExceptionIfManyEls();
		return el().getSize();
	}

	@Override
	public String getTagName() {
		throwExceptionIfManyEls();
		return el().getTagName();
	}

	@Override
	public String getText() {
		throwExceptionIfManyEls();
		return el().getText();
	}

	@Override
	public boolean isDisplayed() {
		for (final WebElement webElement : webElements) {
			if (!webElement.isDisplayed()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isEnabled() {
		for (final WebElement webElement : webElements) {
			if (!webElement.isEnabled()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isSelected() {
		for (final WebElement webElement : webElements) {
			if (!webElement.isSelected()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void submit() {
		throwExceptionIfManyEls();
		el().submit();
	}

	/*
	 * @deprecated use find instead
	 */
	@Override
	@Deprecated
	public Navigator findElement(final By arg0) {
		throwExceptionIfManyEls();
		return new Navigator(el().findElement(arg0));
	}

	/*
	 * @deprecated use find instead
	 */
	@Override
	@Deprecated
	public List<WebElement> findElements(final By arg0) {
		throwExceptionIfManyEls();
		return Lists.newArrayList((WebElement) new Navigator(el().findElement(
				arg0)));
	}

	/*
	 * @deprecated use value method
	 */
	@Override
	@Deprecated
	public void sendKeys(final CharSequence... chars) {
		throwExceptionIfManyEls();
		el().sendKeys(chars);
	}

}
