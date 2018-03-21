package com.ecommerce.task;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ecommerce.task.core.EcommerceBaseTest_DP;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class EcommerceLoginTest_DP extends EcommerceBaseTest_DP implements EcommerceLoginConstant_DP {

	// data provider
	@DataProvider(name = "successfulid_dp")
	public Object[][] getSuccessfulIds() {
		String[][] idsFromSheet = getSuccessIds("ecommerceLogin.xls", "ecomm_login", "SuccessfulData");
		return idsFromSheet;
	}

	@DataProvider(name = "validUserIds_dp")
	public Object[][] getValidUserIds() {
		String[][] idsFromSheet = getValidUserIds("ecommerceLogin.xls", "ecomm_login", "ValidUserIds");
		return idsFromSheet;
	}

	@DataProvider(name = "validPasswords_dp")
	public Object[][] getValidPasswords() {
		String[][] idsFromSheet = getValidPasswords("ecommerceLogin.xls", "ecomm_login", "ValidPasswords");
		return idsFromSheet;
	}

	@DataProvider(name = "BlankCredintials_dp")
	public Object[][] getBlankCredintials() {
		String[][] idsFromSheet = getBlankCredinitals("ecommerceLogin.xls", "ecomm_login", "BlankCredinitals");
		return idsFromSheet;
	}

	@DataProvider(name = "blankUserIds_dp")
	public Object[][] getBlankUserIds() {
		String[][] idsFromSheet = getBlankUserIds("ecommerceLogin.xls", "ecomm_login", "BlankuserIds");
		return idsFromSheet;
	}

	@DataProvider(name = "blankpasswords_dp")
	public Object[][] getBlankPasswords() {
		String[][] idsFromSheet = getBlankPasswords("ecommerceLogin.xls", "ecomm_login", "BlankPasswords");
		return idsFromSheet;
	}

	// test cases
	@Test(dataProvider = "successfulid_dp")
	public void testwithSuceessInput(String userId, String password) throws InterruptedException {
		Thread.sleep(2000);
		// step 3 account login
		driver.findElement(By.linkText("ACCOUNT")).click();
		Thread.sleep(200);
		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys(userId);
		driver.findElement(By.id("password")).sendKeys(password);
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

	@Test(dataProvider = "validUserIds_dp")
	public void testwithValidUserID(String userId, String password) throws InterruptedException {
		// Thread.sleep(2000);
		// step 3 account login
		driver.findElement(By.linkText("ACCOUNT")).click();
		Thread.sleep(300);
		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys(userId);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(300);
		Assert.assertTrue(driver.getTitle().contains("Ez Shop Online"));
		Assert.assertTrue(driver.getCurrentUrl().contains(ECOMMERCE_HOME_UNSUCCESSFUL));

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

	@Test(dataProvider = "validPasswords_dp")
	public void testwithValidPassword(String userId, String password) throws InterruptedException {

		// Thread.sleep(2000);
		// step 3 account login
		driver.findElement(By.linkText("ACCOUNT")).click();
		Thread.sleep(300);
		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys(userId);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(300);
		Assert.assertTrue(driver.getTitle().contains("Ez Shop Online"));
		Assert.assertTrue(driver.getCurrentUrl().contains(ECOMMERCE_HOME_UNSUCCESSFUL));
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

	@Test(dataProvider = "BlankCredintials_dp")
	public void testwithBlankCredintials(String userId, String password) throws InterruptedException {
		// Thread.sleep(2000);
		// step 3 account login
		driver.findElement(By.linkText("ACCOUNT")).click();
		Thread.sleep(200);
		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys(userId);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(200);
		Assert.assertTrue(driver.getTitle().contains("Ez Shop Online"));
		Assert.assertTrue(driver.getCurrentUrl().contains(ECOMMERCE_HOME_UNSUCCESSFUL));
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

	@Test(dataProvider = "blankUserIds_dp")
	public void testwithBlankUserID(String userId, String password) throws InterruptedException {

		// Thread.sleep(2000);
		// step 3 account login
		driver.findElement(By.linkText("ACCOUNT")).click();
		Thread.sleep(200);
		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys(userId);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(200);
		Assert.assertTrue(driver.getTitle().contains("Ez Shop Online"));
		Assert.assertTrue(driver.getCurrentUrl().contains(ECOMMERCE_HOME_UNSUCCESSFUL));
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

	@Test(dataProvider = "blankpasswords_dp")
	public void testwithBlankPassword(String userId, String password) throws InterruptedException {

		// Thread.sleep(2000);
		// step 3 account login
		driver.findElement(By.linkText("ACCOUNT")).click();
		Thread.sleep(200);
		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys(userId);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(200);
		Assert.assertTrue(driver.getTitle().contains("Ez Shop Online"));
		Assert.assertTrue(driver.getCurrentUrl().contains(ECOMMERCE_HOME_UNSUCCESSFUL));
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

	public String[][] getSuccessIds(String xlFilePath, String sheetName, String tableName) {
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

	public String[][] getValidUserIds(String xlFilePath, String sheetName, String tableName) {
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

	public String[][] getValidPasswords(String xlFilePath, String sheetName, String tableName) {
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

	public String[][] getBlankCredinitals(String xlFilePath, String sheetName, String tableName) {
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

	public String[][] getBlankUserIds(String xlFilePath, String sheetName, String tableName) {
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

	public String[][] getBlankPasswords(String xlFilePath, String sheetName, String tableName) {
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
