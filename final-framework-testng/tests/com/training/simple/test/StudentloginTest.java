package com.training.simple.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.CoursePagePOM;
import com.training.pom.LoginPagePOM;
import com.training.pom.SeleniumMethodsPOM;

public class StudentloginTest extends SeleniumMethodsPOM {

	@BeforeMethod
	public void BeforeMethod() {
		startapp();

	}

	@Test
	public void ClickingSignin() throws InterruptedException {

		new LoginPagePOM().clicklogin();
		String message = new CoursePagePOM().getMessage();
		if (message.contains("welcome")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

	}

}
