package com.icecrm_automation.practise;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icecrm_automation.utility.BaseClass;

public class FrameHandling extends BaseClass {

	@BeforeClass
	public void beforeclass() {
		System.out.println("Launching the browser");
		launchBrowser("edge");
	}

	@Test
	public void Verifyframehandling() {
		driver.navigate().to("http://omayo.blogspot.com/");
		String input = "selenium";
		driver.switchTo().frame(driver.findElement(By.id("navbar-iframe"))); // here we locate iframe
		enterText(By.id("b-query"), "selenium"); // locate search field & enter text
		click(By.id("b-query-icon")); // click on search button
		driver.switchTo().defaultContent(); // switch control to default window
		String output = driver.findElement(By.xpath("//div[@class='status-msg-body']/b")).getText();
		if (output.equals(input)) {
			System.out.println("successful able to verify output text");
		} else {
			System.out.println("failed to verify output text");

		}

	}
}
