package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MTestaddedConfmPagePOM extends SeleniumMethodsPOM {

	public MTestaddedConfmPagePOM() {
		PageFactory.initElements(driver, this);
	}

	public String cm_message;
	public String quiz1_added;
	public String quiz2_added;
	@FindBy(xpath = "//div[@class='alert alert-success']")
	WebElement test_cmmessage;
	@FindBy(xpath = "//section[@id='cm-content']//li[1]//div[1]//a[1]//img[1]")
	WebElement multiplechoicelink;
	@FindBy(xpath = "//div[@class='alert alert-info']")
	WebElement que1_quiz_added_message;
	@FindBy(xpath = "//div[@class='alert alert-info']")
	WebElement que2_quiz_added_message;

	@FindBy(xpath = "//div[@class='actions']//a[2]//img[1]")
	WebElement clickPreviewBtn;
	

	public String getMessage() {
		cm_message = test_cmmessage.getText();

		return cm_message;
	}

	public MMultipleChoicePagePOM ClickMClink() {
		multiplechoicelink.click();
		return new MMultipleChoicePagePOM();
	}
	public String getQuizMessage1() {
		quiz1_added = que1_quiz_added_message.getText();

		return quiz1_added;
	}
	public String getQuizMessage2() {
		quiz2_added = que2_quiz_added_message.getText();

		return quiz2_added;
	}
	public MStartTestPagePOM ClickPreviewButton() {
		clickPreviewBtn.click();
		return new MStartTestPagePOM();
	}
	
}