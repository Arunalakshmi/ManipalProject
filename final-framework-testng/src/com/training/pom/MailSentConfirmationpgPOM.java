package com.training.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailSentConfirmationpgPOM extends SeleniumMethodsPOM {
	
	public MailSentConfirmationpgPOM()  {
		PageFactory.initElements(driver, this);	
		}
	
	
	public String mailacknowledge;
//	@FindBy(xpath="//*[@id=\'cm-content\']/div/div[2]/div[1]/div/div")
//	WebElement acknowledgemessage;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	WebElement acknowledgemessage;
	
	public String getMessage()
	{
		mailacknowledge =acknowledgemessage.getText();
		
		return mailacknowledge;
}
}
	