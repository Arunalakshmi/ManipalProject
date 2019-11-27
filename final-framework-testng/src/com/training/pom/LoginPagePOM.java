package com.training.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM extends SeleniumMethodsPOM {
	
	public LoginPagePOM()  {
		PageFactory.initElements(driver, this);	
		}	
	
//	@FindBy(xpath ="//*[@id=\'login-block\']/div/ul/li[1]/a")
//    WebElement signup;
	
	@FindBy(xpath ="//a[contains(text(),'Sign up!')]")
    WebElement signup;
	
	
//	@FindBy(xpath ="//*[@id=\"login-block\"]/div/ul/li[2]/a")
//    WebElement lostmypassword;
	
	@FindBy(xpath ="//a[contains(text(),'I lost my password')]")
    WebElement lostmypassword;
	
	
	
	
	public RegisterPagePOM clicksignup()
	{
		signup.click();
		return new RegisterPagePOM();	
	}
	public SendMessagepgPOM clicklostpasswordlink()
	{
		lostmypassword.click();
		return new SendMessagepgPOM();
	}
	
			
			
	
	
}
