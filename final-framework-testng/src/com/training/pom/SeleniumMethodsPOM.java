package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMethodsPOM {

	public static RemoteWebDriver driver;
	public void startapp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\ibm automation\\selenium-java-3.141.59 (1)\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		}
	public void selectDropDownUsingText(WebElement ele, String value) {
		Select sel=new Select(ele);
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
}
