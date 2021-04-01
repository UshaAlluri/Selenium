package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ExcelDataProvider;

public class LoginTestCRM extends BaseClass{

	
	@Test
	public void loginApp()
	{
		logger=report.createTest("Login to CRM");
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		logger.info("Application is started");
		loginPage.LoginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		logger.pass("passed");
	}
}
