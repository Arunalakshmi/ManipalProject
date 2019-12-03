package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MCreateNewTestPagePOM extends SeleniumMethodsPOM {

	public MCreateNewTestPagePOM() {
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(id = "exercise_title")
	WebElement testname;
	@FindBy(id = "advanced_params")
	WebElement advsettinglink;
	@FindBy(xpath = "//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement testcontframe;
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	WebElement testcontext;
	@FindBy(xpath = "//input[@id='exerciseType_0']")
	WebElement feedback_rad_button;
	@FindBy(xpath= "//input[@name='activate_start_date_check']")
	WebElement starttimecheckbox;

	@FindBy(id = "pass_percentage")
	WebElement pass_percentage;
	@FindBy(id = "exercise_admin_submitExercise")
	WebElement proceedtoquestionlink;

	public MTestaddedConfmPagePOM UpdateDetails() {
		testname.sendKeys("Online Quiz");
		advsettinglink.click();
		driver.switchTo().frame(testcontframe);
		testcontext.sendKeys("Quiz");
		driver.switchTo().defaultContent();
       
		pass_percentage.sendKeys("50");
        proceedtoquestionlink.click();
		return new MTestaddedConfmPagePOM();

	}

}
