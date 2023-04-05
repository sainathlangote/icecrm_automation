package com.icecrm_automation.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/*public class BaseClass {
	public WebDriver driver;

	public void launchbrowser(String launchbrowser) {

		switch (launchbrowser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case  "edge":
			System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		case  "firefox":
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
			
		default:
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			break;

		}
	
		}

	public void enterText(By by, String text) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.elementToBeClickable(by));
			driver.findElement(by).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click(By by) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(by));
			driver.findElement(by).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}*/


public class BaseClass {
   public WebDriver driver;
   public  void luanchBrowser(String browser) {   
	   switch (browser) {
	   case "chrome":
		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   driver = new ChromeDriver();
			break;
	   case "edge":
		   System.setProperty("webdriver.msedge.driver", "msedgedriver.exe");
		   driver = new EdgeDriver();
			break;
	   case "firefox":
		   System.setProperty("webdriver.gecko.driver", "firefoxdriver.exe");
		   driver = new FirefoxDriver();
			break;
	 default : 
		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   driver = new ChromeDriver();
			break;
	   }
	     }
   
   public void enterText(By by, String text) {
	   try {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   wait.until(ExpectedConditions.presenceOfElementLocated(by));
		   driver.findElement(by).sendKeys(text);
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   
   public void click(By by) {
	   try {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   wait.until(ExpectedConditions.presenceOfElementLocated(by));
		   driver.findElement(by).click();
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   
   
}
