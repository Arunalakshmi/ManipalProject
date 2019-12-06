package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MConfirmationPageForIntrotextPOM extends BaseClassPOM {

	
	public MConfirmationPageForIntrotextPOM() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@id='istooldesc_9724']")
	WebElement coursedecriptionlink;
	
	
	public String intromessage;

	@FindBy(xpath = "//div[contains(text(),'Intro was updated')]")
	WebElement intro_message;

	public String getMessage() {
		intromessage= intro_message.getText();

		return intromessage;

	}
	
	public MDescriptionPagePOM clicklink() {
		
		coursedecriptionlink.click();
		
		return new MDescriptionPagePOM();
	}
}
