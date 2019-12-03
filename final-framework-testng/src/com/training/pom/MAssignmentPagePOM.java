package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MAssignmentPagePOM extends SeleniumMethodsPOM {
	
	public MAssignmentPagePOM()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='actions']//a[1]//img[1]")
	WebElement assignmentLink;

	public MCreateAssignmentPagePOM ClickNewAssignmentLink()
	{
		assignmentLink.click();
		return new MCreateAssignmentPagePOM();
	}
}
