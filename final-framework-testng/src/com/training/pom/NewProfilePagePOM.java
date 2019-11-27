package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProfilePagePOM extends SeleniumMethodsPOM {

	
	
		
		
		public NewProfilePagePOM()
		{
			
			PageFactory.initElements(driver, this);
			
		}
		
		public String profiletext;
//		@FindBy(xpath="//*[@id=\'cm-content\']/div/div[2]/div/div[1]")
//		WebElement newprofilepage;
		
		@FindBy(xpath="//div[@class='alert alert-info']")
		WebElement newprofilepage;
		
		
		public String getMessage()
		{
			 profiletext = newprofilepage.getText();
			
			return profiletext;
}
		
}