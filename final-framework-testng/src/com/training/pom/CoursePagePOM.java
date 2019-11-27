package com.training.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePagePOM extends SeleniumMethodsPOM {

	
	
		
		
		public CoursePagePOM()
		{
			
			PageFactory.initElements(driver, this);
			
		}
		
		public String Mycoursespage;
//		@FindBy(xpath="//*[@id=\'homepage-course\']/div")
//		WebElement loginsuccess_message;
//		@FindBy(xpath="//*[@id=\'profileCollapse\']/div/ul/li[5]/a")
//		WebElement profilelink;
		
		
		@FindBy(xpath="//section[@id='cm-content']//p[1]")
		WebElement loginsuccess_message;
		@FindBy(xpath="//a[contains(text(),'Edit profile')]")
		WebElement profilelink;
		
		public String getMessage()
		{
			 Mycoursespage = loginsuccess_message.getText();
			
			return Mycoursespage;
}
		
		public SocialNetworkpgPOM clickprofilelink()
		{
			
			profilelink.click();
			return new SocialNetworkpgPOM();
		}

}