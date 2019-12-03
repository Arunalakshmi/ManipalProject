package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MStartTestPagePOM extends SeleniumMethodsPOM {
	public MStartTestPagePOM() {
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(linkText = "Start test")
	WebElement start_testLink;
	
	public MOnlineQuizPagePOM ClickStartTest()
	{
		start_testLink.click();
		return new MOnlineQuizPagePOM();
	}
}
