package com.training.medium.tests;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import com.training.pom.ConfirmationPagePOM;
import com.training.pom.CoursePagePOM;
import com.training.pom.LoginPagePOM;
import com.training.pom.MAddIntroductionPagePOM;
import com.training.pom.MAddnewcoursepgPOM;
import com.training.pom.MCourseDescriptionPagePOM;
import com.training.pom.MDescriptionPagePOM;
import com.training.pom.MObjectivePagePOM;
import com.training.pom.MTopicsPagePOM;
import com.training.pom.RegisterPagePOM;
import com.training.pom.BaseClassPOM;

public class ELTCMediumFirstTest extends BaseClassPOM {

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

	}

	@Test(priority = 5)
	public void VerifyNewCourse() throws InterruptedException {
		new CoursePagePOM().clickCreateaCourseLink();
		new MAddnewcoursepgPOM().Updatecoursedetails1().clickSubmit();
		new MAddIntroductionPagePOM().ClickAddintrolink().Enterintroinfo().clickSaveIntroLink();
		String im = new MAddIntroductionPagePOM().getintroMessage();
		String igm = new MAddIntroductionPagePOM().getintroinfoMessage();

		if (im.contains("Intro was updated") && igm.contains("COBOL")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		new MAddIntroductionPagePOM().clickCourseDesLink();
		new MDescriptionPagePOM().clickDescriptionLink();
		new MCourseDescriptionPagePOM().UpdateDes_Details().clickSaveLink();
		String newdes_info = new MDescriptionPagePOM().DesText();
		new MDescriptionPagePOM().clickObjectiveLink();
		new MObjectivePagePOM().UpdateObj_Details().clickSaveLink();
		String newobj_info = new MDescriptionPagePOM().ObjText();
		new MDescriptionPagePOM().clicktopiclink();
		new MTopicsPagePOM().UpdateTopDetails().clickTopSaveLink();
		String newtop_info = new MDescriptionPagePOM().TopText();

		if (newdes_info.contains("The description has been updated")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		if (newobj_info.contains("The description has been updated")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		if (newtop_info.contains("The description has been updated")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
	}

	@AfterMethod
	public void AfterMethod() {
		logout();
		System.out.println("Logout success");
		closeBrowser();

	}

}
