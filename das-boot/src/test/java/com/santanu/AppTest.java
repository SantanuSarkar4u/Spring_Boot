package com.santanu;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.santanu.controller.HomeController;

public class AppTest {
	
	@Test
	public void testApp() {
		HomeController homeController = new HomeController();
		String result = homeController.home();
		assertEquals(result, "Das Boot, reporting for Duty");
	}

}
