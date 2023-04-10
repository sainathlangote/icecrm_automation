package com.icecrm_automation.practise;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icecrm_automation.utility.BaseClass;

public class Amazon extends BaseClass{

	@BeforeClass
	public void beforeClass() {
		System.out.println("launching Browser and Navigate To Amazon URL ");
	
			launchBrowser("chrome");
			driver.get("https://www.amazon.in/");
			String url=driver.getCurrentUrl();
			System.out.println(url);
			String title=driver.getTitle();
			System.out.println(title);
			driver.manage().window().maximize();
//			driver.close();
            
			
		}
	@Test
	public void loginWithValidCredentials() {
		System.out.println("Here we are login with valid inputs");
//		click(By.id("twotabsearchtextbox"));
//		enterText(By.id("twotabsearchtextbox"), "mobile");
//		click(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
//		WebElement dropdown=driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
//		Select select= new Select(dropdown);
//		select.selectByIndex(3);
//		select.getOptions();
		WebElement multivalue= driver.findElement(By.id("searchDropdownBox"));
		Select select=new Select(multivalue);
//		List<WebElement> dropdownvalues = select.getOptions();
//		for(int i=0; i<dropdownvalues.size(); i++) {
//			WebElement element= dropdownvalues.get(i);
//		  String dropdownvalue=  element.getText();
//		  System.out.println(dropdownvalue);
//		}
//		select.selectByVisibleText("Baby");
//		
//
//	}   
		System.out.println("printing all selected values from dropdown");
//		List<WebElement> dropdownvalues = select.getAllSelectedOptions();
//		for(int i=0; i<dropdownvalues.size(); i++) {
//			WebElement element= dropdownvalues.get(i);
//		  String dropdownvalue=  element.getAttribute("value");
//		  System.out.println(dropdownvalue);
//		}
//		select.selectByVisibleText("Alexa Skills");
		
		
		List<WebElement> dropdownvalues = select.getOptions();   //to get all option from dropdown
		for(int i=0; i<dropdownvalues.size(); i++) {             // to Iterate one by one 
			WebElement element= dropdownvalues.get(i);           // to print one by one value in the console
		  String dropdownvalue=  element.getAttribute("value");  
		  System.out.println(dropdownvalue);
		}
		select.selectByVisibleText("Alexa Skills");     // to select Alexa Skills from the dropdown
		

	}
	@AfterClass
	public void afterclass(){
		String url2=driver.getTitle();
		System.out.println(url2);
//		driver.close();
		driver.quit();

	}
	
	
}
//select[@id='searchDropdownBox']/descendant::option