package com.selenium.task.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class SeleniumTestBase {

	protected WebDriver driver = null;

	@BeforeTest
	
	public void setUp() {
		// step 1 create a driver
		driver = new FirefoxDriver();
	
		// step 2 open google search page
		driver.get("https://accounts.google.com/signin/v2");
	}

	@AfterTest
	public void cleanUp() {
		// step 6 closed the browser
		driver.close();
	}

}
