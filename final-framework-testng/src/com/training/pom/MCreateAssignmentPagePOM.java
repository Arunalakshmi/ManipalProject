package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MCreateAssignmentPagePOM extends SeleniumMethodsPOM {

	public MCreateAssignmentPagePOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "form1_new_dir")
	WebElement assign_name;

	public MCreateAssignmentPagePOM EnterAssignmentName() {
		assign_name.sendKeys("Handson Exercises");
		return this;
	}

	@FindBy(xpath = "//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement desFrame;

	public MCreateAssignmentPagePOM MovetoFrame() {
		driver.switchTo().frame(desFrame);
		return this;
	}

	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p")
	WebElement desContext;

	public MCreateAssignmentPagePOM EnterText() {
		desContext.sendKeys("Exercises");
		driver.switchTo().defaultContent();
		return this;
	}

	@FindBy(xpath = "//button[@id='advanced_params']")
	WebElement adv_link;

	public MCreateAssignmentPagePOM ClickAdvSettingLink() {
		adv_link.click();
		return this;
	}

	@FindBy(id = "form1_qualification")
	WebElement max_score;

	public MCreateAssignmentPagePOM EnterMaxScore() {
		max_score.sendKeys("50");

		return this;
	}
	
	
	@FindBy(id = "form1_submit")
	WebElement validate_btn;

	public MAssignmentSuccessPagePOM ClickValidateBn() {
		validate_btn.click();

		return new MAssignmentSuccessPagePOM();
	}
	@FindBy(id = "form1_qualification")
	WebElement update_max_score;

	public MCreateAssignmentPagePOM EditMaxScore() {
		update_max_score.sendKeys("60");

		return this;
	}

}
