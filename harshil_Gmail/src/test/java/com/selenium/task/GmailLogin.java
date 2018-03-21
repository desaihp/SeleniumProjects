package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		System.out.println();
		
		// open gmail as a search page

		// driver.get("https://accounts.google.com/signin/v2");
		driver.get("https://mail.google.com/mail");
			
		WebElement userEmailId = driver.findElement(By.id("identifierId"));   //for email and pass
		userEmailId.sendKeys("harshilpdesai@gmail.com");
		WebElement nextBtn = driver.findElement(By.id("identifierNext"));  //for next button
		nextBtn.click();
		WebElement userPass = driver.findElement(By.name("password"));  //for password
		userPass.sendKeys("Pass@123");

		WebElement passNextBtn = driver.findElement(By.name("passwordNext"));  //next button
		passNextBtn.click();

		driver.close();

	}

}
