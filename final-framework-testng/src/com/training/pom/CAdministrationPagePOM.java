package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CAdministrationPagePOM extends SeleniumMethodsPOM {

	public CAdministrationPagePOM() {
		PageFactory.initElements(driver, this);
	}

	// Click Reporting Tab
	@FindBy(xpath = "//a[contains(text(),'Reporting')]")
	WebElement click_Report_Link;

	public CReportingPagePOM ClickReportLink() {

		click_Report_Link.click();
		return new CReportingPagePOM();

	}

}
