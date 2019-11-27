package com.training.simple.test;

import org.testng.annotations.Test;



import com.training.pom.CoursePagePOM;
import com.training.pom.SeleniumMethodsPOM;
import com.training.pom.StudentLoginPOM;

public class StudentloginTest extends SeleniumMethodsPOM {

	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		startapp();
		
	}
	
	@Test
	public void ClickingSignin() throws InterruptedException
	{
		
		new StudentLoginPOM().clicklogin();
		String message = new CoursePagePOM().getMessage();
		if(message.contains("Hello Kavitha Siva and welcome"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
	}
		
	}

	

