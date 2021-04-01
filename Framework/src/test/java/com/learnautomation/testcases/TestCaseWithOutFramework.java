package com.learnautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithOutFramework {

	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\MySeleniumProject\\Framework\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Selenium_50");
		driver.findElement(By.name("password")).sendKeys("Abcd@123456");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.quit();
	}
}
