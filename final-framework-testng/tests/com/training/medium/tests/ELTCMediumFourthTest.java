package com.training.medium.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.pom.CoursePagePOM;
import com.training.pom.LoginPagePOM;
import com.training.pom.MAddIntroductionPagePOM;
import com.training.pom.MAssignmentPagePOM;
import com.training.pom.MAssignmentSuccessPagePOM;
import com.training.pom.MCreateAssignmentPagePOM;
import com.training.pom.BaseClassPOM;

public class ELTCMediumFourthTest extends BaseClassPOM {

	public ELTCMediumFourthTest() {
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

	public void VerfiyAssignmentTest() {

		new MAddIntroductionPagePOM().clickAssignmentLink();
		new MAssignmentPagePOM().ClickNewAssignmentLink();
		new MCreateAssignmentPagePOM().EnterAssignmentName();
		new MCreateAssignmentPagePOM().MovetoFrame();
		new MCreateAssignmentPagePOM().EnterText();
		new MCreateAssignmentPagePOM().ClickAdvSettingLink();
		new MCreateAssignmentPagePOM().EnterMaxScore();
		new MCreateAssignmentPagePOM().ClickValidateBn();
		String SM = new MAssignmentSuccessPagePOM().GetSuccessMessage();
		if (SM.contains("Directory created")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		new MAssignmentSuccessPagePOM().ClickEditLink();
		new MCreateAssignmentPagePOM().EditMaxScore();
		new MCreateAssignmentPagePOM().ClickValidateBn();
		String UM = new MAssignmentSuccessPagePOM().GetSuccessMessage();
		if (UM.contains("Update successful")) {
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
