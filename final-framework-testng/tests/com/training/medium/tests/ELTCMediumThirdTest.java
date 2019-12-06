package com.training.medium.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.pom.ConfirmationPagePOM;
import com.training.pom.CoursePagePOM;
import com.training.pom.LoginPagePOM;
import com.training.pom.MAddIntroductionPagePOM;
import com.training.pom.MAddOnlineActivityPagePOM;
import com.training.pom.MAssessmentPagePOM;
import com.training.pom.MDefaultCertificatePagePOM;
import com.training.pom.MEditlinkPagePOM;
import com.training.pom.BaseClassPOM;

public class ELTCMediumThirdTest extends BaseClassPOM {
	
	public ELTCMediumThirdTest()
	{
		PageFactory.initElements(driver, this);
	}
	
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
		new LoginPagePOM().clicklogin1();
		new CoursePagePOM().clickCourseLink();
	}
	@Test
	public void VerifyAssessment()
	{
		new MAddIntroductionPagePOM().clickAssessmentLink();
		new MAssessmentPagePOM().clickOnlineActivityBtn();
		new MAddOnlineActivityPagePOM().SelectingTOADropDown();
		new MAddOnlineActivityPagePOM().SelectingAADropDown();
		new MAddOnlineActivityPagePOM().EnterWeightage();
		new MAddOnlineActivityPagePOM().ClickAddLink();
		new MAddOnlineActivityPagePOM().clickEditLink();
		new MEditlinkPagePOM().EnterWeightage();
		new MEditlinkPagePOM().UpdateWeightage();
		
		String asm = new MAddOnlineActivityPagePOM().getMessageText();
		if (asm.contains("Assessment edited"))  {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		new MAddOnlineActivityPagePOM().ClickAddCertificate();
		String dt = new MDefaultCertificatePagePOM().getDefaultText();
		if (dt.contains("Default certificate"))  {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
	}
		
		@AfterMethod
		public void AfterMethod() {
            logout();
			closeBrowser();

		}
		
}
	

