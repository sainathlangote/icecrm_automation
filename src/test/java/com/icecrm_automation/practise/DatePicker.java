package com.icecrm_automation.practise;

import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icecrm_automation.utility.BaseClass;

public class DatePicker extends BaseClass {
	@BeforeClass
	public void beforeClass() {
		System.out.println("launching Browser and Navigate To ICEhrms URL ");
	
			luanchBrowser("edge");
			driver.get("https://icehrm.com/app/cybersuccess/login.php");
			String url=driver.getCurrentUrl();
			System.out.println(url);
			String title=driver.getTitle();System.out.println(title);
			driver.manage().window().maximize();

}
	@Test
	public void verifydatepickerfeature() {
		enterText(By.id("username"), "admin");
		enterText(By.id("password"), "2zuzfakn");
		click(By.xpath("//button[text()='Log in ']"));
		click(By.xpath("//span[text()='Employees']"));
		click(By.xpath("//ul[@id='admin_Employees']/li[1]/a"));
		click(By.xpath("//span[text()=' Add New']"));
		/*enterText(By.id("employee_id"),"101");
		enterText(By.id("first_name"),"john");
		enterText(By.id("middle_name"),"musk");
		enterText(By.id("last_name"),"bhai");*/
		WebElement nationality = driver.findElement(By.xpath("//input[@id='rc_select_0']"));
		nationality.click();
		List<WebElement> nationalitydropdown= driver.findElements(By.xpath("//div[@id='rc_select_0_list']/following-sibling::div/div/div/div/div/div"));
//		WebElement multivalue= driver.findElement(By.xpath("//div[@class='rc-virtual-list']/descendant::div"));
//		WebElement selectcountry= driver.findElement(By.xpath("//div[@class='ant-select-selector']"));
//		selectcountry.click();
//		List<WebElement> countrynames= driver.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
//		
		for(int i=0; i<nationalitydropdown.size(); i++) {
			WebElement element= nationalitydropdown.get(i);
		String value=	element.getText();
		System.out.println(value);
		if(value.equals("American")) {
//			System.out.println(value);
			break;
		}
		}
		/*String selectcountry= driver.findElement(By.xpath("//div[text()='American']")).getText();
		if(selectcountry.equals("American")) {
			System.out.println("American nationality selected");
		}else {
			System.out.println("American nationality not selected");

		}
		
		
//		System.out.println(countrynamelist);
		
	int currentDay= LocalDateTime.now().getDayOfMonth();
	driver.findElement(By.id("birthday")).click();
	List<WebElement> days = driver.findElements(By.xpath("//td[contains(@class,'ant-picker-cell ant-picker-cell-in-view')]/div"));
	for(WebElement element1: days) {
		String day= element1.getText();
		String today= String.valueOf(currentDay);
		if(day.equals(today)) {
			element1.click();
		}
	}*/
		}
		
		
	}

	
	
	
	
	

