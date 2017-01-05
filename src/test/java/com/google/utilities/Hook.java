package com.google.utilities;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends Base{
	
	@Before
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"./src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
	}
	
	
	@After
	public static void tearDown() {
//		driver.quit();
	}
}
