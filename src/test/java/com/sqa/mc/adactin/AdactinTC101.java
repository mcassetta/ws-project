package com.sqa.mc.adactin;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;

public class AdactinTC101 extends AdactinTest {

	@Test
	public void loginTest() throws InterruptedException {
		String expectedPageTitle = "AdactIn.com - Search Hotel";
		WebElement usernameField = this.getDriver().findElement(By.id("username"));
		WebElement passwordField = this.getDriver().findElement(By.id("password"));
		WebElement loginButton = this.getDriver().findElement(By.id("login"));
		usernameField.clear();
		usernameField.sendKeys(getProp("username"));
		passwordField.clear();
		passwordField.sendKeys(getProp("password"));
		loginButton.click();
		// Thread.sleep(5000);
		Assert.assertEquals(getDriver().getTitle(), expectedPageTitle);
	}
}
