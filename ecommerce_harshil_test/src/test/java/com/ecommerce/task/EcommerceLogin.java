package com.ecommerce.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EcommerceLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// step 1 create the driver

		WebDriver driver = new FirefoxDriver();

		// step 2 open ecommerce website page
		driver.get("http://ecommerce.saipratap.net/");
		Thread.sleep(2000);
		// step 3 account login
		WebElement accountId = driver.findElement(By.linkText("ACCOUNT"));
		accountId.click();
		Thread.sleep(200);
		driver.findElement(By.id("email")).sendKeys("harshilpdesai@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.linkText("Login")).click();

		// step 4 buy a product

		WebElement product = driver.findElement(By.linkText("PRODUCTS"));
		product.click();
		Thread.sleep(200);

		driver.findElement(By.xpath(".//*[@id='rightheader']")).click(); // select
																			// laptop
																			// 2nd
		driver.findElement(By.xpath(".//*[@id='rightcontent']/p[2]/a/img")).click();
		driver.findElement(By.xpath(".//input[@value ='Add to Cart']")).click();
		driver.findElement(By.linkText("Checkout")).click();
		Thread.sleep(300);

	//step 5 closed the browser
		
		Thread.sleep(2000);
		driver.close();
	}

}
