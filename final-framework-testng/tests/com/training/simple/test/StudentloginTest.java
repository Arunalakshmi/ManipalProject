package com.training.simple.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.CoursePagePOM;
import com.training.pom.LoginPagePOM;
import com.training.pom.BaseClassPOM;

public class StudentloginTest extends BaseClassPOM {

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
	
	@AfterMethod
	public void AfterMethod() {
        logout();
        System.out.println("Logout is successful");
        
		closeBrowser();

	}


}
