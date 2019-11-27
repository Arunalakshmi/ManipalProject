package com.training.simple.test;

import org.testng.annotations.Test;


import com.training.pom.CoursePagePOM;
import com.training.pom.LoginPagePOM;
import com.training.pom.SeleniumMethodsPOM;
import com.training.pom.SocialNetworkpgPOM;

public class EditMyProfileTest extends SeleniumMethodsPOM {

	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		startapp();
		
		new LoginPagePOM().clicklogin();
		
	}
	
	@Test
	public void SaveSettings() throws InterruptedException
	{
		
		new CoursePagePOM().clickprofilelink();
		String profiletext = new SocialNetworkpgPOM().editdetails().clicksave().getMessage();
		
		if(profiletext.contains("Your new profile has been saved"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
	}
		
	}





