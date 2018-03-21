package com.selenium.test.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class GoogleLoginBaseTest {
	protected WebDriver driver = null;

	@BeforeMethod
	
	public void setUp() {
		// step 1 create a driver
		driver = new FirefoxDriver();
	
		// step 2 open google search page
		driver.get("https://accounts.google.com/signin/v2");
	}

	@AfterMethod
	public void cleanUp() {
		// step 6 closed the browser
		driver.close();
	}

}
