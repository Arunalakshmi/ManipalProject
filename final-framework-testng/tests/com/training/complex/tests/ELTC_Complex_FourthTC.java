package com.training.complex.tests;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import com.training.pom.CAdministrationPagePOM;
import com.training.pom.CCourseCatalogPagePOM;
import com.training.pom.CLearnerCourseDetailPagePOM;
import com.training.pom.CLearnerDetailsPagePOM;
import com.training.pom.CLearnersPagePOM;
import com.training.pom.CReportingPagePOM;
import com.training.pom.CoursePagePOM;
import com.training.pom.LoginPagePOM;
import com.training.pom.MAddIntroductionPagePOM;
import com.training.pom.MAddnewcoursepgPOM;
import com.training.pom.MCourseDescriptionPagePOM;
import com.training.pom.MDescriptionPagePOM;
import com.training.pom.MObjectivePagePOM;
import com.training.pom.MTopicsPagePOM;

import com.training.pom.BaseClassPOM;

public class ELTC_Complex_FourthTC extends BaseClassPOM {

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

	}
//Teacher Login 
	@Test(priority = 1)
	public void PerformTeacherTask() throws InterruptedException {
		new LoginPagePOM().clicklogin1();
		new CoursePagePOM().clickCreateaCourseLink();
		new MAddnewcoursepgPOM().Updatecoursedetails2().clickSubmit();
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
//Student Login 
	@Test(priority = 2)
	public void PerformStudentTask() throws InterruptedException {

		new LoginPagePOM().clicklogin();
		new CoursePagePOM().ClickCCLink();
		new CCourseCatalogPagePOM().EnterCourseName();
		new CCourseCatalogPagePOM().ClickSearchBtn();
		new CCourseCatalogPagePOM().ClickSubscribehBtn();

//		String message = new CCourseCatalogPagePOM().getmessage();
//		if (message.contains("User josh bosh josh has been registered to course new TESTSELENIUM")) {
//			System.out.println("Test Passed");
//		} else {
//			System.out.println("Test Failed");
//		}

	}
	
	//Admin Login 

	@Test(priority = 3)
	public void PerformAdminTask() throws InterruptedException {
		new LoginPagePOM().clicklogin2();
		new CAdministrationPagePOM().ClickReportLink();
		new CReportingPagePOM().ClickButton();
		new CLearnersPagePOM().EnterKW();
		new CLearnersPagePOM().ClickSearch();
		new CLearnersPagePOM().Clickicon();
		new CLearnerDetailsPagePOM().Clickicon();
		String cm = new CLearnerCourseDetailPagePOM().get_info();
		if (cm.contains("Achieved skills")) {
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
