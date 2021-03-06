package com.training.simple.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.training.pom.LoginPagePOM;
import com.training.pom.BaseClassPOM;
import com.training.pom.SendMessagepgPOM;

public class LostMyPasswordTest extends BaseClassPOM {

	@BeforeTest
	public void BeforeTest() {
		System.out.println("This is Before Test");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("This is Before Class");
	}

	@BeforeMethod
	public void BeforeMethod() {
		startapp();

	}

	@Test(priority = 3)
	public void SendingMessage() throws InterruptedException {
		new LoginPagePOM().clicklostpasswordlink();
		new SendMessagepgPOM().TypeUserName();

		String messageinfo = new LoginPagePOM().getMessage();
		if (messageinfo.contains(
				"This platform was unable to send the email. Please contact Site Owner for more information.")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		

	}
	@AfterMethod
	public void AfterMethod() {
       
		closeBrowser();

}
}
