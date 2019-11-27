package com.training.test;

import org.testng.annotations.Test;


import com.training.pom.ConfirmationPagePOM;
import com.training.pom.LoginPagePOM;
import com.training.pom.RegisterPagePOM;
import com.training.pom.SeleniumMethodsPOM;

public class SignupTest extends SeleniumMethodsPOM {

	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		startapp();
		new LoginPagePOM().clicksignup();
	}
	
	@Test
	public void VerifyRegistration() throws InterruptedException
	{
		new RegisterPagePOM().UpdateForms()
		.ClickRegister();
		String ar = new ConfirmationPagePOM().getMessage();
		if(ar.contains("Dear Kavitha Siva"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
	}
	

	

}
