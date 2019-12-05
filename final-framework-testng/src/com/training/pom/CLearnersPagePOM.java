package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CLearnersPagePOM extends SeleniumMethodsPOM {

	public CLearnersPagePOM() {
		PageFactory.initElements(driver, this);
	}
    //After Clicking Followed students link, enter studnet name in keyword section
	@FindBy(xpath = "//input[@id='search_user_keyword']")
	WebElement keyword;

	public CLearnersPagePOM EnterKW() {
		keyword.sendKeys("JOSH");
		return this;
	}
	//After entering the name , click search button 
	@FindBy(xpath = "//button[@id='search_user_submit']")
	WebElement search_link;
	public CLearnersPagePOM ClickSearch() {
		search_link.click();
		return this;
	}
    //In student details, click details icon 
	@FindBy(xpath = "//a[@id='details_josh']//img")
	WebElement details_icon;

	public CLearnerDetailsPagePOM Clickicon() {
		details_icon.click();
		return new CLearnerDetailsPagePOM();
	}
	
	
	


}
