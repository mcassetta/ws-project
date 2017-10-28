package com.sqa.mc;

import org.testng.annotations.*;

import com.sqa.mc.core.*;

public class WilliamSonomaTest extends FirefoxDrivenTest {

	/**
	 * @param baseURL
	 */
	public WilliamSonomaTest(String baseURL) {
		super(baseURL);
		// TODO Auto-generated constructor stub
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" },//
				new Object[] { 2, "b" },//
		};//
	}

	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
	}
}
