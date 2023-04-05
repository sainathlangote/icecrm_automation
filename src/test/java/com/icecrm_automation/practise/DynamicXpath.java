package com.icecrm_automation.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icecrm_automation.utility.BaseClass;

public class DynamicXpath extends BaseClass {
	@BeforeClass
	public void beforeClass() {
		System.out.println("launching Browser and Navigate To Amazon URL ");
	
			luanchBrowser("edge");
			driver.get("https://www.amazon.in/");
			String url=driver.getCurrentUrl();
			System.out.println(url);
			String title=driver.getTitle();System.out.println(title);
			driver.manage().window().maximize();
	}
	@Test
	public void Verifymobile() throws InterruptedException {
		enterText(By.xpath("//input[@placeholder='Search Amazon.in']"), "mobile");
		click(By.id("nav-search-submit-button"));
		int totalResult;
		Thread.sleep(3000);
		List<WebElement> mobileresults= driver.findElements(By.xpath("//div[starts-with(@data-cel-widget, 'search_result_')]/descendant::h2//span"));
		totalResult= mobileresults.size();
		System.out.println("Total Result : "+ totalResult);
		
		for(int i=3; i<totalResult; i++) {
			try {
			String namepath= "//div[starts-with(@data-cel-widget, 'search_result_')][" + i + "]/descendant::h2//span";
			System.out.println(namepath);
			String pricepath="//div[starts-with(@data-cel-widget, 'search_result_')][" + i + "]/descendant::span[@class='a-offscreen']";
			System.out.println(pricepath);
			String mobilename= driver.findElement(By.xpath(namepath)).getText();
			String mobileprice= driver.findElement(By.xpath(pricepath)).getText();
			Thread.sleep(1000);
            System.out.println("Mobilename : "+ mobilename +"  Mobileprice  : "+ mobileprice );
		} catch(Exception e) {
			System.out.print(e.getMessage());
		}
		}
	}
		
		@AfterClass
		public void afterclass(){
			String url2=driver.getTitle();
			System.out.println(url2);
//			driver.close();
			driver.quit();
		
	}

	}
