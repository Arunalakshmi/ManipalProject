package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CLearnerDetailsPagePOM extends BaseClassPOM {
	
	public CLearnerDetailsPagePOM() {
		
		PageFactory.initElements(driver, this);
	}
	//Students course Detail icon
	@FindBy(xpath = "//tr[1]//td[7]//a[1]//img[1]")
	WebElement course_details_icon;

	public CLearnerCourseDetailPagePOM Clickicon() {
		course_details_icon.click();
		return new CLearnerCourseDetailPagePOM();
	}
	

}
