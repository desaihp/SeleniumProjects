package com.ecommerce.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecommerce.task.core.EcommerceBaseRegistrationTest;

public class EcommerceRegistrationTest extends EcommerceBaseRegistrationTest implements EcommerceRegistrationConstants {

	@Test
	public void testwithSuccessInputs() {

		WebElement gender = driver.findElement(By.xpath(
				"html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[5]/td/table/tbody/tr[1]/td[4]/input[1]"));
		gender.sendKeys("male");
		driver.findElement(By.xpath(FIRST_NAME_LOCATOR)).sendKeys(REG_FIRSTNAME_DATA);
		driver.findElement(By.xpath(LAST_NAME_LOCATOR)).sendKeys(LAST_NAME_DATA);
		driver.findElement(By.id(BIRTH_DAY_LOCATOR)).sendKeys(BIRTHDAY_DATA);
		driver.findElement(By.id(BIRTH_MONTH_LOCATOR)).sendKeys(BIRTH_MONTH_DATA);
		driver.findElement(By.id(BIRTH_YEAR_LOCATOR)).sendKeys(BIRTH_YEAR_DATA);
		driver.findElement(By.xpath(EMAIL_LOCATOR)).sendKeys(USER_EMAILID_DATA);
		// Your Details
		driver.findElement(By.id(HOUSENO_LOCATOR)).sendKeys(HOUSENO_DATA);
		driver.findElement(By.id(ADDRESS_LOCATOR)).sendKeys(USER_ADDRESS_DATA);
		driver.findElement(By.id(CITY_LOCATOT)).sendKeys(CITY_DATA);
		driver.findElement(By.id(STATE_LOCATOR)).sendKeys(COUNTY_DATA);
		WebElement country = driver.findElement(By.id("country"));
		country.clear();
		country.sendKeys("United States");
		driver.findElement(By.id(ZIPCODE_LOCATOR)).sendKeys(ZIP_CODE_DATA);

		// Contact Information
		driver.findElement(By.id(USER_PHONE_DETAILS_LOCATOR)).sendKeys(CELLNO_DATA);
		driver.findElement(By.id(FAX_NO_LOCATOR)).sendKeys(CELLNO_DATA);

		// password
		driver.findElement(By.id(USER_PASSWORD_LOCATOR)).sendKeys(USER_PASSWORD_DATA);
		driver.findElement(By.id(C_PASSWORD_LOCATOR)).sendKeys(USER_PASSWORD_DATA);
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.xpath(".//*[@id='newsletter']")).click();

		// Terms and conditon

		driver.findElement(By.id("terms")).click();
		WebElement signUp = driver.findElement(
				By.xpath("html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[16]/td/input"));
		signUp.click();

		Assert.assertTrue(driver.getTitle().contains("Ez Shop Online"));
		Assert.assertTrue(driver.getCurrentUrl().contains(ECOMMERCE_HOME));
		System.out.println("Sign up successful");

	}
}
