package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPagePOM extends SeleniumMethodsPOM {

	public ConfirmationPagePOM() {
		PageFactory.initElements(driver, this);

	}

	public String cm;

	@FindBy(xpath = "//body/main[@id='main']/section[@id='cm-content']/div[@class='container']/div[@class='row']/div[@class='col-xs-12 col-md-12']/p[1]")
	WebElement cfrm_message;

	public String getMessage() {
		cm = cfrm_message.getText();

		return cm;

	}

}
