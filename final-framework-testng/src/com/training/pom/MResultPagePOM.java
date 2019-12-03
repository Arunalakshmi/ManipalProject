package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MResultPagePOM extends SeleniumMethodsPOM{
	
	public MResultPagePOM()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(text(),'Saved.')]")
	WebElement quiz_saved_message;
	@FindBy(xpath = "//div[@class='question-result']//div[@class='panel-body']")
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
