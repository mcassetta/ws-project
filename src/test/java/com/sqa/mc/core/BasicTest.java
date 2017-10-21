package com.sqa.mc.core;

import java.util.concurrent.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.safari.*;
import org.testng.annotations.*;

public class BasicTest extends Core {

	/**
	 * @param test
	 */
	public BasicTest(String baseURL) {
		super(baseURL);
	}

	@Test(dataProvider = "dp")
	public void craigslistTest(String item, int minCount) {
	}

	/**
	 * DataProvider for class to make it DataDriven based on the set of data
	 * returned by this method
	 */
	@DataProvider
	public Object[][] dp() {
		return new Object[][] { //
				new Object[] { "QA Engineer", 2 },//
				new Object[] { "Java developer", 10 },//
		};//
	}

	@BeforeClass()
	public void setUpChrome() throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		// Sets up the WebDriver to use Chrome
		setDriver(new ChromeDriver());
		// Sets the baseURL to amazon.com
		setBaseUrl("http://www.amazon.com");
		// Sets up default implicit wait to wait for 30 secons
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//
		getDriver().get(this.getBaseUrl());
	}

	@BeforeClass()
	public void setUpSafari() throws Exception {
		// Sets up the WebDriver to use Safari
		setDriver(new SafariDriver());
		// Sets the baseURL to amazon.com
		setBaseUrl("http://www.amazon.com");
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
