package com.training.complex.tests;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;


import com.training.pom.LoginPagePOM;
import com.training.pom.RegisterPage_invalid_stu_POM;

import com.training.pom.SeleniumMethodsPOM;

public class ELTC_Complex_SecondTC extends SeleniumMethodsPOM {

	@BeforeTest
	public void BeforeTest() {
		dataSheetName="Signup_invalidusers";
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

	@Test(dataProvider="FetchData")
	public void VerifyRegistration(String FN,String LN,String Email,String UN,String PW,String CPW,String PN,String Lang) throws InterruptedException {
		Boolean rad_check = new RegisterPage_invalid_stu_POM().radioValue();
		if ( rad_check) {
			System.out.println("Student radio button is selected");
		} else {
			System.out.println("Student radio button is not selected");
		}
		
		
		new RegisterPage_invalid_stu_POM().UpdateForms(FN,LN,Email,UN,PW,CPW,PN,Lang).ClickRegister();
		System.out.println("The Registration for the username  "+FN+" is not successful" );
		
		
		

		
		

	}

	@AfterMethod
	public void AfterMethod() {

		closeBrowser();

	}

}
