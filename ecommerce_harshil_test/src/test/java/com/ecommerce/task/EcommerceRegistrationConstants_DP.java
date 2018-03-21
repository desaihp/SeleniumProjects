package com.ecommerce.task;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public interface EcommerceRegistrationConstants_DP {
	// locators
	String FIRST_NAME_LOCATOR = ".//*[@id='fname']";
	String LAST_NAME_LOCATOR = ".//*[@id='lname']";
	String C_PASSWORD_LOCATOR = "cpassword";
	String USER_PASSWORD_LOCATOR = "password";
	String FAX_NO_LOCATOR = "fax";
	String USER_PHONE_DETAILS_LOCATOR = "phone";
	String ZIPCODE_LOCATOR = "postcode";
	String STATE_LOCATOR = "state";
	String CITY_LOCATOT = "city";
	String ADDRESS_LOCATOR = "add1";
	String HOUSENO_LOCATOR = "houseno";
	String EMAIL_LOCATOR = ".//*[@id='email']";
	String BIRTH_YEAR_LOCATOR = "year";
	String BIRTH_MONTH_LOCATOR = "month";
	String BIRTH_DAY_LOCATOR = "day";

	// data
	String REG_FIRSTNAME_DATA = "Harshil";
	String LAST_NAME_DATA = "Desai";
	String USER_PASSWORD_DATA = "Test@123";
	String CELLNO_DATA = "7149240733";
	String ZIP_CODE_DATA = "92831";
	String COUNTY_DATA = "Orange County";
	String CITY_DATA = "Fullerton";
	String USER_ADDRESS_DATA = "2436 Nutwood Ave";
	String HOUSENO_DATA = "APT # L-33,";
	String USER_EMAILID_DATA = "harshilpdesai@gmail.com";
	String BIRTH_YEAR_DATA = "1992";
	String BIRTH_MONTH_DATA = "04";
	String BIRTHDAY_DATA = "12";

	// verification data
	String ECOMMERCE_HOME = "http://ecommerce.saipratap.net/customer.php";
	


}
