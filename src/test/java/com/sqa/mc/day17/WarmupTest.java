package com.sqa.mc.day17;

import org.testng.annotations.*;

public class WarmupTest {

	@DataProvider
	public Object[][] data() {
		return new Object[][] { new Object[] { 61, "Nike Shoes", "A pair of Nike Neon Shoes" },//
				new Object[] { 62, "Rain Coat", "A coat to wear in the rain!", 8 },//
				new Object[] { 63, "Hiking Boots", "Boots for your foots", 23 },//
				new Object[] { 64, "Candy Cane", "Too soon?", 13 },//
				new Object[] { 65, "Machette", "You can never be too careful", 18 },//
				new Object[] { 66, "Number 2 Pencil", "For to write", 25 },//
				new Object[] { 67, "Rollerblades", "These are fast!", 29 },//
				new Object[] { 68, "Umbrella", "It's going to be raining soon, I hope", 10 },//
		};//
	}

	@Test(dataProvider = "data")
	public void testItemsForSale(int id, String itemName, String description, int quantity) {
		System.out.println(id + ": " + itemName.toUpperCase());
		System.out.println("\t" + description + " (" + quantity + ")\n");
	}
}
