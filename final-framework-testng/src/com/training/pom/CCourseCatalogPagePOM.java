package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CCourseCatalogPagePOM extends SeleniumMethodsPOM {

	public CCourseCatalogPagePOM() {

		PageFactory.initElements(driver, this);
	}

	// Search the courses created by you
	@FindBy(xpath = "//input[@name='search_term']")
	WebElement search_courses;

	// Writing method for the created course
	public CCourseCatalogPagePOM EnterCourseName() {
		search_courses.sendKeys("new20TESTSELENIUM");
		return this;
	}

	// clicking Search button
	@FindBy(xpath = "//div[@class='input-group']//button[1]")
	WebElement click_search_btn;

	public CCourseCatalogPagePOM ClickSearchBtn() {
		click_search_btn.click();
		return this;
	}

	// clicking Subscribe button
	@FindBy(xpath = "//a[@class='btn btn-success btn-sm']")
	WebElement click_subscribe_btn;

	public CCourseCatalogPagePOM ClickSubscribehBtn() {
		click_subscribe_btn.click();
		return this;
	}

	// successmessage for subscription
	public String sub_message;
	@FindBy(xpath = "//div[@class='alert alert-info']")
	WebElement sub_success_message;

	public String getmessage() {
		String sub_message = sub_success_message.getText();
		return sub_message;
	}

}
