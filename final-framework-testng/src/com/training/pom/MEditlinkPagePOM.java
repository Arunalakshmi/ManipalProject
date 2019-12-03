package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MEditlinkPagePOM extends SeleniumMethodsPOM{

	public MEditlinkPagePOM()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "weight_mask")
	WebElement weightage;

	public MEditlinkPagePOM EnterWeightage() {
		weightage.sendKeys("3");
		return this;
	}
	
	@FindBy(id = "edit_link_form_submit")
	WebElement editbtn;
	public MAddOnlineActivityPagePOM UpdateWeightage()
	{
		editbtn.click();
		return new MAddOnlineActivityPagePOM();
		
	}
	public String edit_assess_message;
	@FindBy(xpath = "//div[@class='alert alert-success']")
	WebElement editassessmessage;
	public String getEditMessageText() {
		edit_assess_message = editassessmessage.getText();

		return edit_assess_message;
	} 
	
}
