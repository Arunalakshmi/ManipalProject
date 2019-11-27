package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPagePOM extends SeleniumMethodsPOM {
	
	
	public RegisterPagePOM()
	{
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath =("//*[@id=\'registration_firstname\']"))
    WebElement firstname;
	@FindBy(xpath ="//*[@id=\'registration_lastname\']")
    WebElement lastname;
	@FindBy(xpath ="//*[@id=\'registration_email\']")
    WebElement email;
	@FindBy(xpath ="//*[@id=\"username\"]")
    WebElement username;
	@FindBy(xpath ="//*[@id=\'pass1\']")
    WebElement password;
	@FindBy(xpath ="//*[@id=\'pass2\']")
    WebElement confirmpw;
	@FindBy(xpath ="//*[@id=\'registration_phone\']")
    WebElement phone;
	//@FindBy(xpath ="//*[@id=\'registration\']/fieldset/div[9]/div[1]/div/button/div/div/div")
    //WebElement language;
	@FindBy(xpath ="//*[@id=\'registration_submit\']")
    WebElement register;
	

	
	public RegisterPagePOM UpdateForms()
	{
		firstname.sendKeys("Kavitha");
		lastname.sendKeys("Siva");
		email.sendKeys("kavisiva@gmail.com");
		username.sendKeys("kavisiva");
		password.sendKeys("kavitha123$");
		confirmpw.sendKeys("kavitha123$");
		phone.sendKeys("9943107030");
		//language.sendKeys("English");
		return this;
		}
	
	public ConfirmationPagePOM ClickRegister() throws InterruptedException
	{
		
		register.click();
		return new ConfirmationPagePOM();
		
	}
	
	
}
