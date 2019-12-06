package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePagePOM extends BaseClassPOM {

	public CoursePagePOM() {

		PageFactory.initElements(driver, this);

	}

	public String Mycoursespage;

	@FindBy(xpath = "//section[@id='cm-content']//p[1]")
	WebElement loginsuccess_message;
	@FindBy(xpath = "//a[contains(text(),'Edit profile')]")
	WebElement profilelink;
	@FindBy(xpath = "//a[contains(text(),'Create a course')]")
	WebElement createcourselink;

	// MediumSecondtestcase
	@FindBy(xpath = "//a[contains(text(),'Selenium')]")
	WebElement clickaddedcourselink;

	// ComplexFourth test case
	@FindBy(xpath = "//a[contains(text(),'Course catalog')]")
	WebElement clickCourse_catalog_Link;
	// a[contains(text(),'Course catalog')]

	public String getMessage() {
		Mycoursespage = loginsuccess_message.getText();

		return Mycoursespage;
	}

	public SocialNetworkpgPOM clickprofilelink() {

		profilelink.click();
		return new SocialNetworkpgPOM();
	}

	public MAddnewcoursepgPOM clickCreateaCourseLink() {
		createcourselink.click();
		return new MAddnewcoursepgPOM();

	}

	// mediumsecondtestcase
	public MDescriptionPagePOM clickCourseLink() {
		clickaddedcourselink.click();
		return new MDescriptionPagePOM();

	}

	// Clicking COurse Catalog link
	public CCourseCatalogPagePOM ClickCCLink() {
		clickCourse_catalog_Link.click();
		return new CCourseCatalogPagePOM();
	}
}
