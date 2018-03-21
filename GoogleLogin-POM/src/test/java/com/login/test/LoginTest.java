package com.login.test;

import org.testng.annotations.Test;

import com.selenium.test.core.GoogleLoginBaseTest;

public class LoginTest extends GoogleLoginBaseTest {
	@Test(priority=1)
	public void testSucessfulLogin() throws InterruptedException {
		LoginPage page = new LoginPage(driver);
		page.clickonLogin("harshildesai00715@gmail.com", "Harshil@12");
	}

	@Test(priority=2)
	public void testBlankCredintials() throws InterruptedException {
		LoginPage page = new LoginPage(driver);
		page.clickonLogin(" ", " ");
	}
	@Test(priority=3)
	public void testWithBlankUserId() throws InterruptedException {
		LoginPage page = new LoginPage(driver);
		page.clickonLogin("", "Harshil@12");
	}
	@Test(priority=4)
	public void testWithBlankPassword() throws InterruptedException {
		LoginPage page = new LoginPage(driver);
		page.clickonLogin("harshildesai00715@gmail.com", "");
	}
	@Test(priority=5)
	public void testInvalidPassword() throws InterruptedException {
		LoginPage page = new LoginPage(driver);
		page.clickonLogin("harshildesai00715@gmail.com", "Pass@123");
	}
	@Test(priority=6)
	public void testInvalidUserId() throws InterruptedException {
		LoginPage page = new LoginPage(driver);
		page.clickonLogin("harshildesai007@gmail.com", "Harshil@123");
	}
}
