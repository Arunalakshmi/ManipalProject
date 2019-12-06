package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MOnlineQuizPagePOM extends BaseClassPOM{
	
public MOnlineQuizPagePOM()
{
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//label/p[text()='Selenium']")
WebElement questions_1_radiobn;
@FindBy(xpath = "//button[@name='save_now']")
WebElement nextQuestionslink;
@FindBy(xpath = "//label/p[text()='java']")
WebElement questions_2_radiobn;
@FindBy(xpath = "//button[@name='save_now']")
WebElement endTestLink;


public MOnlineQuizPagePOM GoToNextQuestion() {
	
	nextQuestionslink.click();
	return this; 
}

public MOnlineQuizPagePOM radioValue1() {

	//Boolean rad_Val1 =questions_1_radiobn.isSelected();
	questions_1_radiobn.click();
	return this;
}
public MResultPagePOM EndTest() {
	
	endTestLink.click();
	return new MResultPagePOM(); 
}
public MOnlineQuizPagePOM radioValue2() {

	questions_2_radiobn.click();
	return this;
}





}
