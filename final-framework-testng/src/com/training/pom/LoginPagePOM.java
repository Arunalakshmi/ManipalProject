package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM extends SeleniumMethodsPOM {

	public LoginPagePOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Sign up!')]")
	WebElement signup;

	@FindBy(xpath = "//a[contains(text(),'I lost my password')]")
	WebElement lostmypassword;

	@FindBy(id = "login")
	WebElement username;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(id = "form-login_submitAuth")
	WebElement login;
	public String mailacknowledge;

	@FindBy(xpath = "//div[@class='alert alert-info']")
	WebElement acknowledgemessage;

	// For MediumTestcase to click create a course link
	@FindBy(xpath = "//a[contains(text(),'Create a course')]")
	WebElement createcourselink;

	public String getMessage() {
		mailacknowledge = acknowledgemessage.getText();

		return mailacknowledge;
	}

//student login 
	public CoursePagePOM clicklogin() {
		username.sendKeys("abiarun");
		password.sendKeys("abi123$");
		login.click();
		return new CoursePagePOM();

	}
	//teacher login 
	public CoursePagePOM clicklogin1() {
		username.sendKeys("nikitha");
		password.sendKeys("nikitha123$");
		login.click();
		return new CoursePagePOM();

	}

	public RegisterPagePOM clicksignup() {
		signup.click();
		return new RegisterPagePOM();
	}

	public SendMessagepgPOM clicklostpasswordlink() {
		lostmypassword.click();
		return new SendMessagepgPOM();
	}

}
