package com.ecommerce.task;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ecommerce.task.core.EcommerceBaseRegistrationTest;
import com.ecommerce.task.core.EcommerceBaseRegistrationTest_DP;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class EcommerceRegistrationTest_DP extends EcommerceBaseRegistrationTest_DP implements EcommerceRegistrationConstants {

	@DataProvider(name = "successfulid_dp")
	public Object[][] getSuccessfulIds() {
		String[][] idsFromSheet = getRegistrationDetails("ecommerceLogin.xls", "Registration", "RegistrationDetails");
		return idsFromSheet;
	}
	
	@Test(dataProvider = "successfulid_dp")
	public void testwithSuccessInputs(String Gender,String First_Name,String Last_Name,String B_Day,String B_Month,String B_Year,String email_id,String House_No,String Street_Name,String Town,String State,String Country,String Post_Code,String Cell_No,String Reg_No,String Password,String Conform_Password) throws InterruptedException {
Thread.sleep(2000);
		WebElement gender = driver.findElement(By.xpath(
				"html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[5]/td/table/tbody/tr[1]/td[4]/input[1]"));
		gender.sendKeys(Gender);
		//Thread.sleep(2000);
		driver.findElement(By.xpath(FIRST_NAME_LOCATOR)).sendKeys(First_Name);
		//Thread.sleep(2000);
		driver.findElement(By.xpath(LAST_NAME_LOCATOR)).sendKeys(Last_Name);
		driver.findElement(By.id(BIRTH_DAY_LOCATOR)).sendKeys(B_Day);
		driver.findElement(By.id(BIRTH_MONTH_LOCATOR)).sendKeys(B_Month);
		driver.findElement(By.id(BIRTH_YEAR_LOCATOR)).sendKeys(B_Year);
		driver.findElement(By.xpath(EMAIL_LOCATOR)).sendKeys(email_id);
		Thread.sleep(200);
		// Your Details
		driver.findElement(By.id(HOUSENO_LOCATOR)).sendKeys(House_No);
		driver.findElement(By.id(ADDRESS_LOCATOR)).sendKeys(Street_Name);
		driver.findElement(By.id(CITY_LOCATOT)).sendKeys(Town);
		driver.findElement(By.id(STATE_LOCATOR)).sendKeys(State);
		WebElement country1 = driver.findElement(By.id("country"));
		country1.clear();
		country1.sendKeys(Country);// "United States"
		driver.findElement(By.id(ZIPCODE_LOCATOR)).sendKeys(Post_Code);

		// Contact Information
		driver.findElement(By.id(USER_PHONE_DETAILS_LOCATOR)).sendKeys(Cell_No);
		driver.findElement(By.id(FAX_NO_LOCATOR)).sendKeys(Reg_No);

		// password
		driver.findElement(By.id(USER_PASSWORD_LOCATOR)).sendKeys(Password);
		driver.findElement(By.id(C_PASSWORD_LOCATOR)).sendKeys(Conform_Password);
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
	public  String[][] getRegistrationDetails(String xlFilePath, String sheetName, String tableName) {
		String[][] tabArray = null;
		try {
			Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
			Sheet sheet = workbook.getSheet(sheetName);
			int startRow, startCol, endRow, endCol, ci, cj;
			Cell tableStart = sheet.findCell(tableName);
			startRow = tableStart.getRow();
			startCol = tableStart.getColumn();

			Cell tableEnd = sheet.findCell(tableName, startCol + 1, startRow + 1, 100, 64000, false);

			endRow = tableEnd.getRow();
			endCol = tableEnd.getColumn();
			System.out.println("startRow=" + startRow + ", endRow=" + endRow + ", " + "startCol=" + startCol
					+ ", endCol=" + endCol);
			tabArray = new String[endRow - startRow - 1][endCol - startCol - 1];
			ci = 0;

			for (int i = startRow + 1; i < endRow; i++, ci++) {
				cj = 0;
				for (int j = startCol + 1; j < endCol; j++, cj++) {
					tabArray[ci][cj] = sheet.getCell(j, i).getContents();
				}
			}
		} catch (Exception e) {
			System.out.println("error in getTableArray()");
		}

		return (tabArray);
	}
	
}
