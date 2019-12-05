package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CReportingPagePOM extends SeleniumMethodsPOM {

	public CReportingPagePOM() {

		PageFactory.initElements(driver, this);
	}
    //Click FollowStudents link 
	@FindBy(xpath = "//a[contains(text(),'Followed students')]")
	WebElement click_followstu_btn;

	public CLearnersPagePOM ClickButton() {
		click_followstu_btn.click();
		return new CLearnersPagePOM();
	}

}
