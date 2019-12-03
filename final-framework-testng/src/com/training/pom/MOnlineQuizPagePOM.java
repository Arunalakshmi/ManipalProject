package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MOnlineQuizPagePOM extends SeleniumMethodsPOM{
	
public MOnlineQuizPagePOM()
{
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//input[@class='checkradios']")
WebElement questions_1_radiobn;
@FindBy(xpath = "//button[@name='save_now']")
WebElement nextQuestionslink;
@FindBy(xpath = "//input[@class='checkradios']")
WebElement questions_2_radiobn;
@FindBy(xpath = "//button[@name='save_now']")
WebElement endTestLink;


public MOnlineQuizPagePOM GoToNextQuestion() {
	
	nextQuestionslink.click();
	return this; 
}

public Boolean radioValue1() {

	Boolean rad_Val1 =questions_1_radiobn.isSelected();
	return rad_Val1;
}
public MResultPagePOM EndTest() {
	
	endTestLink.click();
	return new MResultPagePOM(); 
}
public Boolean radioValue2() {

	Boolean rad_Val2 =questions_2_radiobn.isSelected();
	return rad_Val2;
}





}
