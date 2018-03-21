package com.selenium.task;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selenium.task.core.SeleniumTestBase;

public class GoogleLoginTest_TestNG extends SeleniumTestBase implements GoogleLoginConstant {

	@Test(priority = 1)

	public void testwithSuccessInput() throws InterruptedException {
		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys("harshildesai00715@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Harshil@12");
		Thread.sleep(2000);
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void testwithBlankCreditionals() throws InterruptedException {

		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys(""); // for email
		Thread.sleep(2000); // and pass
		driver.findElement(By.id("identifierNext")).click(); // for next button
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(""); // for password
		Thread.sleep(2000);
		driver.findElement(By.id("passwordNext")).click(); // next button
		Thread.sleep(2000);
		// getting the title
		// Assert.assertTrue(driver.getTitle().contains("https://accounts.google.com/signin/v2"));
		// for current url
		// Assert.assertTrue(driver.getCurrentUrl().contains("please check the
		// credintials"));
		Thread.sleep(2000);

	}

	@Test(priority = 3)
	public void testwithBlankUserId() throws InterruptedException {

		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys("");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("Harshil@12");
		Thread.sleep(4000);
		driver.findElement(By.id("passwordNext")).click();
		// getting the title
		// Assert.assertTrue(driver.getTitle().contains("https://accounts.google.com/signin/v2"));
		// for current url
		// Assert.assertTrue(driver.getCurrentUrl().contains("please check the
		// credintioals"));
		Thread.sleep(4000);

	}

	@Test(priority = 4)
	public void testwithBlankPassword() throws InterruptedException {

		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys("harshildesai00715@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys(" ");
		Thread.sleep(4000);
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(4000);
		// getting the title
		// Assert.assertTrue(driver.getTitle().contains("https://accounts.google.com/signin/v2/sl/pwd?"));
		// for current url
		// Assert.assertTrue(driver.getCurrentUrl().contains("please check the
		// credintioals"));
		Thread.sleep(4000);

	}

	@Test(priority = 5)
	public void testwithInvalidPassword() throws InterruptedException {

		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys("harshildesai00715@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("Pass@123");
		Thread.sleep(4000);
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(4000);
		// getting the title
		// Assert.assertTrue(driver.getTitle().contains("https://accounts.google.com/signin/v2"));
		// for current url
		// Assert.assertTrue(driver.getCurrentUrl().contains("please check the
		// credintioals"));
		Thread.sleep(4000);
	}

	@Test(priority = 6)
	public void testwithInvalidUserId() throws InterruptedException {

		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys("harshildesaui@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("Harshil@12");
		Thread.sleep(4000);
		driver.findElement(By.id("passwordNext")).click(); 
		Thread.sleep(4000);
		// getting the title
		// Assert.assertTrue(driver.getTitle().contains("https://accounts.google.com/ServiceLogin/identifier?"));
		// for current url
		// Assert.assertTrue(driver.getCurrentUrl().contains("please check the
		// credintioals"));
		Thread.sleep(4000);

	}

}
