package com.ecommerce.task.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class EcommerceBaseRegistrationTest {

	public WebDriver driver = null;

	@BeforeTest
	public void setUp() throws InterruptedException {

		driver = new FirefoxDriver();

		// step 2 open ecommerce website page
		driver.get("http://ecommerce.saipratap.net/");

		WebElement accountId = driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td/div/ul/li[7]/a"));
		accountId.click();

		// step 3 click on sign up button

		WebElement signUptId = driver.findElement(By.xpath(
				"html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/table/tbody/tr[2]/td[2]/a"));
		signUptId.click();
		Thread.sleep(2000);

	}

	@AfterTest
	public void cleanUp() throws InterruptedException {
		// step 5 closed the browser
		Thread.sleep(2000);
		driver.close();
	}

}
