package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MResultPagePOM extends BaseClassPOM{
	
	public MResultPagePOM()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(text(),'Saved.')]")
	WebElement quiz_saved_message;
	@FindBy(xpath = "//h3[contains(text(),'Online Quiz : Result')]")
	WebElement result_message;
	
	public String savequiz;
	public String resultmessage;
	
	public String GetQuizSaveMessage()
	{
	savequiz = 	quiz_saved_message.getText();
	return savequiz;
	}

	public String GetResultSaveMessage()
	{
		resultmessage = 	result_message.getText();
	return resultmessage;
	}
	

}
