package com.sqa.mc.core;

import org.apache.log4j.*;
import org.openqa.selenium.*;

import com.sqa.mc.helpers.*;

public class Core {

	private static int count = 1;

	public static int getCount() {
		return count;
	}

	private String baseUrl;

	protected WebDriver driver;

	private FirefoxDrivenTest curTest;

	private Logger log = Logger.getLogger(this.getClass());

	public Core(FirefoxDrivenTest test) {
		this.curTest = test;
		this.baseUrl = test.getBaseUrl();
		this.driver = test.getDriver();
	}

	public Core(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public Core(String baseUrl, WebDriver driver) {
		super();
		this.baseUrl = baseUrl;
		this.driver = driver;
	}

	public String getBaseUrl() {
		return this.baseUrl;
	}

	public FirefoxDrivenTest getCurTest() {
		return this.curTest;
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public Logger getLog() {
		return this.log;
	}

	// Method checks if an element is present on the page. e.g. pop up ad
	public boolean isElementPresent(String xpathString) {
		return AutoBasics.isElementPresent(getDriver(), By.xpath(""), getLog());
	}

	public void takeScreenshot() {
		AutoBasics.takeScreenshot("screenshots/", "Craigslist Test", count, getDriver(), this.getLog());
		count++;
	}

	public void takeScreenshot(String name) {
		AutoBasics.takeScreenshot("screenshots/", name, count, getDriver(), this.getLog());
		count++;
	}

	protected void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	protected void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
