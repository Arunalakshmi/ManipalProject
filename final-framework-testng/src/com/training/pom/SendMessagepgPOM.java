package com.training.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMessagepgPOM extends SeleniumMethodsPOM {
	
	public SendMessagepgPOM()  {
		PageFactory.initElements(driver, this);	
		}
	
	
//	@FindBy(xpath =("//*[@id=\'lost_password_user\']"))
//    WebElement usernamebox;
	
	@FindBy(id ="lost_password_user")
    WebElement usernamebox;
	

//	@FindBy(xpath =("//*[@id=\'lost_password_submit\']"))
//    WebElement sendmessagelink;
	
	@FindBy(id ="lost_password_submit")
    WebElement sendmessagelink;
	
	
	public LoginPagePOM TypeUserName()
	{
		usernamebox.sendKeys("kavisiva@gmail.com");
		sendmessagelink.click();
		return new LoginPagePOM();
	}
}