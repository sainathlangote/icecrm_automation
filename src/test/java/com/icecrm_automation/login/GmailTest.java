package com.icecrm_automation.login;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icecrm_automation.utility.Baseclass2;

public class GmailTest extends Baseclass2 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("launching Browser and Navigate To gmail  ");
	
		launchbrowser("firefox");
		driver.navigate().to("https://cybersuccess.icehrm.com/");
		System.out.println(driver.getTitle());
	}
	@Test
	public void loginWithValidCredentials() {
		System.out.println("Here we are login with valid inputs");
	    enterText(By.id("username"), "admin");
	    enterText(By.id("password"),"2zuzfakn");
	    click(By.xpath("//button[contains(text(),'Log in')]"));
	 driver.getTitle();
	 
	

}
}

