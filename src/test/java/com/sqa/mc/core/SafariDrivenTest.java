package com.sqa.mc.core;

import java.util.concurrent.*;

import org.openqa.selenium.safari.*;
import org.testng.annotations.*;

public class SafariDrivenTest extends Core {

	/**
	 * @param test
	 */
	public SafariDrivenTest(String baseURL) {
		super(baseURL);
	}

	@BeforeClass()
	public void setUpSafari() throws Exception {
		// Sets up the WebDriver to use Safari
		setDriver(new SafariDriver());
		// Sets the baseURL to amazon.com
		setBaseUrl("http://adactin.com/HotelApp/");
		// Sets up default implicit wait to wait for 30 secons
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//
		getDriver().get(this.getBaseUrl());
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		this.driver.quit();
	}
}
