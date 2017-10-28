package com.sqa.mc.core;

import java.util.concurrent.*;

import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class FirefoxDrivenTest extends Core {

	/**
	 * @param test
	 */
	public FirefoxDrivenTest(String baseURL) {
		super(baseURL);
	}

	@BeforeClass()
	public void setUpFirefox() {
		setDriver(new FirefoxDriver());
		// Sets the baseURL
		setBaseUrl("https://www.williams-sonoma.com/");
		// Sets up default implicit wait to wait for 30 seconds
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//
		getDriver().get(this.getBaseUrl());
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		this.driver.quit();
	}
}
