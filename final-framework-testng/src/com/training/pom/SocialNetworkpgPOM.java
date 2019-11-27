package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialNetworkpgPOM extends SeleniumMethodsPOM {

	
	
		
		
		public SocialNetworkpgPOM()
		{
			
			PageFactory.initElements(driver, this);
			
		}
//		
//		@FindBy(xpath ="//*[@id=\'profile_password0\']")
//	    WebElement pass;
//		@FindBy(xpath ="//*[@id=\'password1\']")
//	    WebElement newpass;
//		@FindBy(xpath ="//*[@id=\'profile_password2\']")
//	    WebElement confirmpass;
//		@FindBy(xpath ="//*[@id=\'profile_apply_change\']")
//	    WebElement savebutton;
//		
		@FindBy(id ="profile_password0")
	    WebElement pass;
		@FindBy(id ="password1")
	    WebElement newpass;
		@FindBy(id ="profile_password2")
	    WebElement confirmpass;
		@FindBy(id ="profile_apply_change")
	    WebElement savebutton;
		
		public String profiletext;
//		@FindBy(xpath="//*[@id=\'cm-content\']/div/div[2]/div/div[1]")
//		WebElement newprofilepage;
		
		@FindBy(xpath="//div[@class='alert alert-info']")
		WebElement newprofilesaved;
		
		
		public String getMessage()
		{
			 profiletext = newprofilesaved.getText();
			
			return profiletext;
}
		
		
		public SocialNetworkpgPOM editdetails()
		{
			pass.sendKeys("kavitha123$");
			newpass.sendKeys("aruna123$");
			confirmpass.sendKeys("aruna123$");
			
			
			return this;
			}
		
		public SocialNetworkpgPOM clicksave() {
		
		savebutton.click();
		
		return this;
		}
		
		
		
		
		
		
		
		
		
}
		