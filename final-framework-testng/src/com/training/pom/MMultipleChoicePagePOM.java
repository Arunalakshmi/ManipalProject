package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMultipleChoicePagePOM extends SeleniumMethodsPOM {

	public MMultipleChoicePagePOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "question_admin_form_questionName")
	WebElement enterquestions;
	@FindBy(xpath = "//div[@id='cke_2_contents']//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement contentFrameMC;
	@FindBy(xpath = "//p[1]")
    WebElement first_optionbox;
//	@FindBy(xpath = "//*[@id=\'qf_b66e02\']")
//	WebElement firstoptionbox_radiobutton;
//	@FindBy(xpath = "//*[@id=\'qf_d83c7f\']")
//	WebElement secondoptionbox_radiobutton;
	@FindBy(xpath = "//div[@id='cke_4_contents']//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement contentFrameMC2;
	@FindBy(xpath = "//p[1]")
    WebElement second_optionbox;
	
	@FindBy(xpath = "//div[@id='cke_6_contents']//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement contentFrameMC3;
	@FindBy(xpath = "//p[1]")
    WebElement third_optionbox;
	
	@FindBy(xpath = "//div[@id='cke_8_contents']//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement contentFrameMC4;
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p")
	WebElement fourth_optionbox;
	@FindBy(id = "submit-question")
	WebElement addthistotest;

	public MTestaddedConfmPagePOM First_GiveDetails() {
		enterquestions.sendKeys("which course are you learning");
		driver.switchTo().frame(contentFrameMC);
//		firstoptionbox_radiobutton.click();
        first_optionbox.sendKeys("Selenium");
        driver.switchTo().defaultContent();
		//firstoptionbox_radiobutton.isSelected();
        driver.switchTo().frame(contentFrameMC2);
		second_optionbox.sendKeys("java");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(contentFrameMC3);
		third_optionbox.sendKeys("C");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(contentFrameMC4);
		fourth_optionbox.sendKeys("C++");
		driver.switchTo().defaultContent();
		
		
		addthistotest.click();
		return new MTestaddedConfmPagePOM();
	}

	public MTestaddedConfmPagePOM Second_GiveDetails() {
		enterquestions.sendKeys("which type of OOPS concept are you learning");
		driver.switchTo().frame(contentFrameMC);
        first_optionbox.sendKeys("Selenium");
        driver.switchTo().defaultContent();
		//firstoptionbox_radiobutton.isSelected();
        driver.switchTo().frame(contentFrameMC2);
//        secondoptionbox_radiobutton.click();
		second_optionbox.sendKeys("java");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(contentFrameMC3);
		third_optionbox.sendKeys("C");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(contentFrameMC4);
		fourth_optionbox.sendKeys("C++");
		driver.switchTo().defaultContent();
		
		
		addthistotest.click();
		return new MTestaddedConfmPagePOM();
	}

}
