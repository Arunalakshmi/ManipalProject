package com.training.complex.tests;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import com.training.pom.ConfirmationPagePOM;
import com.training.pom.LoginPagePOM;
import com.training.pom.RegistrationPage_MultipleUser_Stu_POM;
import com.training.pom.BaseClassPOM;

public class ELTC_Complex_FirstTC extends BaseClassPOM {

	@BeforeTest
	public void BeforeTest() {
		dataSheetName = "Signup_Student";
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

	@Test(dataProvider = "FetchData")
	public void VerifyRegistration(String FN, String LN, String Email, String UN, String PW, String CPW, String PN,
			String Lang) throws InterruptedException {
		Boolean rad_check = new RegistrationPage_MultipleUser_Stu_POM().radioValue();
		Assert.assertTrue(rad_check);

		new RegistrationPage_MultipleUser_Stu_POM().UpdateForms(FN, LN, Email, UN, PW, CPW, PN, Lang).ClickRegister();

		String ar = new ConfirmationPagePOM().getMessage();
		System.out.println("The Registration for the user " + FN + "  is sucessful :" + ar);
	}
	@AfterMethod
	public void AfterMethod() {
		logout();

		closeBrowser();

	}

}
