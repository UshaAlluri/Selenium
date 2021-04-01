package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}	
	
	@FindBy(css=".rd-navbar-wrap > .btn-primary") WebElement loginBtn;
	
	@FindBy(name="email") WebElement UserName;
	
	@FindBy(name="password") WebElement Password;
	
	@FindBy(css=".submit.button") WebElement loginButton;
	
	public void LoginToCRM(String UName, String Passwd)
	{
		loginBtn.click();
		UserName.sendKeys(UName);
		Password.sendKeys(Passwd);
		loginButton.click();
		
	}

}
