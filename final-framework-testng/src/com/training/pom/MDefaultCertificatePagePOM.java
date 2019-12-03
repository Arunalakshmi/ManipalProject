package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MDefaultCertificatePagePOM extends SeleniumMethodsPOM  {
	
	public MDefaultCertificatePagePOM()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String def_text;
	@FindBy(xpath = "//a[contains(text(),'Default certificate')]")
	WebElement defaulttext;
	
	public String getDefaultText() {
		String def_text = defaulttext.getText();
		return def_text;
		
	}

}
