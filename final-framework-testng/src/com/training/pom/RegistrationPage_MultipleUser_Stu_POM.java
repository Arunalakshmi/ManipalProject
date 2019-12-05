package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage_MultipleUser_Stu_POM extends SeleniumMethodsPOM {

	public RegistrationPage_MultipleUser_Stu_POM() {

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

	public RegistrationPage_MultipleUser_Stu_POM UpdateForms(String FN,String LN,String Email,String UN,String PW,String CPW,String PN,String Lang) {
		firstname.sendKeys(FN);
		lastname.sendKeys(LN);
		email.sendKeys(Email);
		username.sendKeys(UN);
		password.sendKeys(PW);
		confirmpw.sendKeys(CPW);
		phone.sendKeys(PN);
		selectDropDownUsingText(language, Lang);

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
