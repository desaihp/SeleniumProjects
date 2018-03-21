package com.ecommerce.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EcommerceHome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// step 1 create the driver

		WebDriver driver = new FirefoxDriver();

		// step 2 open ecommerce website page
		driver.get("http://ecommerce.saipratap.net/");
		Thread.sleep(2000);

		// step 3 Homepage categories

		driver.findElement(By.linkText("HOME")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("CATEGORIES")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("BRANDS")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("PRODUCTS")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("MY CART")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("TRACKING")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("TRACKING")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("ACCOUNT")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("FAQ'S")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("ABOUT US")).click();
		Thread.sleep(300);

		// step 4 close the browser
		Thread.sleep(300);
		driver.close();
	}

}
