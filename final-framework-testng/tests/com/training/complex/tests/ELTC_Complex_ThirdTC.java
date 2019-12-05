package com.training.complex.tests;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import com.training.pom.ConfirmationPagePOM;
import com.training.pom.LoginPagePOM;
import com.training.pom.RegisterPg_MultipleTea_POM;

import com.training.pom.SeleniumMethodsPOM;

public class ELTC_Complex_ThirdTC extends SeleniumMethodsPOM {

	@BeforeTest
	public void BeforeTest() {
		dataSheetName="Signup_teacher";
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
		
		
		Boolean teacher_rad_check = new RegisterPg_MultipleTea_POM().Selectteacherradiobutton();
		if (teacher_rad_check) {
			System.out.println("Teacher radio button is selected");
		}
		else
		{
			System.out.println("Teacher radio button is not selected");
		}
		new RegisterPg_MultipleTea_POM().UpdateForms(FN,LN,Email,UN,PW,CPW,PN,Lang).ClickRegister();
//		Boolean teacher_rad_check = new RegisterPg_MultipleTea_POM().Selectteacherradiobutton();
//		if (teacher_rad_check) {
//			System.out.println("Teacher radio button is selected");
//		}
//		else
//		{
//			System.out.println("Teacher radio button is not selected");
//		}
		
        String ar = new ConfirmationPagePOM().getMessage();
		System.out.println("The Registration for the user "+FN+"  is sucessful :"+ar);
		if (ar.contains("Your personal settings have been registered")) {
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
