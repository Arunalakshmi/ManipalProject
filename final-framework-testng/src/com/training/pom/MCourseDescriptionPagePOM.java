package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MCourseDescriptionPagePOM extends BaseClassPOM{
	
	public MCourseDescriptionPagePOM()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "course_description_title")
	WebElement title;
	@FindBy(xpath = "//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement contentframe;
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//P")
	WebElement contenttext;
	@FindBy(id = "course_description_submit")
	WebElement savelink;
	
	public MCourseDescriptionPagePOM UpdateDes_Details()
	{
		title.sendKeys("TEstSelenium");
		driver.switchTo().frame(contentframe);
		contenttext.sendKeys("TESt Please learn Selenium");
		driver.switchTo().defaultContent();
		return this;
	}
	public MDescriptionPagePOM clickSaveLink()
	{
		savelink.click();
		return new MDescriptionPagePOM();
	}

}


