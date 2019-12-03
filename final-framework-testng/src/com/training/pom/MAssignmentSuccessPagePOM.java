package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MAssignmentSuccessPagePOM extends SeleniumMethodsPOM{
	
	public MAssignmentSuccessPagePOM()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String assignment_message;
	@FindBy(xpath = "//div[@class='alert alert-success']")
	WebElement ass_text;
	public String GetSuccessMessage() {
		
		String assignment_message = ass_text.getText();
		return assignment_message;
		//Directory created
	}

	@FindBy(xpath = "//div[@class='alert alert-success']")
	WebElement edit_link;
	public MCreateAssignmentPagePOM  ClickEditLink() {
		edit_link.click();
		
		return new MCreateAssignmentPagePOM();
	}
	public String update_success;
	@FindBy(className = "alert alert-success")
	WebElement update_text;
	public String GetUpdateSuccessMessage() {
		
		String update_success = update_text.getText();
		return update_success;
		//Update successful
	}
	
}
