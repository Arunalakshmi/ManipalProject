package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MTopicsPagePOM extends SeleniumMethodsPOM{
	
	public MTopicsPagePOM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "course_description_title")
	WebElement top_title;
	@FindBy(xpath = "//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement top_contentframe;
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//P")
	WebElement top_contenttext;
	@FindBy(id = "course_description_submit")
	WebElement top_savelink;
	
	public MTopicsPagePOM UpdateTopDetails()
	{
		top_title.sendKeys("Test 2 Selenium_top");
		driver.switchTo().frame(top_contentframe);
		top_contenttext.sendKeys("Test 2 Please learn Selenium_top");
		driver.switchTo().defaultContent();
		return this;
	}
	public MDescriptionPagePOM clickTopSaveLink()
	{
		top_savelink.click();
		return new MDescriptionPagePOM();
	}
	

}
