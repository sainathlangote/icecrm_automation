package com.icecrm_automation.practise;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icecrm_automation.utility.BaseClass;

public class WindowHandling extends BaseClass{
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("LAunching browser amazon");
		launchBrowser("edge");
		driver.navigate().to("https://www.amazon.in/");
	}
	@Test
	public void verifywindowhandling() {
		String parentwindowid= driver.getWindowHandle();
		System.out.println("first tab id " + parentwindowid);
		driver.manage().window().maximize();
		//click(By.xpath("//div[@id='navSwmHoliday']/a"));
		driver.findElement(By.xpath("//div[@id='navSwmHoliday']/a")).click();
	}

}
