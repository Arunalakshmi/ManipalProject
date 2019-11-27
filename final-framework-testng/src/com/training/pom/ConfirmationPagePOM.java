package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPagePOM extends SeleniumMethodsPOM {
	
	public ConfirmationPagePOM()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String cm;
	@FindBy(xpath="//*[@id='cm-content']/div/div[2]/div")
	WebElement cfrm_message;
	
	public String getMessage()
	{
		 cm = cfrm_message.getText();
		
		return cm;
		
		
	}
	
	}


