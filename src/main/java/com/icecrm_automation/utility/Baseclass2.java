package com.icecrm_automation.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass2 {
	   public WebDriver driver;

	public void launchbrowser(String browser) {
		switch(browser) {
		case "chrome":
			System.setProperty("driver.chrome.driver", "chromedriver.exe");
	    driver= new ChromeDriver();
		    break;
		case "edge":
			System.setProperty("driver.edge.driver", "msedgedriver.exe");
		 driver= new EdgeDriver();
		    break;
		case "firefox":
			System.setProperty("driver.gecko.driver", "geckodriver.exe");
		  driver= new FirefoxDriver();
		    break;
		default:                                                            // No need to provider browser
			System.setProperty("driver.edge.driver", "msedgedriver.exe");
	  driver= new EdgeDriver();
	    
		
	}
	}
	public void enterText(By by, String text) {
		try {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		driver.findElement(by).sendKeys(text);
				
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		}
	public void click(By by) {
		try {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(by));
		driver.findElement(by).click();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}


