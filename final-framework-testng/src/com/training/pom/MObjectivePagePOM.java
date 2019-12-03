package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MObjectivePagePOM extends SeleniumMethodsPOM {

	
	public MObjectivePagePOM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "course_description_title")
	WebElement obj_title;
	@FindBy(xpath = "//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement obj_contentframe;
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//P")
	WebElement obj_contenttext;
	@FindBy(id = "course_description_submit")
	WebElement obj_savelink;
	
	public MObjectivePagePOM UpdateObj_Details()
	{
		obj_title.sendKeys("TestSelenium_obj");
		driver.switchTo().frame(obj_contentframe);
		obj_contenttext.sendKeys("Test1 Please learn Selenium_obj");
		driver.switchTo().defaultContent();
		return this;
	}
	public MDescriptionPagePOM clickSaveLink()
	{
		obj_savelink.click();
		return new MDescriptionPagePOM();
	}
	
	
}
