package com.training.simple.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import com.training.pom.CoursePagePOM;
import com.training.pom.LoginPagePOM;
import com.training.pom.SeleniumMethodsPOM;
import com.training.pom.SocialNetworkpgPOM;

public class EditMyProfileTest extends SeleniumMethodsPOM {

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

		new LoginPagePOM().clicklogin();

	}

	@Test
	public void SaveSettings() throws InterruptedException {

		new CoursePagePOM().clickprofilelink();
		String profiletext = new SocialNetworkpgPOM().editdetails().clicksave().getMessage();

		if (profiletext.contains("Your new profile has been saved")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

	}

}
