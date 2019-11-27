package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialNetworkpgPOM extends SeleniumMethodsPOM {

	
	
		
		
		public SocialNetworkpgPOM()
		{
			
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(xpath ="//*[@id=\'profile_password0\']")
	    WebElement pass;
		@FindBy(xpath ="//*[@id=\'password1\']")
	    WebElement newpass;
		@FindBy(xpath ="//*[@id=\'profile_password2\']")
	    WebElement confirmpass;
		@FindBy(xpath ="//*[@id=\'profile_apply_change\']")
	    WebElement savebutton;
		
		
		
		
		public NewProfilePagePOM editdetails()
		{
			pass.sendKeys("kavitha123$");
			newpass.sendKeys("aruna123$");
			confirmpass.sendKeys("aruna123$");
			savebutton.click();
			
			return new NewProfilePagePOM();
			}
}
		