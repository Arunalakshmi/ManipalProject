package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class BaseClassPOM {

	public static RemoteWebDriver driver;
	public String dataSheetName;

	public void startapp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\ibm automation\\selenium-java-3.141.59 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	public void logout() {

		WebElement logout_Toggle = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		WebElement logout_Btn = driver.findElement(By.id("logout_button"));

		logout_Toggle.click();
		logout_Btn.click();
		
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(value);
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();

	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();

	}

	@DataProvider(name = "FetchData")
	public Object[][] giveData() {
		return TestData.provideData(dataSheetName);
	}
}
