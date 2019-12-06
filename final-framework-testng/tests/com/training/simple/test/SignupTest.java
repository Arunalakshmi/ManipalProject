package com.training.simple.test;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import com.training.pom.ConfirmationPagePOM;
import com.training.pom.LoginPagePOM;
import com.training.pom.RegisterPagePOM;
import com.training.pom.BaseClassPOM;

public class SignupTest extends BaseClassPOM {

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
		new LoginPagePOM().clicksignup();
	}

	@Test(priority = 1)
	public void VerifyRegistration() throws InterruptedException {
		Boolean rad_check = new RegisterPagePOM().radioValue();
		Assert.assertTrue(rad_check);
		new RegisterPagePOM().UpdateForms().ClickRegister();

		String ar = new ConfirmationPagePOM().getMessage();
		if (ar.contains("Your personal settings have been registered")){
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

	}

	@AfterMethod
	public void AfterMethod() {
        logout();
        System.out.println("Logout is suceesful");
		closeBrowser();

	}

}
