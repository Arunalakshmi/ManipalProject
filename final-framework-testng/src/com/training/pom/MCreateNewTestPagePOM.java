package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MCreateNewTestPagePOM extends BaseClassPOM {

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
	@FindBy(xpath = "//label[text()='At end of test']")
	WebElement feedback_rad_button;
	@FindBy(xpath= "//input[@name='activate_start_date_check']")
	WebElement starttimecheckbox;

	@FindBy(id = "pass_percentage")
	WebElement pass_percentage;
	@FindBy(id = "exercise_admin_submitExercise")
	WebElement proceedtoquestionlink;

	public MCreateNewTestPagePOM UpdateDetails() {
		testname.sendKeys("Selenium Online Quiz");
		advsettinglink.click();
		driver.switchTo().frame(testcontframe);
		testcontext.sendKeys("Mock Quiz");
		driver.switchTo().defaultContent();
		starttimecheckbox.click();
		pass_percentage.sendKeys("50");
        
		return this;

	}
	
	public MTestaddedConfmPagePOM ClickProceedLink() {
		proceedtoquestionlink.click();
		return new MTestaddedConfmPagePOM();
		
	}
	
	public Boolean FBackRadBtn()
	{
		Boolean status = feedback_rad_button.isSelected();
		return status;
	}

}
