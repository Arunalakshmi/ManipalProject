package com.training.pom;



	



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class EditMyProfilePOM extends SeleniumMethodsPOM {
		
		public EditMyProfilePOM()  {
			PageFactory.initElements(driver, this);	
			}	
		@FindBy(xpath ="//*[@id='login']")
		WebElement username;
		@FindBy(xpath ="//*[@id=\'password\']")
		WebElement password;
		@FindBy(xpath ="//*[@id=\'form-login_submitAuth\']")
	    WebElement login;
	
		
		
		
		
		
		public CoursePagePOM clicklogin()
		{
			username.sendKeys("kavisiva");
			password.sendKeys("kavitha123$");
			login.click();
			return new CoursePagePOM();
			
		}
		
				
				
		
		
	}


