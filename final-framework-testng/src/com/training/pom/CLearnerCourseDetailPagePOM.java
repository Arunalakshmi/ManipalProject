package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CLearnerCourseDetailPagePOM extends SeleniumMethodsPOM{
	
	public CLearnerCourseDetailPagePOM()
	{
		PageFactory.initElements(driver, this);
	}
    //Info regd the student's course details
	public String stu_info_message;
	@FindBy(xpath = "//h3[@class='section-title']")
	WebElement info_message;
	public String get_info()
	{
		stu_info_message=info_message.getText();
		return stu_info_message;
	}
}
