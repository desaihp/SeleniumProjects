package com.login.test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.login.Constants.LoginConstant;
import com.selenium.test.core.GoogleLoginBasePage;

public class LoginPage extends GoogleLoginBasePage {
	WebDriver driver = null;
	@FindBy(id = LoginConstant.EMAIL_ID_LOCATOR)
	private WebElement emailIdELm;
	@FindBy(id = LoginConstant.NEXT_BTN_ID_LOCATOR)
	private WebElement nextBtnELm;
	@FindBy(name = LoginConstant.PASSWORD_NAME_LOCATOR)
	private WebElement passwordELm;
	@FindBy(id = LoginConstant.PASSWORD_NEXT_ID_LOCATOR)
	private WebElement passwordNextELm;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickonLogin(String emailId, String password) throws InterruptedException {
		emailIdELm.sendKeys(emailId);
		Thread.sleep(2000);
		nextBtnELm.click();
		Thread.sleep(2000);
		passwordELm.sendKeys(password);
		Thread.sleep(2000);
		passwordNextELm.click();
		Thread.sleep(2000);
	}
}
