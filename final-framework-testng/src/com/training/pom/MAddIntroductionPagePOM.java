package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MAddIntroductionPagePOM extends SeleniumMethodsPOM {

	public MAddIntroductionPagePOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='help-course']//a[@class='btn btn-default']")
	WebElement addintroductionlink;
	@FindBy(xpath = "//iframe[@class='cke_wysiwyg_frame cke_reset']")
	WebElement contentframe;
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p")
	WebElement contenttext;
	@FindBy(id = "introduction_text_intro_cmdUpdate")
	WebElement saveintrolink;
	@FindBy(xpath = "//section[@id='main_content']/../div")
	WebElement intro;
	@FindBy(xpath = "//div[@class='page-course']//p")
    WebElement introduction_text;
	@FindBy(xpath = "//a[text()='Course description']")
	WebElement courseDescriptionLink;
	
	//MediumSecondtestcase
	@FindBy(linkText = "Tests")
	WebElement testLink;
	
	//MediumFourthestcase
	@FindBy(linkText = "Assignments")
	WebElement assignmentLink;
	//MediumThirdtestcase
	@FindBy(linkText = "Assessments")
	WebElement assessLink;
	
	
	public String intromessage;
	public String givenintromessage;

	public MAddIntroductionPagePOM ClickAddintrolink() {
		addintroductionlink.click();
		return this;

	}

	public MAddIntroductionPagePOM Enterintroinfo() {
		driver.switchTo().frame(contentframe);
		contenttext.sendKeys("COBOL");
		driver.switchTo().defaultContent();
		return this;

	}
	public MAddIntroductionPagePOM clickSaveIntroLink() {
		saveintrolink.click();
		return this;
	}
	
	public String getintroMessage() {
		intromessage = intro.getText();

		return intromessage;
	}
	
	public String getintroinfoMessage() {
		givenintromessage = introduction_text.getText();

		return givenintromessage;
	}
	public MDescriptionPagePOM clickCourseDesLink() {
		courseDescriptionLink.click();
		return new MDescriptionPagePOM();
	}
	
	//mediumtestcasemethod
	public MTestPagePOM clickTestLink()
	{
		testLink.click();
		return new MTestPagePOM();
	}
	//mediumthirdcasemethod
	public MAssessmentPagePOM clickAssessmentLink()
	{
		assessLink.click();
		return new MAssessmentPagePOM();
	}
	//medium4thcasemethod
	public MAssignmentPagePOM clickAssignmentLink()
	{
		assignmentLink.click();
		return new MAssignmentPagePOM();
	}

}