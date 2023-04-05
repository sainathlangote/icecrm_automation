package com.icecrm_automation.practise;

import org.openqa.selenium.WindowType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icecrm_automation.utility.BaseClass;

public class WindowHandling2 extends BaseClass {
	@BeforeClass
	public void beforeclass() {
	System.out.println("Launching the browser");
	luanchBrowser("edge");
	}
	
	@Test
	public void verifychangingnewwindow() {
		try {
		driver.navigate().to("https:/google.com");
		String Firsttabid= driver.getTitle();
		System.out.println("firsttab id " + Firsttabid);
		String firsttabid= driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https:/amazon.in");
		String secondwindowid= driver.getTitle();
		System.out.println(secondwindowid);
		driver.close();
		driver.switchTo().window(Firsttabid);
		System.out.println("Here window switch back to first tabid");
		driver.quit();

		
		
	} catch(Exception e) {
	}
	}

}
