package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMessagepgPOM extends BaseClassPOM {

	public SendMessagepgPOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "lost_password_user")
	WebElement usernamebox;

	@FindBy(id = "lost_password_submit")
	WebElement sendmessagelink;

	public LoginPagePOM TypeUserName() {
		usernamebox.sendKeys("kavisiva@gmail.com");
		sendmessagelink.click();
		return new LoginPagePOM();
	}

}