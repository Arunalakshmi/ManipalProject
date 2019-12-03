package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MDescriptionPagePOM extends SeleniumMethodsPOM {

	public MDescriptionPagePOM() {
		PageFactory.initElements(driver, this);
	}

//descripiton web element
	@FindBy(xpath = "//div[@id='toolbar']//a[1]")
	WebElement descriptionlink;
	@FindBy(xpath = "//div[@class='alert alert-info']")
	WebElement des_info;

	// objective web element
	@FindBy(xpath = "//div[@id='toolbar']//a[2]")
	WebElement objectivelink;
	@FindBy(xpath = "//div[@class='alert alert-info']")
	WebElement obj_info;

	// topic web element
	@FindBy(xpath = "//div[@id='toolbar']//a[3]")
	WebElement topiclink;
	@FindBy(xpath = "//div[@class='alert alert-info']")
	WebElement top_info;

	// test link
	@FindBy(xpath = "//a[@id='istooldesc_9777']")
	WebElement testlink;
	
	public String desinfomessage;
	public String objinfomessage;
	public String topinfomessage;

//Description method
	public MCourseDescriptionPagePOM clickDescriptionLink() {

		descriptionlink.click();

		return new MCourseDescriptionPagePOM();
	}

	public MObjectivePagePOM clickObjectiveLink() {

		objectivelink.click();

		return new MObjectivePagePOM();
	}

	public MTopicsPagePOM clicktopiclink() {
		topiclink.click();
		return new MTopicsPagePOM();
	}
	
	public String DesText() {
		desinfomessage = des_info.getText();

		return desinfomessage;
	}
	
	public String ObjText() {
		objinfomessage = obj_info.getText();

		return objinfomessage;
	}
	
	public String TopText() {
		topinfomessage = top_info.getText();

		return topinfomessage;
	}

	// Test link method
	public MTestPagePOM clickTestlink() {
		testlink.click();
		return new MTestPagePOM();
	}

}
