package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MAddOnlineActivityPagePOM extends BaseClassPOM {

	public MAddOnlineActivityPagePOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "create_link_select_link")
	WebElement typeOfActivityDD;

	public MAddOnlineActivityPagePOM SelectingTOADropDown() {
		selectDropDownUsingText(typeOfActivityDD, "Tests");
		return this;
	}

	@FindBy(id = "add_link_select_link")
	WebElement assessActivityDD;

	public MAddOnlineActivityPagePOM SelectingAADropDown() {
		selectDropDownUsingText(assessActivityDD, "Onlinequiz");
		return this;
	}

	@FindBy(id = "weight_mask")
	WebElement weightage;

	public MAddOnlineActivityPagePOM EnterWeightage() {
		weightage.sendKeys("1");
		return this;
	}

	@FindBy(id = "//*[@id='qf_15ecbc']")
	WebElement visibleCB;

	public Boolean visibleValue() {

		Boolean visible_Val = visibleCB.isSelected();
		return visible_Val;
	}
	@FindBy(id = "add_link_submit")
	WebElement addlink;
	
	public MAssessmentPagePOM ClickAddLink()
	{
		addlink.click();
		return new MAssessmentPagePOM();
	}
	
	public String assess_message;
	@FindBy(xpath = "//div[@class='alert alert-success']")
	WebElement assessmessage;
	public String getMessageText() {
		assess_message = assessmessage.getText();

		return assess_message;
	} 
	@FindBy(xpath = "//form[@id='form_gradebooklist_id']//a[1]//img[1]")
	WebElement edit_link;
	public MEditlinkPagePOM clickEditLink()
	{
		edit_link.click();
		return new MEditlinkPagePOM();
	}
	
	@FindBy(xpath = "//div[@class='col-sm-6 text-right']//a[2]//img[1]")
	WebElement addcertificate;
	
	public MDefaultCertificatePagePOM ClickAddCertificate()
	{
		addcertificate.click();
		return new MDefaultCertificatePagePOM();
	}
	}


