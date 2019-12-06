package com.training.medium.tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.pom.CoursePagePOM;
import com.training.pom.LoginPagePOM;
import com.training.pom.MAddIntroductionPagePOM;
import com.training.pom.MCreateNewTestPagePOM;
import com.training.pom.MMultipleChoicePagePOM;
import com.training.pom.MOnlineQuizPagePOM;
import com.training.pom.MResultPagePOM;
import com.training.pom.MStartTestPagePOM;
import com.training.pom.MTestPagePOM;
import com.training.pom.MTestaddedConfmPagePOM;
import com.training.pom.RegisterPagePOM;
import com.training.pom.BaseClassPOM;

public class ELTCMediumSecondTest extends BaseClassPOM {

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
	public void VerifyTestFunctions() throws InterruptedException {

		new MAddIntroductionPagePOM().clickTestLink();
		new MTestPagePOM().ClickCreateTestLink();
		new MCreateNewTestPagePOM().UpdateDetails();
//		Boolean RB = new MCreateNewTestPagePOM().FBackRadBtn();
//		Assert.assertTrue(RB);
		new MCreateNewTestPagePOM().ClickProceedLink();

		String tcm = new MTestaddedConfmPagePOM().getMessage();
		if (tcm.contains("Exercise added")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		new MTestaddedConfmPagePOM().ClickMClink();
		new MMultipleChoicePagePOM().First_GiveDetails();
		String qam1 = new MTestaddedConfmPagePOM().getQuizMessage1();
		if (qam1.contains("1 questions, for a total score (all questions) of 0.")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		new MTestaddedConfmPagePOM().ClickMClink();
		new MMultipleChoicePagePOM().Second_GiveDetails();
		String qam2 = new MTestaddedConfmPagePOM().getQuizMessage2();
		if (qam2.contains("2 questions, for a total score (all questions) of 0.")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		new MTestaddedConfmPagePOM().ClickPreviewButton();
		new MStartTestPagePOM().ClickStartTest();

		new MOnlineQuizPagePOM().radioValue1();

		new MOnlineQuizPagePOM().GoToNextQuestion();
		new MOnlineQuizPagePOM().radioValue2();
		new MOnlineQuizPagePOM().EndTest();
		new MResultPagePOM().GetQuizSaveMessage();
		new MResultPagePOM().GetResultSaveMessage();
		String qsm = new MResultPagePOM().GetQuizSaveMessage();
		if (qsm.contains("Saved.")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		String rsm = new MResultPagePOM().GetResultSaveMessage();
		if (rsm.contains("Online Quiz : Result")) {
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
