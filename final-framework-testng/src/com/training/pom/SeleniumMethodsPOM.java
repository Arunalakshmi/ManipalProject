package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

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
	
	
	
}
