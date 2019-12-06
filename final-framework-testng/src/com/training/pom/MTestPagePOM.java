package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MTestPagePOM extends BaseClassPOM {

	public MTestPagePOM() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//div[@class='actions']//a[1]//img[1]")
	WebElement createnewtestlink;
	
	public MCreateNewTestPagePOM ClickCreateTestLink()
	{
		createnewtestlink.click();
		return new MCreateNewTestPagePOM();
	}

}

