package com.ecommerce.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecommerce.task.core.EcommerceBaseTest;

public class EcommerceLoginTest extends EcommerceBaseTest implements EcommerceLoginConstant {

	@Test
	public void testwithSuceessInput() throws InterruptedException {
		// Thread.sleep(2000);
		// step 3 account login
		driver.findElement(By.linkText("ACCOUNT")).click();
		Thread.sleep(200);
		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys(EMAIL_ID_DATA);
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(200);

		// step 4 buy a product

		WebElement product = driver.findElement(By.linkText("PRODUCTS"));
		product.click();
		Thread.sleep(200);

		driver.findElement(By.xpath(".//*[@id='rightheader']")).click(); // select
																			// laptop

		driver.findElement(By.xpath(".//*[@id='rightcontent']/p[2]/a/img")).click();
		driver.findElement(By.xpath(".//input[@value ='Add to Cart']")).click();
		driver.findElement(By.linkText("Checkout")).click();
		Thread.sleep(300);
		Assert.assertTrue(driver.getTitle().contains("Ez Shop Online"));
		Assert.assertTrue(driver.getCurrentUrl().contains(ECOMMERCE_HOME));
	}

	@Test
	public void testwithValidUserID() throws InterruptedException {
		// Thread.sleep(2000);
		// step 3 account login
		driver.findElement(By.linkText("ACCOUNT")).click();
		Thread.sleep(300);
		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys(EMAIL_ID_DATA);
		driver.findElement(By.id("password")).sendKeys("122345");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(300);
		Assert.assertTrue(driver.getTitle().contains("Ez Shop Online"));
		Assert.assertTrue(
				driver.getCurrentUrl().contains(ECOMMERCE_HOME_UNSUCCESSFUL));

		// step 4 buy a product

		WebElement product = driver.findElement(By.linkText("PRODUCTS"));
		product.click();
		Thread.sleep(300);

		driver.findElement(By.xpath(".//*[@id='rightheader']")).click(); // select
																			// laptop

		driver.findElement(By.xpath(".//*[@id='rightcontent']/p[2]/a/img")).click();
		driver.findElement(By.xpath(".//input[@value ='Add to Cart']")).click();
		driver.findElement(By.linkText("Checkout")).click();
		Thread.sleep(300);

	}

	@Test
	public void testwithValidPassword() throws InterruptedException {

		// Thread.sleep(2000);
		// step 3 account login
		driver.findElement(By.linkText("ACCOUNT")).click();
		Thread.sleep(300);
		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys(EMAIL_DATA_UNSUCCESSFUL);
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(300);
		Assert.assertTrue(driver.getTitle().contains("Ez Shop Online"));
		Assert.assertTrue(
				driver.getCurrentUrl().contains(ECOMMERCE_HOME_UNSUCCESSFUL));
		System.out.println("Check the credentials");
		// step 4 buy a product

		WebElement product = driver.findElement(By.linkText("PRODUCTS"));
		product.click();
		Thread.sleep(300);

		driver.findElement(By.xpath(".//*[@id='rightheader']")).click(); // select
																			// laptop

		driver.findElement(By.xpath(".//*[@id='rightcontent']/p[2]/a/img")).click();
		driver.findElement(By.xpath(".//input[@value ='Add to Cart']")).click();
		driver.findElement(By.linkText("Checkout")).click();
		Thread.sleep(300);

	}

	@Test
	public void testwithBlankCredintials() throws InterruptedException {
		// Thread.sleep(2000);
		// step 3 account login
		driver.findElement(By.linkText("ACCOUNT")).click();
		Thread.sleep(200);
		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(200);
		Assert.assertTrue(driver.getTitle().contains("Ez Shop Online"));
		Assert.assertTrue(
				driver.getCurrentUrl().contains(ECOMMERCE_HOME_UNSUCCESSFUL));
		System.out.println("Check the credentials");
		// step 4 buy a product

		WebElement product = driver.findElement(By.linkText("PRODUCTS"));
		product.click();
		Thread.sleep(200);

		driver.findElement(By.xpath(".//*[@id='rightheader']")).click(); // select
																			// laptop

		driver.findElement(By.xpath(".//*[@id='rightcontent']/p[2]/a/img")).click();
		driver.findElement(By.xpath(".//input[@value ='Add to Cart']")).click();
		driver.findElement(By.linkText("Checkout")).click();
		Thread.sleep(300);
	}

	@Test
	public void testwithBlankUserID() throws InterruptedException {

		// Thread.sleep(2000);
		// step 3 account login
		driver.findElement(By.linkText("ACCOUNT")).click();
		Thread.sleep(200);
		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(200);
		Assert.assertTrue(driver.getTitle().contains("Ez Shop Online"));
		Assert.assertTrue(
				driver.getCurrentUrl().contains(ECOMMERCE_HOME_UNSUCCESSFUL));
		System.out.println("Check the credentials");
		// step 4 buy a product

		WebElement product = driver.findElement(By.linkText("PRODUCTS"));
		product.click();
		Thread.sleep(200);

		driver.findElement(By.xpath(".//*[@id='rightheader']")).click(); // select
																			// laptop

		driver.findElement(By.xpath(".//*[@id='rightcontent']/p[2]/a/img")).click();
		driver.findElement(By.xpath(".//input[@value ='Add to Cart']")).click();
		driver.findElement(By.linkText("Checkout")).click();
		Thread.sleep(300);
	}

	@Test
	public void testwithBlankPassword() throws InterruptedException {

		// Thread.sleep(2000);
		// step 3 account login
		driver.findElement(By.linkText("ACCOUNT")).click();
		Thread.sleep(200);
		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys(EMAIL_ID_DATA);
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(200);
		Assert.assertTrue(driver.getTitle().contains("Ez Shop Online"));
		Assert.assertTrue(
				driver.getCurrentUrl().contains(ECOMMERCE_HOME_UNSUCCESSFUL));
		System.out.println("Check the credentials");
		// step 4 buy a product

		WebElement product = driver.findElement(By.linkText("PRODUCTS"));
		product.click();
		Thread.sleep(200);

		driver.findElement(By.xpath(".//*[@id='rightheader']")).click(); // select
																			// laptop

		driver.findElement(By.xpath(".//*[@id='rightcontent']/p[2]/a/img")).click();
		driver.findElement(By.xpath(".//input[@value ='Add to Cart']")).click();
		driver.findElement(By.linkText("Checkout")).click();
		Thread.sleep(300);
	}
}
