package com.ecommerce.task.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class EcommerceBaseTest {
	protected WebDriver driver = null;

	@BeforeTest
	public void setUp() {

		// step 1 create the driver

		driver = new FirefoxDriver();

		// step 2 open ecommerce website page
		driver.get("http://ecommerce.saipratap.net/");

	}

	@AfterTest
	public void cleanUp() throws InterruptedException {
		// step 5 closed the browser
		Thread.sleep(2000);
		driver.close();
	}

}
