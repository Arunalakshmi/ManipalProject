package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MAddnewcoursepgPOM extends SeleniumMethodsPOM {

	public MAddnewcoursepgPOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "title")
	WebElement coursename;
	@FindBy(id = "advanced_params")
	WebElement advsettinglink;
	@FindBy(id = "add_course_category_code")
	WebElement categorydd;
	@FindBy(id = "add_course_wanted_code")
	WebElement coursecode;
	@FindBy(id = "add_course_course_language")
	WebElement language;
	@FindBy(xpath = "//button[@id='add_course_submit']")
	WebElement createThisCourseButton;

	public MAddnewcoursepgPOM Updatecoursedetails() {
		coursename.sendKeys("new17 TESTSELENIUM");
		advsettinglink.click();
		selectDropDownUsingText(categorydd, "Projects (PR001)");
		coursecode.sendKeys("test18");
		selectDropDownUsingText(language, "English");
		return this;
	}

	public MAddIntroductionPagePOM clickSubmit() {

		createThisCourseButton.click();

		return new MAddIntroductionPagePOM();

	}
}
