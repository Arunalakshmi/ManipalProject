package com.training.simple.test;

import org.testng.annotations.Test;


import com.training.pom.CoursePagePOM;
import com.training.pom.NewProfilePagePOM;
import com.training.pom.SeleniumMethodsPOM;
import com.training.pom.SocialNetworkpgPOM;
import com.training.pom.StudentLoginPOM;

public class EditMyProfileTest extends SeleniumMethodsPOM {

	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		startapp();
		
		new StudentLoginPOM().clicklogin();
		
	}
	
	@Test
	public void SaveSettings() throws InterruptedException
	{
		
		new CoursePagePOM().clickprofilelink();
		new SocialNetworkpgPOM().editdetails();
		
		String profiletext = new NewProfilePagePOM().getMessage();
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





