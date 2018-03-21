package com.ecommerce.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EcommeceRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		// step 1 create the driver

		WebDriver driver = new FirefoxDriver();

		// step 2 open ecommerce website page
		driver.get("http://ecommerce.saipratap.net/");

		WebElement accountId = driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td/div/ul/li[7]/a"));
		accountId.click();

		// step 3 click on sign up button

		WebElement signUptId = driver.findElement(By.xpath(
				"html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/table/tbody/tr[2]/td[2]/a"));
		signUptId.click();
		Thread.sleep(2000);

		// step 4 fillup the form

		WebElement gender = driver.findElement(By.xpath(
				"html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[5]/td/table/tbody/tr[1]/td[4]/input[1]"));
		gender.sendKeys("male");
		WebElement firstName = driver.findElement(By.xpath(".//*[@id='fname']"));
		firstName.sendKeys("Harshil");
		WebElement lastName = driver.findElement(By.xpath(".//*[@id='lname']"));
		lastName.sendKeys("Desai");
		WebElement dayOfBirth = driver.findElement(By.id("day"));
		dayOfBirth.sendKeys("12");
		WebElement monthOfBirth = driver.findElement(By.id("month"));
		monthOfBirth.sendKeys("04");
		WebElement yearOfBirth = driver.findElement(By.id("year"));
		yearOfBirth.sendKeys("1992");
		WebElement emailId = driver.findElement(By.xpath(".//*[@id='email']"));
		emailId.sendKeys("harshilpdesai@gmail.com");
		// Your Details
		WebElement houseNo = driver.findElement(By.id("houseno"));
		houseNo.sendKeys("APT # L-33,");
		WebElement streetNo = driver.findElement(By.id("add1"));
		streetNo.sendKeys("2436 Nutwood Ave");
		WebElement town = driver.findElement(By.id("city"));
		town.sendKeys("Fullerton");
		WebElement county = driver.findElement(By.id("state"));
		county.sendKeys("Orange County");
		WebElement country = driver.findElement(By.id("country"));
		country.clear();
		country.sendKeys("United States");
		WebElement postCode = driver.findElement(By.id("postcode"));
		postCode.sendKeys("92831");

		// Contact Information
		WebElement tel = driver.findElement(By.id("phone"));
		tel.sendKeys("7149240733");
		WebElement tel1 = driver.findElement(By.id("fax"));
		tel1.sendKeys("7149240733");

		// password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Test@123");
		WebElement confPass = driver.findElement(By.id("cpassword"));
		confPass.sendKeys("Test@123");
		WebElement additional = driver.findElement(By.id("newsletter"));
		additional.click();
		WebElement info = driver.findElement(By.xpath(".//*[@id='newsletter']"));
		info.click();

		// Terms and conditon

		WebElement terms22 = driver.findElement(By.id("terms"));
		terms22.click();
		WebElement signUp = driver.findElement(
				By.xpath("html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[16]/td/input"));
		signUp.click(); 

		Thread.sleep(2000);
		driver.close();
	}

}
