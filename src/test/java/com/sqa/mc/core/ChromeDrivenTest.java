package com.sqa.mc.core;

import java.util.concurrent.*;

import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

public class ChromeDrivenTest extends Core {

	/**
	 * @param test
	 */
	public ChromeDrivenTest(String baseURL) {
		super(baseURL);
	}

	@BeforeClass()
	public void setUpChrome() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		// Sets up the WebDriver to use Chrome
		setDriver(new ChromeDriver());
		// Sets the baseURL to amazon.com
		setBaseUrl("http://adactin.com/HotelApp/index.php");
		// Sets up default implicit wait to wait for 30 secons
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//
		getDriver().get(this.getBaseUrl());
	}

	// @BeforeClass()
	// public void setUpSafari() throws Exception {
	// // Sets up the WebDriver to use Safari
	// setDriver(new SafariDriver());
	// // Sets the baseURL to amazon.com
	// setBaseUrl("http://www.amazon.com");
	// // Sets up default implicit wait to wait for 30 secons
	// getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	// //
	// getDriver().get(this.getBaseUrl());
	// }
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		this.driver.quit();
	}
}
