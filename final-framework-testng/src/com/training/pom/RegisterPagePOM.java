package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPagePOM extends SeleniumMethodsPOM {

	public RegisterPagePOM() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@class='register-profile']")
	WebElement radio;
	//For medium test case Teacher signup
	@FindBy(xpath = "//input[@class='register-profile']")
	WebElement teacherradio;

	@FindBy(id = "registration_firstname")
	WebElement firstname;
	@FindBy(id = "registration_lastname")
	WebElement lastname;
	@FindBy(id = "registration_email")
	WebElement email;
	@FindBy(id = "username")
	WebElement username;
	@FindBy(id = "pass1")
	WebElement password;
	@FindBy(id = "pass2")
	WebElement confirmpw;
	@FindBy(id = "registration_phone")
	WebElement phone;
	@FindBy(xpath = "//select[@id='registration_language']")
	WebElement language;
	@FindBy(id = "registration_submit")
	WebElement register;

	public RegisterPagePOM UpdateForms() {
		firstname.sendKeys("Sandy");
		lastname.sendKeys("Sandy");
		email.sendKeys("sandy@gmail.com");
		username.sendKeys("sandy");
		password.sendKeys("sandy123$");
		confirmpw.sendKeys("sandy123$");
		phone.sendKeys("9789089492");
		selectDropDownUsingText(language, "English");

		return this;
	}

	public ConfirmationPagePOM ClickRegister() throws InterruptedException {

		register.click();
		return new ConfirmationPagePOM();

	}

	public Boolean radioValue() {

		Boolean rad_Val = radio.isSelected();
		return rad_Val;
	}
	
	//medium testcase method
	public Boolean Selectteacherradiobutton() {

		Boolean radiobnTeacher_Val = teacherradio.isSelected();
		return radiobnTeacher_Val;
	}
	

}
