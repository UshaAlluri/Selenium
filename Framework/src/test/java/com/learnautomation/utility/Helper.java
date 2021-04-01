package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.utils.FileUtil;


public class Helper {

	public static String captureScreenShot(WebDriver driver)
	{
		TakesScreenshot s=(TakesScreenshot)driver;
		File src=s.getScreenshotAs(OutputType.FILE);
		String screenShotPath=System.getProperty("user.dir")+"/Screenshots/FreeCRM_"+getCurrentDateTime()+".png";
		try {
			org.openqa.selenium.io.FileHandler.copy(src, new File(screenShotPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to capture screenshot"+e.getMessage());
		}
		return screenShotPath;
	}
	public static String getCurrentDateTime()
	{
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate=new Date();
		return customFormat.format(currentDate);
	}
	
}
