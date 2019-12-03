package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MAssessmentPagePOM extends SeleniumMethodsPOM{
	
	public MAssessmentPagePOM()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[@id=\"gradebook-actions\"]/div/div[1]/a[2]/img")
	WebElement addonlineactivitybtn;
	
	public MAddOnlineActivityPagePOM clickOnlineActivityBtn()
	{
		addonlineactivitybtn.click();
		return new MAddOnlineActivityPagePOM();
		
	}

}
