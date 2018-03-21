package com.selenium.task;

import java.io.File;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.task.core.GmailTestBase_DP;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class GoogleLoginTest_DP extends GmailTestBase_DP implements GoogleLoginConstant_DP {
	 
	// data provider
	@DataProvider(name = "Success_ids_dp")
	public Object[][] getSuccessfulIds() {
		// String[][] ids = { { "harshildesai00715@gmail.com", "Harshil@12" } };

		String[][] idsFromSheet = getSuccessIds("GoogleLogin.xls", "GmailLogin", "GmailSuccessfulData");
		return idsFromSheet;
	}
	@DataProvider(name = "BlankCredentials_dp")
	public Object[][] getBlankCredentials() {
		// String[][] ids = { { " ", " " } };
		String[][] idsFromSheet = getBlankCredintialsIds("GoogleLogin.xls", "GmailLogin", "GmailBlankCredintials");
		return idsFromSheet;
	}
	@DataProvider(name = "BlankUserId_dp")
	public Object[][] getBlankUserId() {
		// String[][] ids = { { "", "Harshil@12" } };
		// return ids;
		String[][] idsFromSheet = getBlankUserIds("GoogleLogin.xls", "GmailLogin", "GmailBlankUserId");
		return idsFromSheet;
	}
	@DataProvider(name = "BlankPassword_dp")
	public Object[][] getBlankPassword() {
		// String[][] ids = { { "harshildesai00715@gmail.com", "" } };
		// return ids;
		String[][] idsFromSheet = getBlankPasswords("GoogleLogin.xls", "GmailLogin", "GmailBlankPassword");
		return idsFromSheet;
	}
	@DataProvider(name = "InvlidPassword_dp")
	public Object[][] getInvalidPassword() {
		// String[][] ids = { { "harshildesai00715@gmail.com", "Pass@123" } };
		// return ids;
		String[][] idsFromSheet = getInvalidPasswords("GoogleLogin.xls", "GmailLogin", "GmailInvalidPassword");
		return idsFromSheet;
	}
	@DataProvider(name = "InvalidUserId_dp")
	public Object[][] getInvalidUserId() {
		// String[][] ids = { { "harshildesaiu007158@gmail.com", "Harshil@12" }
		// };
		// return ids;
		String[][] idsFromSheet = getInvalidUserIds("GoogleLogin.xls", "GmailLogin", "GmailInvalidUserId");
		return idsFromSheet;
	}

	// test cases
	@Test(dataProvider = "Success_ids_dp")

	public void testwithSuccessInput(String emailID, String password) throws InterruptedException {
		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys(emailID);
		Thread.sleep(2000);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
		// getting the title
		// Assert.assertTrue(driver.getTitle().contains("Inbox"));
		// for current url
		// Assert.assertTrue(driver.getCurrentUrl().contains(MAIL_HOME));
		Thread.sleep(2000);
	}

	@Test(dataProvider = "BlankCredentials_dp")
	public void testwithBlankCreditionals(String emailId, String password) throws InterruptedException {
		 //driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys(emailId);

		Thread.sleep(2000);
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(emailId)));
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		// WebDriverWait wait1 = new WebDriverWait(driver, 10);
		// wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name(password)));
		Thread.sleep(2000);
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
		// getting the title
		// Assert.assertTrue(driver.getTitle().contains("https://accounts.google.com/signin/v2"));
		// for current url
		// Assert.assertTrue(driver.getCurrentUrl().contains("please check the
		// credintials"));
		Thread.sleep(2000);
	}

	@Test(dataProvider = "BlankUserId_dp")
	public void testwithBlankUserId(String emailId, String password) throws InterruptedException {

		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys(emailId);
		Thread.sleep(2000);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
		// getting the title
		// Assert.assertTrue(driver.getTitle().contains("https://accounts.google.com/signin/v2"));
		// for current url
		// Assert.assertTrue(driver.getCurrentUrl().contains("please check the
		// credintioals"));
		Thread.sleep(2000);
	}

	@Test(dataProvider = "BlankPassword_dp")
	public void testwithBlankPassword(String emailId, String password) throws InterruptedException {

		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys(emailId);
		Thread.sleep(2000);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
		// getting the title
		// Assert.assertTrue(driver.getTitle().contains("https://accounts.google.com/signin/v2/sl/pwd?"));
		// for current url
		// Assert.assertTrue(driver.getCurrentUrl().contains("please check the
		// credintioals"));
		Thread.sleep(2000);
	}

	@Test(dataProvider = "InvlidPassword_dp")
	public void testwithInvalidPassword(String emailId, String password) throws InterruptedException {

		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys(emailId);
		Thread.sleep(2000);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
		// getting the title
		// Assert.assertTrue(driver.getTitle().contains("https://accounts.google.com/signin/v2"));
		// for current url
		// Assert.assertTrue(driver.getCurrentUrl().contains("please check the
		// credintioals"));
		Thread.sleep(2000);
	}

	@Test(dataProvider = "InvalidUserId_dp")
	public void testwithInvalidUserId(String emailId, String password) throws InterruptedException {

		driver.findElement(By.id(EMAIL_ID_LOCATOR)).sendKeys(emailId);
		Thread.sleep(2000);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
		// getting the title
		// Assert.assertTrue(driver.getTitle().contains("https://accounts.google.com/ServiceLogin/identifier?"));
		// for current url
		// Assert.assertTrue(driver.getCurrentUrl().contains("please check the
		// credintioals"));
		Thread.sleep(2000);
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

	public String[][] getBlankCredintialsIds(String xlFilePath, String sheetName, String tableName) {
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

	public String[][] getInvalidPasswords(String xlFilePath, String sheetName, String tableName) {
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

	public String[][] getInvalidUserIds(String xlFilePath, String sheetName, String tableName) {
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
