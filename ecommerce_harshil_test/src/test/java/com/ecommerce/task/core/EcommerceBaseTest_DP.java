package com.ecommerce.task.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class EcommerceBaseTest_DP {
	protected WebDriver driver = null;

	@BeforeMethod
	public void setUp() {

		// step 1 create the driver

		driver = new FirefoxDriver();

		// step 2 open ecommerce website page
		driver.get("http://ecommerce.saipratap.net/");

	}

	@AfterMethod
	
	public void cleanUp() throws InterruptedException {
		// step 5 closed the browser
		Thread.sleep(2000);
		driver.close();
	}

	public String[][] getSuccessIds(String xlFilePath, String sheetName, String tableName) {
		// TODO Auto-generated method stub
		return null;
	}

}
